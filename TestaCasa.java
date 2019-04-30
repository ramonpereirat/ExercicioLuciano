public class TestaCasa {
    public static void main(String[] args){
        
        Casa a = new Casa();
        a.cor = "vemelha";
        a.porta1 = true;
        a.porta2 = false;
        a.porta3 = true;
        
        System.out.println("Cor casa: "+a.cor);
        System.out.println("abertas "+a.quantasPortasEstaoAbertas());
        
        a.pinta("Azul");
        System.out.println("Cor casa: "+a.cor);
        System.out.println("abertas: "+a.quantasPortasEstaoAbertas());
        
        Casa b = new Casa();
        b.cor = "azul";
        b.porta1 = false;
        b.porta2 = false;
        b.porta3 = false;
        
        System.out.println("Cor casa: "+b.cor);
        System.out.println("abertas: "+b.quantasPortasEstaoAbertas());
        
        b.pinta("vermelhoo");
        System.out.println("Cor  casa: "+b.cor);
        System.out.println(" abertas: "+b.quantasPortasEstaoAbertas());
    }
}