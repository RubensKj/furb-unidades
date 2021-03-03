import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {

        // Análise: OK
        // Entradas: Numero funcionario, numero de horas trabalhadas, valor recebido por hora.
        // Saídas: Numero e o salario
        // Testes:
        // numero funcionario  | numero horas | valor
        // 1 | 10 | 50 -> 1 - 500
        // 2 | 40 | 25 -> 2 - 1000
        // 3 | 120 | 30 -> 3 - 3600

        Scanner teclado = new Scanner(System.in);

        System.out.print("Número do Funcionário: ");
        int numeroFuncionario = teclado.nextInt();

        System.out.print("Horas trabalhadas: ");

        int horaTrabalhada = teclado.nextInt();

        System.out.print("Valor da hora: ");

        int valorHora = teclado.nextInt();

        int valorSalario = horaTrabalhada * valorHora;

        System.out.println("Número do Funcionário: " + numeroFuncionario + " - Salário: R$" + valorSalario);
    }
}
