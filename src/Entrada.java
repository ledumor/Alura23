import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("filme");
        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Diga sua avaliação para o filme");
        // entrada com decimal eh com virgula (teclado br)
        double avaliacao = leitura.nextDouble();
        System.out.println("filme = " + filme);
        System.out.println("anoDeLancamento = " + anoDeLancamento);
        System.out.println("avaliacao = " + avaliacao);
    }
}