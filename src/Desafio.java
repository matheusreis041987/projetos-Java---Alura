import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        String nome;
        String tipoConta;
        double saldoInicial = 0.00;
        double deposito = 0;
        double transferencia = 0;
        int operacao = 1;
        Scanner leitura = new Scanner(System.in);
        int senha = 1234;
        int senhaDigitada;
        int contadadorSenha = 0;
        String conta;

        System.out.print("Entre com seu nome:");
        nome = leitura.nextLine();
        System.out.print("Entre com sua conta:");
        conta = leitura.nextLine();
        System.out.print("Entre com o tipo de conta:");
        tipoConta = leitura.nextLine();

        while (contadadorSenha != 3){
            System.out.println("Entre com sua senha (4 dígitos):");
            senhaDigitada = leitura.nextInt();
            contadadorSenha++;
            if (senhaDigitada != senha){
                System.out.println("Senha inválida");
            } else {
                break;
            }
            if (contadadorSenha == 3){
                System.out.println("Senha Bloqueada. Favor buscar uma agência para desblequeá-la.");
                System.exit(0);
            }
        }


        System.out.println("\n **********************************************");
        System.out.println("Dados iniciais do cliente: \n");
        System.out.println("Nome:                 " + nome);
        System.out.println("Conta:                " + conta);
        System.out.println("Tipo de Conta:        " + tipoConta);
        System.out.println("Saldo Inicial:        " + saldoInicial + "\n");
        System.out.println("********************************************** \n");

        System.out.println("Operações \n");
        System.out.println("1 - Consultar Saldos");
        System.out.println("2 - Receber Valor");
        System.out.println("3 - transferir Valor");
        System.out.println("4 - Sair");
        System.out.println("**********************************************");
        System.out.println("");

        while (operacao != 4){
            System.out.println("Digite a operação desejada:");
            System.out.print("(1 - Consultar Saldos |");
            System.out.print(" 2 - Receber Valor |");
            System.out.print(" 3 - transferir Valor |");
            System.out.print(" 4 - Sair) \n");

            operacao = leitura.nextInt();

            if(operacao == 1){
                System.out.println("Prezado(a) " + nome +", \n Seu saldo é de R$ " + saldoInicial);
                System.out.println("");

            } else if (operacao == 4){
                System.out.println("Obrigado por usar nosso atendimento! Volte sempre.");
                System.out.println("");
                break;
            } else if (operacao == 2) {
                System.out.print("Digite o valor que deseja depositar: ");
                deposito = leitura.nextDouble();

                    if (deposito < 0){
                        System.out.println("Não pode haver depósito negativo \n");

                    } else {
                        saldoInicial = saldoInicial + deposito;
                        System.out.println("Foi depositado em sua conta o valor de R$ " + deposito + "\n");

                    }


            } else if (operacao == 3){
                System.out.print("Digite o valor que deseja transferir: ");
                transferencia = leitura.nextDouble();

                    if(transferencia < 0){
                        System.out.println("Não pode haver transferência negativo \n");

                    } else if (transferencia > saldoInicial){
                        System.out.println("Operação inválida: Valor de transferência maior que saldo atual \n");

                    } else {
                        saldoInicial = saldoInicial - transferencia;
                        System.out.println("Foi transferido de sua conta o valor de R$ " + transferencia + "\n");

                    }


            } else {
                System.out.println("Opção inválida: Digite um valor entre 1 e 4 \n");

            }


        }


    }
}
