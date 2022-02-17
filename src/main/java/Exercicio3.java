import static Utils.DataUtils.format;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


public class Exercicio3 {

    public static void main(String[] args) {

        int ano = LocalDate.now().getYear();
        List<String> listaDosSabados = new ArrayList<>();

        for (Month mes : Month.values()) {
            for (int i = 1; i < 8; i++) {
                LocalDate data = LocalDate.of(ano, mes, i);
                if (data.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                    listaDosSabados.add(format(data));
                }
            }
        }
        System.out.println(listaDosSabados);
    }
}
