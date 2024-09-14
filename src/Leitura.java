import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Scanner leitura2 = new Scanner(System.in);
        Scanner leitura3 = new Scanner(System.in);

        System.out.println("Digite seu nome?");
        String nome = leitura2.nextLine();


        System.out.println("Qual seu sobrenome?");
        String sobrenome = leitura3.nextLine();

        System.out.println("Digite seu filme favorito?");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento desse filme?");
        int anoLancamento = leitura.nextInt();

        System.out.println("Qual a sua avaliação para esse filme");
        double avaliacao = leitura.nextDouble();

        System.out.println("O "+nome +" " + sobrenome + " escolheu como filme favorito o  " +
                filme + ", dando a avaliação de " + avaliacao);


    }
}
