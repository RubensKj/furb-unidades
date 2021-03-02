public class Problema1 {

    public static void main(String[] args) {

        // Análise: OK
        // Entrada: raio
        // Saida: área
        // Testes:
        // Testes 1: raio: 2 area: 12,566
        // Testes 2: raio: 5 area: 78,5375
        // ....

        // Algoritmo: JAVA

        double raio = 2;
        double pi = 3.1415; // Podia ser Math.PI

        double area = pi * Math.pow(raio, 2);

        System.out.println("Área é: " + area);
    }
}
