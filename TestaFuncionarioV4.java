public class TestaFuncionarioV4 {
    public static void main(String[] args){
        //////////////////////////
        FuncionarioV4 f4 = new FuncionarioV4 ();
        f4.nome = "Viuva negra";
        f4.rg = "18.859.456";
        f4.departamento = "Vingadora";
        f4.salario = 4900.00;
        f4.ativo = true;           
        
        Data df4 = new Data();
        df4.dia = 15;
        df4.mes = 02;
        df4.ano = 2018;  
        /////////////////////////
        FuncionarioV4 f5 = new FuncionarioV4 ();
        f5.nome = "Steve Rogers";
        f5.rg = "19.859.547";
        f5.departamento = "Heroi";
        f5.salario = 4900.00;
        f5.ativo = true;
        
        Data df5 = new Data();
        df5.dia = 15;
        df5.mes = 02;
        df5.ano = 2018; 
        
        f4.mostra();
        System.out.println("Data  entrada: "+df4.dia+"/"+df4.mes+"/"+df4.ano);
        
        f5.mostra();
        System.out.println("Data entrada: "+df5.dia+"/"+df5.mes+"/"+df5.ano);
        
         f4.equals(f5);
     
    }
}