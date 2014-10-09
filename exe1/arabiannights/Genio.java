package arabiannights;

/**
 * Classe onde sao defenidos os metodos referentes ao Genio
 * 
 * @author Antonio Freire 77969
 * @author Fabio Gomes 77924
 * @author Joao Rodrigues 77992
 */


public abstract class Genio
{
	private int _initDesejos;
	private int _grant;

	/**
	 * Construtor do objecto Genio
	 * Inicializa os atributos
	 *
	 * @param desejos numero de desejos pedidos
	 */


	public Genio (int desejos)
	{
		_initDesejos=desejos;


	}

	/**
	 * Este metodo verifica se ainda e possivel
	 * realizar desejos. 
	 *
	 * @return true se o genio puder realizar desejos
	 * @return false se o genio nao puder realizar desejos
	 */
	
	public boolean canGrantedWishes()
	{
		return _initDesejos > _grant;
	}

	/**
	 * verifica se ainda pode ser realizado, se for possivel
	 * concede um desejo, se nao for nao faz nada.
	 *
	 * @return true se o desejo for realizado 
	 * @return false se o desejo nao for realizado
	 */

	public boolean grantWish()
	{
		if (canGrantedWishes())
		{
			_grant++;
			return true;
		}
		return false;

	}

	/**
	 * Retorna o numero de desejos concedidos.
	 *
	 * @return int _grant numero de desejos concedidos.
	 */

	public int getGrantedWishes()
	{
		return _grant;
	}


	/**
	 * Retorna a diferenca entre os desejos concedidos
	 * e os desejos iniciais, obtendo o numero de
	 * desejos que ainda se podem pedir.
	 *
	 * @return int numero de desejos por pedir
	 */
	
	public int getRemainingWishes()
	{
		return (_initDesejos - _grant);

	}

	/**
	 * Este metodo e abstracto pois consoante o tipo de genio
	 * este imprime uma mensagem respectiva a class, neste caso
	 *ao tipo de genio.
	 * 
	 */	
	public abstract String toString();	


}
	