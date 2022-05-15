package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Informe o primeiro número: ");
        a = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        b = sc.nextInt();

        int soma = somar(a, b);
        int subtracao = subtrair(a, b);
        int multiplicacao = multiplicar(a, b);
        double divisao = dividir(a, b);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);


    }

    public static int somar(int a,  int b) { return a + b; }
    public static int subtrair(int a,  int b) { return a - b; }
    public static int multiplicar(int a,  int b) { return a * b; }
    public static double dividir(int a,  int b) { return a / b; }




}
