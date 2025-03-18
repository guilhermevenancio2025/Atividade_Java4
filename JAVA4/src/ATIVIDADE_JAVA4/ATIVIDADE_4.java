package ATIVIDADE_JAVA4;
import java.util.Scanner;

public class ATIVIDADE_4  {
    public static void main(String[] args) {
        float n1, n2, n3, n4, diferenca;

        Scanner ler = new Scanner(System.in);

      
        System.out.print("Digite o primeiro numero: ");
        n1 = ler.nextFloat();

        System.out.print("Digite o segundo numero: ");
        n2 = ler.nextFloat();

        System.out.print("Digite o terceiro numero: ");
        n3 = ler.nextFloat();

        System.out.print("Digite o quarto numero: ");
        
        n4 = ler.nextFloat();

      
        diferenca = (n1 * n2) - (n3 * n4);

        
        System.out.printf("Diferenca: %.1f\n", diferenca);

       
        ler.close();
    }
}
