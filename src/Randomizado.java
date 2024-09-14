import java.util.Random;
import java.util.Scanner;

public class Randomizado {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;
        System.out.println("Olá! Você terá somente 5 tentativas para acertar o número correto");
       // System.out.println(numeroGerado);
        while (tentativas < 5){
            System.out.println("Digite um número entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado){
                System.out.println("Parabens!! Você acertou o número");
                break;

            } else if (numeroDigitado < numeroGerado){
                System.out.println("O número digitado é menor que o numero gerado");
            } else {
                System.out.println("O número digitado é maior que o numero gerado");
            }

            if (tentativas ==5 && numeroDigitado != numeroGerado){
                System.out.println("Suas tentativas acabaram e você não conseguiu acertar");
                System.out.println("O número correto era: " + numeroGerado);
            }

        }

    }
}
