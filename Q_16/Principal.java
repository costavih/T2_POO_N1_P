package Q_16;
import java.util.Scanner;
public class Principal {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite o preço atual do produto: ");
	        double preco = sc.nextDouble();
	        System.out.print("Digite o código do produto (1 a 4): ");
	        int codigo = sc.nextInt();

	        double desconto = 0.0;
	        switch (codigo) {
	            case 1:
	                desconto = 0.1;
	                break;
	            case 2:
	                desconto = 0.2;
	                break;
	            case 3:
	                desconto = 0.3;
	                break;
	            case 4:
	                desconto = 0.4;
	                break;
	            default:
	                System.out.println("Código inválido!");
	                System.exit(0);
	        }

	        double valorDesconto = preco * desconto;
	        double novoPreco = preco - valorDesconto;

	        System.out.printf("Preço atual: R$ %.2f\n", preco);
	        System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
	        System.out.printf("Novo preço: R$ %.2f\n", novoPreco);

	        sc.close();
	    }
}
