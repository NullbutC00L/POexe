package arabiannights;
/**
 * Classe onde sao defenidos os metodos referentes ao RecyclableDemon
 * 
 * @author Antonio Freire 77969
 * @author Fabio Gomes 77924
 * @author Joao Rodrigues 77992
 */
public class RecyclableDemon extends Genio
{

	private boolean _jaTa;
	/**
	 * Construtor do objeto RecyclableDemon
	 * Inicializa os atributos
	 * chamando o construtor da super classe com o numero de desejos com que foi criado 
	 * @param desejos = numero de desejos pedidos
	 */
	public RecyclableDemon(int desejos)
	{
		super(desejos);
	}
	/**
	* Recicla o Demon
	* @return retorna e associa o valor true a variavel de estado do Demon
	*/
	public boolean recycle ()
	{
		return _jaTa=true;
	}

	/**
	 * Indica se o demonio ja foi reciclado retornando o valor da sua variavel de estado.
	 *
	 * @return true se o demon ja tiver sido reciclado
	 * @return false se o demon ainda nao tiver sido reciclado
	 */
	public boolean recycled()
	{
		return _jaTa;
	}

		/**
	 * Retorna uma String que informa se foi possivel realizar 
	 * o unico desejo que este genio pode realizar.
	 * 
	 * @return String que indica quantos desejos foram garantidos
	 * @return String que indica que o demonio("demon") foi reciclado"colocado de novo na lampada"
	 */	
	public String toString(){
		if (!_jaTa)
		 return "Recyclable demon has granted " + getGrantedWishes() + " wishes";
		else return "Demon has been recycled.";
	}

}