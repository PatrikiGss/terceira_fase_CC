
public class TestaAnimais {
    
    public static void main(String[] args) {
        Mamifero caramelo = new Mamifero("caramelo ", 150 , 4 ,"amarelo ", "terra ", 2.0 , "leite" );
        Peixe tubarao = new Peixe("tilapia ", 20, 0,"cinzento ", "mar ",1.5," cauda");
        Mamifero urso = new Mamifero("urso-do-canada ", 180, 4, "vermelho ", "terra ", 0.5, "mel");
        System.out.println("dog caramelo "+caramelo.toString());
        System.out.println("peixe "+tubarao.toString());
        System.out.println("urso "+urso.toString());
    }
}
