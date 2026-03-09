/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */

import java.util.Scanner;

public class formasGeometricas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c;

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        trianguloRetangulo(a,c);
        circulo(c);
        trapezio(a,b,c);
        quadrado(b);
        retangulo(a,b);

    }

    public static void trianguloRetangulo(double a,double c){
        double triangulo = a*c/2;
        System.out.printf("TRIANGULO: " + "%.3f",triangulo);
    }

    public static void circulo(double c){
        double pi = 3.14159;
        double circulo = c*c*pi;
        System.out.printf("\nCIRCULO: " + "%.3f",circulo);
    }

    public static void trapezio(double a, double b, double c){
        double trapezio = (a+b) * c / 2;
        System.out.printf("\nTRAPEZIO: " + "%.3f",trapezio);
    }

    public static void quadrado(double b){
        double quadrado = b*b;
        System.out.printf("\nQUADRADO: " + "%.3f",quadrado);
    }

    public static void retangulo(double a, double b){
        double retangulo = a * b;
        System.out.printf("\nRETANGULO: " + "%.3f",retangulo);
    }
}
