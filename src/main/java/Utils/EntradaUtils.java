package Utils;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class EntradaUtils {
    public static final Scanner SC = new Scanner(System.in);

    public static LocalDate getData(String mensagem) {
        while (true) {
            System.out.println(mensagem);
            try {
                return DataUtils.parse(SC.nextLine());
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida, digite a data no formato dd/MM/yyyy");
            }
        }
    }

    public static LocalDateTime getDataHora(String mensagem) {
        while (true) {
            System.out.println(mensagem);
            try {
                return DataUtils.parseDataHora(SC.nextLine());
            } catch (DateTimeParseException e) {
                System.out.println("Hora inválida, digite a hora no formato HH:mm");
            }
        }
    }
}
