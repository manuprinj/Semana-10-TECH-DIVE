import static Utils.EntradaUtils.getDataHora;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;


public class Exercicio2 {

    public static void main(String[] args) {
        LocalDateTime dataSaida = getDataHora("Digite a data e a hora de saída do voo (dd/MM/yyyy HH:mm): ");
        LocalDateTime dataChegada = getDataHora("Digite a data e a hora de chegada do voo (dd/MM/yyyy HH:mm): ");

        Duration between = Duration.between(dataSaida, dataChegada);
        System.out.println("Diferença: " + between.toDays() + " dia(s) | " + between.toHoursPart() + " hora(s)");
    }
}
