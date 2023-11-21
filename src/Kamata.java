import java.util.Scanner;
public class Kamata {

	public static void main(String[] args) {
		double depozit;
		double kamata;
		double depozit_posle_kamata;
		double depozit_edna_god;
		System.out.print("Vnesi depozit");
		Scanner tastatura=new Scanner(System.in);
		depozit=tastatura.nextDouble();
		System.out.print("Vnesi kamata");
		kamata=tastatura.nextDouble();
		depozit_posle_kamata=((depozit/100)+kamata+depozit);
		System.out.print("Za 1 mesec");
		System.out.print(depozit_posle_kamata);
		System.out.print("Za edna godina");
		depozit_edna_god=depozit_posle_kamata+((depozit/100)*kamata)*12;
		System.out.print(depozit_edna_god);

	}

}
