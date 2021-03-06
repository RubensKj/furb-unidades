import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {

        // Análise: OK

        // Oq nao é necessario: ..faça um programa que calcule e mostre.. | ..dentre elas o Java/C++..

        // Entradas:
        // raio

        // Saidas:
        // Volume de uma esfera

        // Testes:
        // raio / volume
        // 3 / 113.09724
        // 2 / 33.5102933

        // Algoritmo:

        double pi = 3.14159;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o raio da esfera: ");
        double raio = entrada.nextDouble();

        double volume = (4.0 / 3) * pi * Math.pow(raio, 3);

        System.out.println("O volume da esfera é: " + volume);
    }
}
