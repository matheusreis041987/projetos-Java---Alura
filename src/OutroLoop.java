import java.util.Scanner;

public class OutroLoop {

    public static void main(String[] args) {

        double mediaAvaliacao = 0;
        double nota = 0;
        int iterador2 = 0;
        int totalDeNotas = 0;
        String saida = null;

        Scanner leitura = new Scanner(System.in);

        //System.out.println("Quantas avaliações deverão ser apresentadas?");
       // int repeticoes = leitura.nextInt();
        System.out.println("Para parar a contagem basta digitar -1");
        while (nota != -1) {
            System.out.println("Qual a sua avaliação para esse filme (" + (iterador2 += 1) + "ª - avaliação)");
            nota = leitura.nextDouble();

            if (nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            }


        }
        System.out.println("Quantidade de avaliações: "+ totalDeNotas);
        System.out.println("Média de avaliação: " + mediaAvaliacao / totalDeNotas );
    }
}
