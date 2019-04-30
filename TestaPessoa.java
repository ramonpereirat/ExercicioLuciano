public class TestaPessoa {
    public static void main(String[] args){
        Pessoa p0 = new Pessoa();
        p0.nome = "Robert Dwoney Jr.";
        p0.idade = 17;
        
        System.out.println("Nome: "+p0.nome+"Idade: "+p0.idade);
        
        p0.fazAniversario();
        
        System.out.println("Nome: "+p0.nome+"Idade: "+p0.idade);
        
        p0.fazAniversario();
        
        System.out.println("Nome: "+p0.nome+"Idade: "+p0.idade);
        
    }
}