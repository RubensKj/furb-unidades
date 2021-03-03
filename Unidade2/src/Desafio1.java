import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double valorA = teclado.nextDouble();

        double valorAMultiplicado = valorA * 3.5;

        System.out.print("Digite um segundo número: ");
        double valorB = teclado.nextDouble();

        double valorBMultiplicado = valorB * 7.5;

        double soma = (valorBMultiplicado + valorAMultiplicado) / 11;

        System.out.println("MEDIA = " + soma);
    }
}
