public class TestaPorta {
    public static void main(String[] args){
        Porta p1 = new Porta();
        p1.dimensaoX = 0.80;
        p1.dimensaoY = 1.90;
        p1.dimensaoZ = 0.10;
        p1.cor = "vermnelho";

        p1.abre();
        
        System.out.println("Domensões  porta: "+p1.dimensaoX+" "+p1.dimensaoY+" "+p1.dimensaoZ);
        System.out.println("Cor porta: "+p1.cor);
        p1.estaAberta();
        
        p1.fecha();
        
        System.out.println("Domensões da porta: "+p1.dimensaoX+" "+p1.dimensaoY+" "+p1.dimensaoZ);
        System.out.println("Cor porta: "+p1.cor);
        p1.estaAberta();        

        p1.abre();
        
        p1.pinta("branco");
        
        System.out.println("Domensões  porta: "+p1.dimensaoX+" "+p1.dimensaoY+" "+p1.dimensaoZ);
        System.out.println("Cor  porta: "+p1.cor);
        p1.estaAberta();  
         
    }
}