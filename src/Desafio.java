import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        Scanner leitura = new Scanner(System.in);
        String opcao;
        boolean fimPgm = false;
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;
        double saldoAtual = saldoInicial;
        double valor;
        String nome = "Luis Eduardo";
        String msginicial;
        msginicial = """
                **********************************
                Dados iniciais do cliente
                  
                Nome..........: %s
                Tipo conta....: %s
                Saldo inicial.: R$ %f
                **********************************
                """.formatted(nome, tipoConta, saldoInicial) ;
        System.out.println(msginicial);
        String menu;
        menu = """
                Menu de Operações:
                   1 - Consulta saldos
                   2 - Receber valor
                   3 - Transferir valor
                   4 - Sair
                   """;
        while (!fimPgm) {
            System.out.println(menu);
            System.out.println("Digite a opção desejada:");
            opcao = entrada1.nextLine();
            switch (opcao) {
                case "1":
                    System.out.println("Seu saldo é R$" + saldoAtual);
                    break;
                case "2":
                    System.out.println("Qual valor que deseja transferir?");
                    valor = leitura.nextDouble();
                    if (valor > saldoAtual) {
                        System.out.println("Saldo insuficiente!");
                    }
                        else {
//                            saldoAtual = saldoAtual - valor;
                            saldoAtual -= valor;
                            System.out.println("Valor transferido! Saldo atualizado = R$" + saldoAtual);
                            System.out.println(" ");
                        }
                    break;
                case "3":
                    System.out.println("Valor recebido:");
                    valor = leitura.nextDouble();
//                            saldoAtual = saldoAtual + valor;
                    saldoAtual += valor;
                    System.out.println("Saldo atualizado R$ " + saldoAtual);
                    break;
                case "4":
                    fimPgm = true;
                    System.out.println("Saindo...volte sempre!");
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        }
    }
}
