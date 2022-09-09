package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b = 0;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int soma = somar(a, b);
        int diferenca = subtrair(a, b);
        int produto = multiplicar(a, b);
        int quociente = dividir(a, b);

        System.out.println("Soma: " + soma);
        System.out.println("Diferença: " + diferenca);
        System.out.println("Produto: " + produto);
        System.out.println("Quociente: " + quociente);
    }

    public static int somar (int a, int b) {
        return a + b;
    }

    public static int subtrair (int a, int b) {
        return a - b;
    }

    public static int multiplicar (int a, int b) {
        return a * b;
    }

    public static int dividir (int a, int b) {
        return a / b;
    }

}
