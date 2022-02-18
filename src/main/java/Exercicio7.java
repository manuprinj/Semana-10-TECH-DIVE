import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import Utils.EntradaUtils;


public class Exercicio7 {

    public static void main(String[] args) {
        String caminho = EntradaUtils.getString("Digite o caminho do arquivo: ");
        String caractere = EntradaUtils.getString("Digite o caractere que deverá ser filtrado: ");

        File file = new File(caminho);
        int contagem = 0;

        try (BufferedReader br
                = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    if (caractere.equals(String.valueOf(c))) {
                        contagem++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(contagem);
    }
}
