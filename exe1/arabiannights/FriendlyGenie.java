package arabiannights;
/**
 * Classe onde sao defenidos os metodos referentes ao FriendlyGenie
 * 
 * @author Antonio Freire 77969
 * @author Fabio Gomes 77924
 * @author Joao Rodrigues 77992
 */
public class FriendlyGenie extends Genio
{
	/**
	 * Construtor do objeto FriendlyGenie
	 * Inicializa os atributos
	 * chamando o construtor da super classe com o numero de desejos com que foi criado 
	 * @param desejos = numero de desejos pedidos
	 */
		public FriendlyGenie(int desejos)
		{
				super(desejos);
		}

	/**
	 * Retorna uma String que informa se foi possivel realizar 
	 * o unico desejo que este genio pode realizar.
	 * 
	 * @return String que indica quantos desejos foram garantidos
	 * @return String que indica quandos desejos podem ainda ser garantidos
	 */		
		public String toString(){
			return ("Friendly genie has granted " + getGrantedWishes() 
				+ " wishes and still has " + getRemainingWishes() + " to grant.");
	}
}