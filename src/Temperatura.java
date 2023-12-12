import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        System.out.println("Converter Celsius para Fahrenheit");
        Scanner Temp = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius:");
        var Celsuis = Temp.nextDouble();
        double Fahrenheit = (Celsuis * 1.8) + 32;
        System.out.println("Em Fahrenheit é: " + Fahrenheit );
        int Fahrenheit2 = (int) Fahrenheit;
        System.out.println("sem decimal: " + Fahrenheit2 );

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", Celsuis, Fahrenheit);
        System.out.println(mensagem);
    }
    }