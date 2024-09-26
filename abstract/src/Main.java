public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("patriki", "123456789", "marechal", "123.456.789-10");
        PessoaJuridica pj = new PessoaJuridica("X", "987654321", "heitor vila lobos", "12.345.678/0001-90");

        System.out.println(pf);
        System.out.println("Identificação: " + pf.getIdentificacao());

        System.out.println();

        System.out.println(pj);
        System.out.println("Identificação: " + pj.getIdentificacao());
    }
}