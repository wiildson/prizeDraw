/*
 Crie um algoritmo usando While que sorteie um número de 0 a 100 e que permita que o usuário tente acertar o
número que foi sorteado. Se o usuário não acertar, deve imprimir uma mensagem informando se o número sor-
teado é maior ou menor que a tentativa feita. Quando o usuário acertar, imprima o total de tentativas feitas.
 */

package QuestionFour;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class QuestionFour {

	public static int numesc;
	public static int numsort;
	public static int contador1=0;
	public static int contador2=0;
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Random sorteio = new Random();
		numsort = sorteio.nextInt(100);
		
		while(numesc != numsort) {
		System.out.print("Digite o número que você acha que foi sorteado: ");
		numesc = sc.nextInt();
		
		if(numesc == numsort) {
			System.out.println("Parabéns! Você acertou!!");
			System.out.println("Você fez um total de " + (contador1+contador2) + " tentativas.");
		}
		else if(numesc > numsort) {
			System.out.println("O número sorteado é menor que " + numesc);
			contador1 ++;
		}
		else {
			System.out.println("O número sorteado é maior que " + numesc);
			contador2 ++;
		}
		}
		
	}

}