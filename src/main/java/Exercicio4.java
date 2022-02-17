import static Utils.EntradaUtils.getData;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class Exercicio4 {

    public static void main(String[] args) {

        LocalDate data = getData("Digite uma data: ");

        if (data.getDayOfMonth() == 13 && data.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
            System.out.println("EITA! É SEXTA-FEIRA 13!!");
        } else {
            System.out.println("É só mais um dia normal!");
        }
    }
}
