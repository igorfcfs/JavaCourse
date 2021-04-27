import java.util.Locale;
import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade1, idade2;
		double media;
		String nome1, nome2;
		
		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");
		nome1 = sc.nextLine();
		System.out.print("Idade: ");
		idade1 = sc.nextInt();
		
		System.out.println("Dados da segunda pessoa:");
		System.out.print("Nome: ");
		sc.nextLine();
		nome2 = sc.nextLine();
		System.out.print("Idade: ");
		idade2 = sc.nextInt();
		
		media = (idade1 + idade2) / 2;
		
		System.out.println("A idade media de " + nome1 + " e " + nome2 + " eh de " + String.format("%.1f", media));
		
		sc.close();
	}
}
