

class Task:
    def __init__(self, offset, computation_time, period_time, deadline):
        self.offset = offset
        self.computation_time = computation_time
        self.period_time = period_time
        self.deadline = deadline
        self.completion_time = 0
        self.waiting_time = 0

    def set_completion_time(self, completion_time):
        self.completion_time = completion_time

    def set_waiting_time(self, waiting_time):
        self.waiting_time = waiting_time

    def __str__(self):
        return f"Offset: {self.offset}, Computation Time: {self.computation_time}, Period Time: {self.period_time}, Deadline: {self.deadline}, Completion Time: {self.completion_time}, Waiting Time: {self.waiting_time}"

def main():
    with open('src/main/java/resources/exemplo_sched_rm.json') as f:
        data = json.load(f)
    
    tasks_data = data['tasks']
    scheduler_name = data['scheduler_name']

    tasks = [Task(task['offset'], task['computation_time'], task['period_time'], task['deadline']) for task in tasks_data]

    if scheduler_name.lower() == "fcfs":
        simulate_fcfs(tasks)
    elif scheduler_name.lower() == "rr":
        simulate_rr(tasks, 2)
    elif scheduler_name.lower() == "rm":
        simulate_rm(tasks)
    elif scheduler_name.lower() == "edf":
        simulate_edf(tasks)
    else:
        print("Nome de escalonador inválido: ", scheduler_name)

def simulate_fcfs(tasks):
    execution_sequence = []
    current_time = 0
    total_waiting_time = 0

    for task in tasks:
        execution_sequence.append(task)
        total_waiting_time += current_time - task.offset
        current_time += task.computation_time
        task.set_completion_time(current_time)

    average_waiting_time = total_waiting_time / len(tasks)
    average_turnaround_time = calculate_average_turnaround_time(execution_sequence)
    print_results("FCFS", execution_sequence, average_waiting_time, average_turnaround_time)

def simulate_rr(tasks, time_quantum):
    execution_sequence = []
    ready_queue = tasks.copy()
    current_time = 0
    total_waiting_time = 0

    while ready_queue:
        current_task = ready_queue.pop(0)
        execution_time = min(time_quantum, current_task.computation_time)
        execution_sequence.append(current_task)
        total_waiting_time += current_time - current_task.offset
        current_time += execution_time
        current_task.set_completion_time(current_time)
        current_task.computation_time -= execution_time
        if current_task.computation_time > 0:
            ready_queue.append(current_task)

    average_waiting_time = total_waiting_time / len(tasks)
    average_turnaround_time = calculate_average_turnaround_time(execution_sequence)
    print_results("RR", execution_sequence, average_waiting_time, average_turnaround_time)

def simulate_rm(tasks):
    tasks.sort(key=lambda x: x.period_time)
    execution_sequence = []
    current_time = 0

    for task in tasks:
        execution_sequence.append(task)
        current_time += task.computation_time
        task.set_completion_time(current_time)

    average_waiting_time = calculate_average_waiting_time(execution_sequence)
    average_turnaround_time = calculate_average_turnaround_time(execution_sequence)
    print_results("RM", execution_sequence, average_waiting_time, average_turnaround_time)

def simulate_edf(tasks):
    execution_sequence = []
    current_time = 0

    while tasks:
        next_task = find_task_with_earliest_deadline(tasks)
        if next_task.offset <= current_time:
            execution_sequence.append(next_task)
            current_time += next_task.computation_time
            next_task.set_completion_time(current_time)
            next_task.set_waiting_time(current_time - next_task.computation_time - next_task.offset)
            tasks.remove(next_task)
        else:
            current_time += 1

    average_waiting_time = calculate_average_waiting_time(execution_sequence)
    average_turnaround_time = calculate_average_turnaround_time(execution_sequence)
    print_results("EDF", execution_sequence, average_waiting_time, average_turnaround_time)

def find_task_with_earliest_deadline(tasks):
    earliest_deadline_task = min(tasks, key=lambda x: x.deadline)
    return earliest_deadline_task

def calculate_average_waiting_time(tasks):
    return sum(task.waiting_time for task in tasks) / len(tasks)

def calculate_average_turnaround_time(tasks):
    return sum(task.completion_time for task in tasks) / len(tasks)

def print_results(scheduler_name, execution_sequence, average_waiting_time, average_turnaround_time):
    print("Resultados da simulação " + scheduler_name + ":")
    print("Sequência de execução:")
    for task in execution_sequence:
        print(task)
    print("Tempo médio de espera:", average_waiting_time)
    print("Tempo médio de turnaround:", average_turnaround_time)

if __name__ == "__main__":
    main()
