public class ConverterTemperatura {

    public static void main(String[] args) {

        int celcuis = 22;
        double fahrenheit = (celcuis * 1.8) + 32;
        int temperaturaInteira = (int) fahrenheit;

        System.out.println("""
                
                A temperatura em %dº Celcuis, quando convertido em  fahrenheit
                temos o resultado de %.1f F
                
                """.formatted(celcuis,fahrenheit));

        System.out.println("Temperatura em fahrenheit: " + temperaturaInteira + "F");
    }
}
