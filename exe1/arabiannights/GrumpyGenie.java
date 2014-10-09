package arabiannights;

/**
 * Classe onde sao defenidos os metodos referentes ao GrumpyGenie
 * 
 * @author Antonio Freire 77969
 * @author Fabio Gomes 77924
 * @author Joao Rodrigues 77992
 */
public class GrumpyGenie extends Genio
{
	/**
	 * Construtor do objeto GrumpyGenie
	 * Inicializa os atributos
	 * chamando o construtor da super classe apenas com 1 desejo 
	 * @param desejos = numero de desejos pedidos
	 */
		public GrumpyGenie(int desejos)
		{
				super(1);
		}

	/**
	 * Retorna uma String que informa se foi possivel realizar 
	 * o unico desejo que este genio pode realizar.
	 * 
	 * @return String que indica que pode garantir um desejo
	 * @return String que indica que garantiu um desejo
	 */
		public String toString()
		{
			if (getGrantedWishes()==0)
				return ("Grumpy genie has a wish to grant.");
		else 
			return ("Grumpy genie has granted a wish.");
		}	
	
}