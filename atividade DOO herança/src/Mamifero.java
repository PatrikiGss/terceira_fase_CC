
public class Mamifero extends Animal {
      
    private String alimento;

    public Mamifero( String nome, double comprimento, int numPatas, String cor, String ambiente, double velMedia,String alimento) {
        super(nome, comprimento, numPatas, cor, ambiente, velMedia);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "alimento=" + alimento + super.toString()+ '}';
    }
    
    
    
}
