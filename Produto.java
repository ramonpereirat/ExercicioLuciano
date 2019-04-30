public class Produto {
    
    String nome;
    double preco;
    
    void diminuir10(){
       preco = preco - (preco * 0.10);
       System.out.println(" Desconto de 10%");       
    }
    
    void aumenta25(){
      preco = preco * 1.25;
      System.out.println(" Aumento de 25%");
    }
    
}