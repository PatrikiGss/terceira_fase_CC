package frame.gui;

public class Cliente {

    private String nome;
    private String telefone;
    private String cpf;
    private int id;


    public Cliente(String nome, String telefone, String cpf, int id) {
        this(nome, telefone, cpf);
        this.id = id;
    }

    /**
     * Este construtor podera ser utilizado quando o id do cliente precisar ser atribuido depois, como por exemplo
     * quando for necessario criar o cliente para salvar no banco de dados, onde o id e gerado automaticamente.
     *
     * @param nome     Nome do cliente
     * @param telefone Telefone do cliente
     * @param cpf      CPF do cliente
     */
    public Cliente(String nome, String telefone, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    // Getters e setters omitidos para brevidade

    public String toString() {
        String cliente = " ID [" + this.id + "]";
        cliente += this.nome + "\t CPF (" + this.cpf + " ) \t";
        cliente += "- Tel: {" + this.telefone + "}";
        return cliente;
    }

    public boolean equals(Object o) {
        if (o instanceof Cliente) {
            Cliente cli = (Cliente) o;
            return cli.getCpf().equals(this.cpf);
        } else {
            return false;
        }
    }

    private Object getCpf() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
