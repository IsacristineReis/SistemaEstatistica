package sistemaTransito;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Estatistica[] estatistica = new Estatistica[10];
		ClasseMetodos m = new ClasseMetodos();
		
		Scanner sc = new Scanner (System.in);
		
		for(int i=0; i<10; i++) {
			estatistica[i] = new Estatistica();
		}
		
		//MENU
		int opc=0;
		while(opc!=9) {
			System.out.println("Estatísticas de acidentes.\n [1] Cadastro Estatística\n [2] Consulta por quantidade de acidentes\n [3] Consulta por estatísticas de acidentes\n [4] Acidentes acima da média das 10 cidades\n [9] Finalizar");
			System.out.println("Selecione uma opção: ");
			opc = sc.nextInt();
			switch (opc) {
			case 1: 
				estatistica = m.FCADRASTRAESTATISTICA(estatistica);
				break;
			case 2:
				m.PQTDACIDENTES (estatistica);
				break;
			case 3:
				m.PMAIORMENOR(estatistica);
				break;
			case 4:
				m.PACIMA(estatistica);
				break;
			case 9:
				System.out.println("Sair.");
				break;
			default:
				System.out.println("Opção inválida.");
			}
		}
	}
}
