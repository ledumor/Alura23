import java.util.Scanner;
import java.util.*;
public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero = new Random().nextInt(10);
        int tentativas2 = 2;
        int tentativas = 0;
        tentativas = tentativas2;
        int valor = 0;
        String msg;
        msg = """ 
            Adivinhe um número de 0 a 10 em %d tentativas
            """.formatted(tentativas);
        System.out.println(msg);
        while (tentativas >= 1) {

            valor = leitura.nextInt();
            tentativas--;
            if (valor == numero) {
                System.out.println("Parabens vc acertou! é o nro = " + numero);
                break;
            } else if (valor > numero) {
                System.out.println("muito pra cima, tente novamente! Restam " + tentativas + " tentativas");
            } else {
                System.out.println("muito para baixo, tente novamente! Restam " + tentativas + " tentativas");
            }
            if (tentativas == 0) {
                msg = """
                Você não conseguiu adivinha o numero em %s tentativas. O número era %d
                        """.formatted(tentativas2, numero);
            System.out.println(msg);
            }
        }
    }
}