import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite Um N�mero Inteiro:");
		  int num1 = scan.nextInt();
		int count = 2;
		for(; count <= num1;) {
			System.out.println("N�meros Pares: "+count);
			 count+=2;
		}

	}

}
