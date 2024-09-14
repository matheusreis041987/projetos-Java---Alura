public class Condicional {
    public static void main(String[] args) {

        int anoDElancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if ( anoDElancamento >= 2022){
            System.out.println("Laçamento que os clientes estão curtindo");
        } else {
            System.out.println("Filme retrô que vale à pena assistir");
        }

        if ( incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Pode assistir");
        } else {
            System.out.println("Tem de pagar a locação");
        }
    }

}
