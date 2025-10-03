import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite a temperatura em Celsius (C): ");
        double celsius = sc.nextDouble();

      
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

       
        String resultado = String.format("""
            --- Conversao de Temperatura ---
            Temperatura em Celsius: %.2f C
            Temperatura em Fahrenheit: %.2f F
            Temperatura em Kelvin: %.2f K
            """, celsius, fahrenheit, kelvin);

        System.out.println(resultado);

        sc.close();
    }
}