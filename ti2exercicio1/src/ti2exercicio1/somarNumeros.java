package ti2exercicio1;
import java.util.*;

class somarNumeros {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		
		int num1, num2, soma;
		
		System.out.println("Digite um número:");
		num1 = sc.nextInt();
		System.out.println("Digite outro número:");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("Soma dos números:" +soma);
	}
}
