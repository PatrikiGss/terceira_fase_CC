/*
 * 
 * 
 * 1) Crie um objeto da classe Conta 
 * 2) Inicialize todos os atributos deste objeto 
 * 3) Imprima os valores dos atributos da classe Conta de forma a obter o seguinte resultado:
 * 
 * ----------------------------- 
 * AGENCIA: 1 BANCO : 234 
 * NUMERO : 01945 
 * TITULAR: Maria
 * SALDO : R$10000.0
 * -----------------------------
 * 
 * Sugestoes: 
 * Utilizando '\t' para tab
 * Ex: System.out.println("Texto\tTexto");
 * 
 * voce produzira a seguinte saida: 
 * Texto  Texto
 */
class TestaConta {

    public static void main(String[] args) {
        Conta conta= new Conta(18.000,"12343","patriki",0656-4,1);
         System.out.println("-----------------------------");
        System.out.println("saldo: "+conta.getSaldo()+" numero: "+conta.getNumero()+" titular: "+conta.getTitular()+" agencia: "+conta.getAgencia()+" banco: "+conta.getBanco());
         System.out.println("-----------------------------");
    }
}
