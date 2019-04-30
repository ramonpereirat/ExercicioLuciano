public class TestaFuncionarioV3 {
    public static void main(String[] args){
        //////////////////////////
        FuncionarioV3 f3 = new FuncionarioV3 ();
        f3.nome = "Eu sou invitavel";
        f3.rg = "55.516.666";
        f3.departamento = "Dominador do universo";
        f3.salario = 4900.00;
        f3.ativo = true;
        
        Data d = new Data();
        d.dia = 15;
        d.mes = 02;
        d.ano = 2018;  
        
        f3.mostra();
        System.out.println("Data entrada: "+d.dia+"/"+d.mes+"/"+d.ano);
        
     }
}