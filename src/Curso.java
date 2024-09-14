public class Curso {

    String nome;
    int categoriaId;
    int id;

    String categoria;

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", categoriaId=" + categoriaId +
                ", id=" + id +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
