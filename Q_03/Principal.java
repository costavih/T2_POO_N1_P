package Q_03;
import java.util.Scanner;
public class Principal {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite o primeiro número: ");
	        int num1 = sc.nextInt();
	        System.out.print("Digite o segundo número: ");
	        int num2 = sc.nextInt();

	        int menor = num1;
	        if (num2 < num1) {
	            menor = num2;
	        }

	        System.out.println("O menor número é: " + menor);

	        sc.close();
	    }
}
