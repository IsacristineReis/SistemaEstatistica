package sistemaTransito;

public class Estatistica {
	int CodCidade;
	String NCidade;
	int NAcidentes;
	
	//metodo construtor
	Estatistica(){
		this(0,"",0);
	}
	
	//metodo procedimento
	Estatistica(int CodigoCidade, String NomeCidade, int QtdsAcidente){
		CodCidade = CodigoCidade;
		NCidade = NomeCidade;
		NAcidentes = QtdsAcidente;
		
	}
}
