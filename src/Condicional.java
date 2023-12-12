public class Condicional {
    public static void main(String[] args){
        int anoDeLancamento = 2024;
        boolean incluidoNoPlano = false;
        double  notaDoFilme = 8.1;
        String tipoPlano = "plus";
        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento de filmes novos");
        } else {
            System.out.println("Filmes antigos");
        } // || = 'OR' ; && = 'AND'
        if (incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("liberado para assistir");
        } else {
            System.out.println("Pague 49,90 em 4k");
        }
        switch (anoDeLancamento) {
            case 2022:
                System.out.println("ano 2022");
                break;
            case 2023:
                System.out.println("ano 2023");
                break;

            default:
                System.out.println("OUTROS ANOS");
                break;
        }
    }
}
