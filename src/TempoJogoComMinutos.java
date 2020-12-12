import java.util.Scanner;

public class TempoJogoComMinutos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int horaInicial = scan.nextInt();
		int minutoInicial = scan.nextInt();
		int horaFinal = scan.nextInt();
		int minutoFinal = scan.nextInt();
		
		int horas = 0;
		int minutos = 0;
		
		if((horaFinal-horaInicial) == 1 && minutoFinal < minutoInicial) {
			horas = 0;
			minutos = 60 - (minutoInicial - minutoFinal);
		}else if(horaInicial == horaFinal && horaInicial == minutoInicial && horaInicial == minutoFinal) {
			horas = 24;
			minutos = 0;
		}else {
			horas = horaFinal - horaInicial;
			minutos = minutoFinal - minutoInicial;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", horas, minutos);

		scan.close();
	}

}
