public class Main {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double nota = 3.25;
        double media = (9.8 + 6.3 + 8) / 3;
        String sinopse;
        int classificacao;

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun : Maverick");
        System.out.println("Ano do Lançamento:" + anoDeLancamento);
        System.out.println("Média: " + media);
        sinopse = """
                Filme Top Gun
                Filme de aventuira dos anos 80 com galã dos anos 70
                Muito bom!
                Ano de lançamento :
                """ + anoDeLancamento;
    // aspas triplas são usadas para textos longos
        System.out.println(sinopse);
        classificacao = (int) (media / 2); // realizado um casting
        System.out.println("classificação: " + classificacao);

        nota += 2;

        System.out.println(nota);

        int a = 10 % 6;

        System.out.println(a);

        if (a != 6 && a == nota) {
            System.out.println("Faz alguma coisa");
        } else {
            System.out.println("Não faz alguma coisa");
        }

    }
}