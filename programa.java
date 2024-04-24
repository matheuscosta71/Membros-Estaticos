package program;
import java.util.Locale;
import java.util.Scanner;
import aplicacao.aplicacao;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		aplicacao calc= new aplicacao();
		
		
		System.out.println("-------------------------------\nCALCULA CIRCUNFERÊNCIA\n-------------------------------\nEntra raio: ");
		double raio=sc.nextDouble();
		
		double c = calc.circunferencia(raio);
		double v= calc.volume(raio);
		
		System.out.printf("Circunferência: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI: %.2f\n", calc.pi);
		
		
		sc.close();
	}

}
