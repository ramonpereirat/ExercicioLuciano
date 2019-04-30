public class FuncionarioV1 {
    double salario;
    String nome;
    String departamento;
    String dataDeEntrada;
    String rg;
    boolean ativo = true; 
    void bonifica(double aumento){
        salario = salario + (salario * aumento);
        
    }
    void demite(){
        ativo = false;
    }    
}