package arvore.binarias;
public class ArvoreBinarias {
    public static void main(String[] args) {
  Arvore_Binaria tree=new Arvore_Binaria();
  tree.inserir(50);
    tree.inserir(20);
      tree.inserir(30);
        tree.inserir(70);
          tree.inserir(10);
            tree.inserir(80);
              tree.inserir(60);
                tree.inserir(30);
        System.out.println("Estrutura da Árvore Binária:");
        tree.imprimeArvore();
                
                
                if(tree.procura(60)){
                    System.out.println("valor 60 encontrado");}
                else{
                    System.out.println("valor nao encontrado");
                }
                
    }    
}
