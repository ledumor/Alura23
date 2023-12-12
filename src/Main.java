import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen MATCH");
        int ano = 2022;
        int anoDeLancamento = 2023;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String nomeDoFilme;
        //media calculada
        double media = (9.8 + 6.3 + 4)/3;
        System.out.println(media);
        String sinope;
        String nomeFilme = "Top Gun";
        sinope = "Filme de aventura com ator Tom Crus";
        System.out.println(sinope);
        sinope = """
                Sipope do Filme %s
                Avalidação Geral: Muito Bom!
                lançamento em %d """ .formatted(nomeFilme, ano) ;
        System.out.println(sinope);
        String saudacao = "Olá, meu nome é ";
        String nome = "Alice ";
        String continuacao = "e minha idade é ";
        int idade = 17;
        System.out.println(saudacao + nome + continuacao + idade);
        }
    }