package ATIVIDADE_JAVA4;

import java.util.Scanner;

public class ATIVIDADE_2  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float nota1, nota2, nota3, nota4, media;
        
        System.out.print("Digite a nota 1: ");
        nota1 = sc.nextFloat();
        
        System.out.print("Digite a nota 2: ");
        nota2 = sc.nextFloat();
        
        System.out.print("Digite a nota 3: ");
        nota3 = sc.nextFloat();
        
        System.out.print("Digite a nota 4: ");
        nota4 = sc.nextFloat();
        
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.printf("Média final: %.1f%n", media);
        
        sc.close();
    }
}
