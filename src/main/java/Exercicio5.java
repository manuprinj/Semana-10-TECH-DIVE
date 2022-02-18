import static Utils.DataUtils.format;
import static Utils.DataUtils.formatMesAno;
import static Utils.EntradaUtils.getMesAno;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;


public class Exercicio5 {

    public static void main(String[] args) {

        YearMonth mesAno = getMesAno("Digite o mês e o ano (MM/yyyy): ");
        int mes = LocalDate.now().getMonthValue();
        int ano = LocalDate.now().getYear();

        List<String> listaSegundas = new ArrayList<>();

        for (int i = 1; i <= mesAno.lengthOfMonth(); i++) {
            LocalDate data = LocalDate.of(ano, mes, i);
            if (data.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
                listaSegundas.add(format(data));
            }
        }
        System.out.println(listaSegundas);
    }
}
