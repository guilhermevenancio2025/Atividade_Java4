package ATIVIDADE_JAVA4;
public class ATIVIDADE_1 {
	
    public static void main(String[] args) throws Exception {
        System.out.println("Digite o salario:");
        float salario = readFloat();

        System.out.println("Digite o abono:");
        float abono = readFloat();

        float novoSalario = salario + abono;

        System.out.println("Novo Salario: " + novoSalario);
    }

    public static float readFloat() throws Exception {
        StringBuilder input = new StringBuilder();
        int ch;
        while ((ch = System.in.read()) != '\n' && ch != -1) {
            input.append((char) ch);
        }
        return Float.parseFloat(input.toString().trim());
    }
}
