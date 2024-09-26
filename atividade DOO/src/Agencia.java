/*
 * 
 * 1) Adicione os seguintes atributos na classe Agencia:
 * - numero (String)  
 * - banco (int) 
 */
class Agencia {
    private String numero;
    private String banco;

    public Agencia(String numero, String banco) {
        this.numero = numero;
        this.banco = banco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
   
}
