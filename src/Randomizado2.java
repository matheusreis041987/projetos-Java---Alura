import java.util.Random;

public class Randomizado2 {

    public static void main(String[] args) {

        int numeroRandomizado1 = new Random().nextInt(10);
        int numeroRandomizado2 = new Random().nextInt(10);
        int tentativa = 0;
        int contadorTentativa = 1;

        while (tentativa < 20){
            tentativa++;
            System.out.println("Número randomizado 1: " + numeroRandomizado1);
            System.out.println("Número randomizado 2: " + numeroRandomizado2);

            if (numeroRandomizado1 == numeroRandomizado2){
                System.out.println("Os números são IGUAIS");
                break;
            } else {
                System.out.println("Os números AINDA são diferentes - tentativa " + contadorTentativa);
            }
            if (tentativa == 20){
                System.out.println("Após 20 tentativas não foi possível ter uma IGUALDADE");
            }

            numeroRandomizado2 = new Random().nextInt(10);
            numeroRandomizado1 = new Random().nextInt(10);
            contadorTentativa++;
        }
    }
}
