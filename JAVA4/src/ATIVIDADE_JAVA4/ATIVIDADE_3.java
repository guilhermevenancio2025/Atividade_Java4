package ATIVIDADE_JAVA4;

import java.util.Scanner;

public class ATIVIDADE_3{
    public static void main(String[] args) {
        float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor do salario bruto: ");
        salarioBruto = ler.nextFloat();

        System.out.print("Digite o valor do adicional noturno: ");
        adicionalNoturno = ler.nextFloat();

        System.out.print("Digite a quantidade de horas extras: ");
        horasExtras = ler.nextFloat();

        System.out.print("Digite o valor dos descontos: ");
        descontos = ler.nextFloat();

        salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

        System.out.printf("Seu salário líquido é: %.2f\n", salarioLiquido);

        ler.close();
    }
}
