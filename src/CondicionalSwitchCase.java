import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CondicionalSwitchCase {

    public static void main(String[] args) {

        int dia = 3;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataAgora = null;
        try {
            dataAgora = formato.parse("01/04/2023");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        Calendar dia2 = Calendar.getInstance();
        dia2.setTime(dataAgora);
        int dayOfMonth = dia2.DAY_OF_MONTH;
        String nomeDia;



        switch (dia){

            case 1 :
                nomeDia = "Domingo";
                break;
            case 2 :
                nomeDia = "Segunda feira";
                break;
            case 3 :
                nomeDia = "Terça feira";
                break;
            case 4 :
                nomeDia = "Quarta feira";
                break;
            case 5 :
                nomeDia = "Quinta feira";
                break;
            case 6 :
                nomeDia = "Sexta feira";
                break;
            case 7 :
                nomeDia = "Sábado";
                break;
            default:
                nomeDia = "Dia inexistente";
                break;
        }
        System.out.println(dia2);
        System.out.println("A data de " + dataAgora + " é o dia da semana: " + nomeDia );

    }
}
