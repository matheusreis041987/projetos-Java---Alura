public class ClasseFormat {
    public static void main(String[] args) {
        String nome = "Maria";
        String nome2 = "Matheus";
        int idade2 = 36;
        double salario = 19145.45;
        int idade = 30;
        double valor = 55.999999;


        // https://codegym.cc/pt/groups/posts/pt.956.formato-de-string-java
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais",nome,idade,valor ));

        String mensagem = """
                Meu nome é %S, trabaho na empresa Serpro.
                tenho %d anos e recebo um salário de %.1f.
                """.formatted(nome2,idade2,salario);
        System.out.println(mensagem);



    }
}
