public class MainTemperatura {
    public static void main(String[] args){
        
        Temperatura t = new Temperatura();
           
        double resultado;        
        resultado = t.converterParaFarenheit(32); 
         System.out.println("69°C >> Fahrenheit: " + resultado+"°F");
        
        resultado = t.converterParaCelcius(79);
        System.out.println("666°F >> Celsius: " + resultado+"°C");
    }
}