public class FuncionarioV2 {
    double salario;
    String nome;
    String departamento;
    String dataDeEntrada;
    String rg;
    boolean ativo = true; 
    String mostra;
    
   
    void bonifica(double aumento){
        salario = salario + (salario * aumento);
        
    }
    void demite(){
        ativo = false;
    }    
    
    void mostrar(){
      
       System.out.println("Sistema Gerenciador"+
               nome+"\nRG: "+
               rg+"\nDepartamento: "+
               departamento+"\nSalário: R$"+
               salario+"\nData de entrada: "+
               dataDeEntrada+"\nEstatus: "+
               ativo+"\n****************************************************");
    }
}