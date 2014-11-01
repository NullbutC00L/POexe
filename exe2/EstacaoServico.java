public class EstacaoServico{
	private int _bomba[] = new int[10];
	private int _combustivelArmazenado=1000;

	

	public int retiraCombustivel(int combustivel, int bomba){
		if(_combustivelArmazenado-combustivel>=0){
			_bomba[bomba]+=combustivel;
			_combustivelArmazenado-=combustivel;
			return combustivel;
		}
		else{
			_bomba[bomba]+=_combustivelArmazenado;
			int remaining=_combustivelArmazenado;
			_combustivelArmazenado=0;
			return remaining;

		}
	}
	public int obtemQuantidadeCombustivel(){
		return _combustivelArmazenado;
	}
	public int obtemConsumo(int bomba){
		return _bomba[bomba];

	}

	public static void main(String[] args) {
		Veiculo veic[]=new Veiculo[10];
		for (int i=0;i<10 ;i++ ) {
			if (i<5){

				veic[i]=new Veiculo("XPTO"+(i+1));
			}
			else{
				veic[i]=new VeiculoPesado("XPTO"+(i+1));
			}
			
		}
		EstacaoServico estacao =new EstacaoServico();
		for (int i=0;i<10 ;i++ ) {
				System.out.println( veic[i].obtemMarca());
				System.out.println(veic[i].buzina());
				System.out.println(veic[i].abastece(150,(47+i)%10,estacao));
				System.out.println(veic[i].trava());
				System.out.println(veic[i].acelera());
			}
			
		}

	}



