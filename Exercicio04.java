import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> x = new ArrayList();
		int numero,i;
		double soma = 0;
		
		System.out.println("Digite um Número de 1 á 10: ");
        numero = scan.nextInt();
        x.add(numero);
        soma += numero;
        
		do{System.out.println("Digite um Número de 1 á 10: ");
	         numero = scan.nextInt();
	         x.add(numero);
	         soma += numero;
	        	
	        }while(numero>0);
	 
	        	
		System.out.println("Os digita foram: "+x);
		i = x.size() -1;
		System.out.println("Quantidade de números digitado: "+ i);
		System.out.println("A soma dos números: " + soma);
		System.out.println("A media entre  os numero são: "+ soma/i);
	        }
	}
	        		
			
	


