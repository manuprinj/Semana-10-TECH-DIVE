import java.io.File;


public class Exercicio6 {

    public static void main(String[] args) {
        File file = new File("/home/manuela/dev/workspace-senai/Semana-2/output.txt");

        if (file.exists()) {
            double bytes = file.length();
            double kilobytes = bytes/1024;
            double megabytes = kilobytes/1024;
            System.out.println("O tamanho em " + bytes + " em bytes");
            System.out.println("O tamanho em " + kilobytes + " em kilobytes");
            System.out.println("O tamanho em " + megabytes + " em megabytes");
        } else {
            System.out.println("O arquivo não existe");
        }
    }
}
