import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        double mediaAvaliacao = 0;
        double nota = 0;
        int quantavaliacao = 0;
        int iterador2 = 0;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Quantas avaliações deverão ser apresentadas?");
        int repeticoes = leitura.nextInt();

        for (int i = 0; i < repeticoes; i++) {
            System.out.println("Qual a sua avaliação para esse filme (" + (iterador2 += 1) + "ª - avaliação)");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
            i = quantavaliacao;
            quantavaliacao = quantavaliacao + 1;
        }
        System.out.println("Quantidade de avaliações: "+quantavaliacao);
        System.out.println("Média de avaliação: " + mediaAvaliacao / quantavaliacao );


    }
}
