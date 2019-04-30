public class FuncionarioV4 {
    double salario;
    String nome;
    String departamento;
    Data dataDeEntrada;
    String rg;
    boolean ativo = true; 
    void bonifica(double aumento){
        salario = salario + (salario * aumento);
        
    }
    void demite(){
        ativo = false;
    }    
    
    void mostra(){
     System.out.println("Sistema Gerenciador ");
     System.out.println("Nome: "+nome);
     System.out.println("RG: "+rg);
     System.out.println("Departamento: "+departamento);
     System.out.println("Salário: R$"+salario);
  
     System.out.println("Status: "+ativo);
    }
  
       boolean equals(FuncionarioV4 outro) {
           
       if(this.nome.equals(outro.nome) && (this.rg.equals(outro.rg))){
           System.out.println("\nALERTA: Funcionário(a) " + this.nome + " já cadastrado(a) no sistema");
           return true;
           
       }
       else {
            return false;
       }
       }    
    
        
}    