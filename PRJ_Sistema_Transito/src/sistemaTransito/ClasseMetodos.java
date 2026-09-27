package sistemaTransito;

import java.util.*;

public class ClasseMetodos {
	
	Scanner sc = new Scanner(System.in);
	
	public Estatistica[] FCADRASTRAESTATISTICA(Estatistica[] estatistica) {
		for (int i=0; i<30; i++) {
			System.out.println("Ditige Código da Cidade: ");
			estatistica[i].CodCidade = sc.nextInt();
			System.out.println("Digite Nome da Cidade: ");
			estatistica[i].NCidade = sc.next();
			System.out.println("Digite Número de Acidentes: ");
			estatistica[i].NAcidentes = sc.nextInt();
		}
		return estatistica;
	}
	//
	public void PQTDACIDENTES(Estatistica[] estatistica) {
		System.out.println("Acidentes entre 100 e 500.");
		for (int i=1; i<31; i++) {
			if (estatistica[i].NAcidentes>100 & estatistica[i].NAcidentes<500) {
				System.out.println(estatistica[i].CodCidade+""+estatistica[i].NCidade+" n° de acidentes: "+estatistica[i].NAcidentes);
			}
		}
	}
	//
	public void PMAIORMENOR(Estatistica[] estatistica) {
		int aux=0;
		System.out.println("Maior e menor numero de acidentes.");
		for (int i=0; i<9; i++) {
			for (int j=(i+1); j<10; j++) {
				aux = estatistica[i].NAcidentes;
				estatistica[i].NAcidentes = estatistica[j].NAcidentes;
				estatistica[j].NAcidentes = aux;
			}
		}
		System.out.println("Maior número de acidentes: "+estatistica[9].NAcidentes+"\n Menor número de acidentes: "+estatistica[0].NAcidentes);
	}
	//
	public void PACIMA (Estatistica[] estatistica) {
		System.out.println("Média das 10 cidades.");
		double soma=0;
		for(int i=0; i<10; i++) {
			soma+= estatistica[i].NAcidentes;
		}
		double media = soma/10;
		for(int i=0;i<10;i++) {
			if(estatistica[i].NAcidentes >= media) {
				System.out.println(estatistica[i].NAcidentes+" está acima da média.");
			}
		}
	}
}
