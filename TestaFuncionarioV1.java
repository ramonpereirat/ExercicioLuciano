public class TestaFuncionarioV1 {
    public static void main(String[] args){
        //////////////////////////
        FuncionarioV1 f1 = new FuncionarioV1 ();
        f1.nome = "Ramon";
        f1.rg = "17.251.547";
        f1.departamento = "comercio exterior";
        f1.salario = 1800.00;
        f1.dataDeEntrada = "26/04/2019";
        f1.ativo = true;
        /////////////////////////
        f1.bonifica(0.1); //aumenta salário em 10%
        f1.demite();      //demite o funcionário
        /////////////////////////
        System.out.println("Sistema Gerenciador ");
        System.out.println( "Nome: "+f1.nome+
                            "RG: "+f1.rg+
                            "comercio exterior: "+f1.departamento+
                            "Salário: "+f1.salario+
                            "Data entrada: "+f1.dataDeEntrada+
                            "Estatus: "+f1.ativo+"ok");
    }
                       
 }