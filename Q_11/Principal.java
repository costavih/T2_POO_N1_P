package Q_11;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o salário atual do funcionário: ");
		double salario = entrada.nextDouble();

		double percentual = 0.0;

		if (salario <= 300.0) {
			percentual = 0.15;
		} else if (salario <= 600.0) {
			percentual = 0.1;
		} else if (salario <= 900.0) {
			percentual = 0.05;
		}

		double aumento = salario * percentual;
		double novoSalario = salario + aumento;

		System.out.printf("Valor do aumento: R$ %.2f\n", aumento);
		System.out.printf("Novo salário: R$ %.2f\n", novoSalario);

		entrada.close();
	}
}

