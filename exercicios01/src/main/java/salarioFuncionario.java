/* EXERCICIO
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.

VARIAVEIS
 numero de funcionário
 número de horas trabalhadas - POR FUNCIONARIO
 valor que recebe por hora
 salário desse funcionário

Entradas
    Ler o numero do funcionario.
    Numero de horas trabalhadas.
    Valor recebe por hora.

PROCESSAMENTO
    Calcular o salario do funcionario
SAIDA
    número e o salário do funcionário
    - EXIGIDO
        duas casas decimais
*/


import java.util.Scanner;

public class salarioFuncionario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int codFunc;
        double horTrab, valHora, valSalar;

        System.out.print("Informe o número do funcioanrio: ");
        codFunc = scan.nextInt();

        System.out.print("Informe o número de horas trabalhadas: ");
        horTrab = scan.nextDouble();

        System.out.print("Informe o valor que recebe por hora: ");
        valHora = scan.nextDouble();

        valSalar = horTrab * valHora;

        System.out.printf("Salario do funcionario nº: " + codFunc + " é igual a R$ " + "%.2f",valSalar);
    }
}
