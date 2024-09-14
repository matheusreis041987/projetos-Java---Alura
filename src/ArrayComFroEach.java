import java.util.ArrayList;
import java.util.List;

public class ArrayComFroEach {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<String>();
        nomes.add("Matheus");
        nomes.add("Bernardo");
        nomes.add("Andreia");
        nomes.add("Aurea");

        System.out.println(nomes);
        nomes.forEach(System.out::println);

    }
}
