
public class Veiculo extends EstacaoServico{
	private String _marca;
	
	public Veiculo(String marca){
		_marca=marca;
	}

	public String acelera(){
		return "VRUM VRUM";
			}
	public String trava(){
		return "GRRR GRRR";
	}
	public String buzina(){
		return "PII PII";
	}
	public int abastece(int combustivel, int bomba, EstacaoServico estacao){
		return estacao.retiraCombustivel(combustivel,bomba);

	}
	public String obtemMarca(){
		return _marca;
	}

}