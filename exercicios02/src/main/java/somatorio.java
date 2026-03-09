//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos

import java.util.Scanner;
public class somatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor para somar: ");
        int valor1 = scanner.nextInt();
        System.out.print("Informe outro valor para somar: ");
        int valor2 = scanner.nextInt();
        int soma = valor1 + valor2;
        System.out.println("SOMA = " + soma);
    }
}
