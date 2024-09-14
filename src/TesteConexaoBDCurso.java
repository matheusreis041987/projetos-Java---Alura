public class TesteConexaoBDCurso {

    public static void main(String[] args) {
       /* Curso curso1 = new Curso();
        curso1.nome = "Spring boot";
        curso1.categoriaId = 2;
        curso1.id = 17;

        Curso curso2 = new Curso();
        curso2.nome = "GitHub";
        curso2.id = 16;
        curso2.categoriaId = 1;

        CursoService cursoService = new CursoService();

        cursoService.criarCurso(curso1);
        cursoService.criarCurso(curso2);*/

        CursoService cursoService = new CursoService();
        System.out.println("\n"+"LISTA USANDO SET / HASHSET" + "\n");
        cursoService.listarCursos().forEach(System.out::println);
        System.out.println("\n"+"LISTA USANDO LIST / ARRAYLIST" + "\n");
        cursoService.listarCursos2().forEach(System.out::println);
        System.out.println("\n"+"LISTAR POR ID" + "\n");
        System.out.println(cursoService.listarPorId(1));
        System.out.println(cursoService.listarPorId(9));
        System.out.println("\n"+"LISTAR POR CURSO" + "\n");
        System.out.println(cursoService.listarPorCurso("Git"));
        System.out.println(cursoService.listarPorCurso("o"));
        System.out.println("\n"+"LISTAR POR CURSO COMPLETO" + "\n");
        cursoService.listarCompletaPorCurso("Java").forEach(System.out::println);
    }
}
