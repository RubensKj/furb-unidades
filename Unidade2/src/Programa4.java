import java.util.Scanner;

public class Programa4 {
    public static void main(String[] args) {

        // Análise: OK
        // Não é importante:
        // Não é utilizado: não

        // Entradas:
        // Tempo Gasto na viagem (horas)
        // Velocidade média durante a mesma (em km/h)

        // Saidas:
        // Quantidade de litros

        // Processo:
        // Distancia percorrida (km)

        // Testes:
        // tempo / velocidade media / quantidade litros
        //  2 / 60 / 10
        //  56 / 40 / 186.6


        // Algoritmo

        Scanner entrada = new Scanner(System.in);

        int kmPorLitro = 12;

        System.out.print("Digite o tempo gasto na viagem (horas): ");
        double horas = entrada.nextInt();

        System.out.print("Digite a velocidade média durante a viagem (km/h): ");

        double quilometrosPorHora = entrada.nextDouble();

        double distanciaPercorrida = quilometrosPorHora * horas;

        double totalLitrosSeraoUtilizados = distanciaPercorrida / kmPorLitro;

        System.out.println("O total de litros que foram gastos é: " + totalLitrosSeraoUtilizados);
    }
}
