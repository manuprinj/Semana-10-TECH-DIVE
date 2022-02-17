import static Utils.EntradaUtils.getData;

import java.time.LocalDate;


public class Exercicio1 {

    private static void verificacaoIdade(int idade) {
        if (idade < 18) {
            System.out.println("Você tem " + idade + " anos, logo não pode acessar o sistema!");
        } else {
            System.out.println("Você tem " + idade + " anos, logo pode acessar o sistema!");
        }
    }

    public static void main(String[] args) {

        int idade = 0;

        LocalDate dataNascimento = getData("Digite sua data de nascimento: ");
        int anoNascimento = dataNascimento.getYear();
        int mesNascimento = dataNascimento.getMonthValue();
        int diaNascimento = dataNascimento.getDayOfMonth();

        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        int mesAtual = dataAtual.getMonthValue();
        int diaAtual = dataAtual.getDayOfMonth();

        if (mesAtual >= mesNascimento) {
            if (diaAtual >= diaNascimento) {
                idade = anoAtual - anoNascimento;
                verificacaoIdade(idade);
            } else {
                idade = anoAtual - anoNascimento - 1;
                verificacaoIdade(idade);
            }
        } else {
            idade = anoAtual - anoNascimento - 1;
            verificacaoIdade(idade);
        }
    }
}
