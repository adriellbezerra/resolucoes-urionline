package resolucoes.uri;

import java.util.Locale;
import java.util.Scanner;

public class AumentoDeSalario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double salario = scan.nextDouble();
		
		double reajuste1 = 15.0/100.0;
		double reajuste2 = 12.0/100.0;
		double reajuste3 = 10.0/100.0;
		double reajuste4 = 7.0/100.0;
		double reajuste5 = 4.0/100.0;
		
		double valorAcrescido = 0.0;
		String reajuste = "";
		
		if (salario > 2000.00) {
			valorAcrescido = reajuste5 * salario;
			salario = salario + valorAcrescido;
			reajuste = "4 %";
		}else {
			if (salario >= 0.0 && salario <= 400.00) {
				valorAcrescido = reajuste1 * salario;
				salario = salario + valorAcrescido;
				reajuste = "15 %";
			}
			else if (salario > 400.00 && salario <= 800.00) {
				valorAcrescido = reajuste2 * salario;
				salario = salario + valorAcrescido;
				reajuste = "12 %";
			}
			else if (salario > 800.0 && salario <= 1200.00) {
				valorAcrescido = reajuste3 * salario;
				salario = salario + valorAcrescido;
				reajuste = "10 %";
			}
			else {
				valorAcrescido = reajuste4 * salario;
				salario = salario + valorAcrescido;
				reajuste = "7%";
			}
		}
		
		String novoSalario = String.format("Novo salario: %.2f", salario);
		String novoValorAcrescido = String.format("Reajuste ganho: %.2f", valorAcrescido);
		
		System.out.println(novoSalario);
		System.out.println(novoValorAcrescido);
		System.out.println("Em percentual: " + reajuste);

		scan.close();
	}

}
