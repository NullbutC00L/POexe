public class VeiculoPesado extends Veiculo{ 
	private int _numeroAceleracoes;
	private int _numeroTravagem;

	public VeiculoPesado(String marca){
		super(marca);
	}

	public String buzina(){
		return "POO POO";
	}

	public String acelera(){
		_numeroAceleracoes++;
		return "VRUM VRUM";
			}
	public String trava(){
		_numeroTravagem++;
		return "GRRR GRRR";
	}
	public int obtemNumeroAcelaracoes(){
		return _numeroAceleracoes;
	}
	public int obtemNumeroTravagem(){
		return _numeroTravagem;
	}
}