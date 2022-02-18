package Utils;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;


public class DataUtils {

    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final DateTimeFormatter FORMATTER_MES_ANO = DateTimeFormatter.ofPattern("MM/yyyy");
    public static final DateTimeFormatter FORMATTER_DATA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public static LocalDate parse(String data) {
        return LocalDate.parse(data, FORMATTER);
    }

    public static LocalDateTime parseDataHora(String data) {
        return LocalDateTime.parse(data, FORMATTER_DATA_HORA);
    }

    public static YearMonth parseMesAno(String data) {
        return YearMonth.parse(data, FORMATTER_MES_ANO);
    }

    public static String format(LocalDate data) {
        return FORMATTER.format(data);
    }

    public static String format(LocalDateTime data) {
        return FORMATTER_DATA_HORA.format(data);
    }
}
