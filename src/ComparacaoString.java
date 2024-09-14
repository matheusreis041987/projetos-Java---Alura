public class ComparacaoString {

    public static void main(String[] args) {

    String senhaDigitada = "Bola@0419";
    String senhaBd = "bola@0419";

    if (senhaDigitada.equals(senhaBd)){
        System.out.print("Acesso permitido");
    } else {
        System.out.print("Acesso negado");
    }

    }
}
