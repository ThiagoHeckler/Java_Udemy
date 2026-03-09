/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
 */


import java.util.Scanner;

public class debitoPecas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cod1, num1, cod2, num2;
        double valUnit1, valUnit2, valPag;

        System.out.print("Informe o código da primeira peça: ");
        cod1 = scan.nextInt();
        System.out.print("Informe o número de peças a comprar: ");
        num1 = scan.nextInt();
        System.out.print("Informe o valor unitário de cada peça: ");
        valUnit1 = scan.nextDouble();

        System.out.print("Informe o código da segunda peça: ");
        cod2 = scan.nextInt();
        System.out.print("Informe o número de peças a comprar: ");
        num2 = scan.nextInt();
        System.out.print("Informe o valor unitário de cada peça: ");
        valUnit2 = scan.nextDouble();

        valPag = num1*valUnit1 + num2*valUnit2;

        System.out.printf("VALOR A PAGAR: R$ " + "%.2f",valPag);
    }
}
