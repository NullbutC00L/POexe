package arabiannights;
/**
 * Classe onde sao defenidos os metodos referentes ao MagicLamp
 * 
 * @author Antonio Freire 77969
 * @author Fabio Gomes 77924
 * @author Joao Rodrigues 77992
 */

public class MagicLamp
{
		private int _numEsfrega;
		private int _numeroDeGenios;
		private int _numeroInicial;
		private int _demonios;

		/**		
		*   Construtor da class Magic Lamp																		
		*																	
		* recebe um inteiro gen que representa o numero de genios que e possivel invocar	
		* e inicializa as variaveis _numeroDeGenios e _numeroInicial					
		* _numeroDeGenios e o numero de genios que existem no momento					
		* _numeroInicial e o numero de genios com que a lampada foi inicializada		
		*	
		* @param gen numero maximo de genios que a lampada pode criar
		*/																			
		
		public MagicLamp(int gen)
		{
			_numeroDeGenios=gen;
			_numeroInicial=gen;
		}


		/**												
		* recebe um (int)desejo que representa o numero de desejos a ser colocados ao genio	
		* sempre que a lâmpada tiver sido esfregada um numero par de vezes (sem contar a actual),
		* o genio sai mal-humorado, caso contrario cria um bem-humurado.										
		* Depois de esgotados os génios disponiveis,este cria um demonio. 										
		* 
		* @param desejo numero de desejos que sao pedidos ao genio.
	 	* @return FriendlyGenie se for esfregada um numero impar de vezes
	 	* @return GrumpyGenie  se for esfregada um numero par de vezes
	 	* @return RecyclableDemon se ja tiverem sido esgotados os genios existentes na lampada														
		*/

		public Genio rub(int desejo)
		{
			
			if (_numeroDeGenios>0)
			{
				_numEsfrega++;
			
			_numeroDeGenios--;
			if ((_numEsfrega-1)%2==0)
				return new GrumpyGenie(desejo);
			else
				return new FriendlyGenie(desejo);
		}
		else 
			return new RecyclableDemon(desejo);


		}
		/** 																																						
		*Este metodo reinicializa o numero de genios,
		*faz com que se possa esfregar novamente e cria mais um demonio .
		*Verifica se o demonio ja nao foi "reciclado" , se nao foi este "recicla-o".
		*
		* @param demonio que sera utilizado para reutilizar a lampada.
	 	*/

		public void feedDemon(RecyclableDemon demonio){
		if (!demonio.recycled()){
			demonio.recycle();
			_demonios++;
			_numEsfrega = 0;
			_numeroDeGenios=_numeroInicial;
			
		}
	}


		/**
		 * Indica se duas lampadas sao iguais.
		 * As duas lâmpadas são iguais se tiverem a mesma 
		 * capacidade e se os valores retornados pelos métodos 
		 * getGenies e getDemons forem iguais. 
		 * 
		 * @param obj Obj que vamos comparar com a lampada
		 * @return true se as MagicLamps forem iguais
		 * @return false se as MagisLamps forem diferentes
		 */

		public boolean equals (Object obj){
	
			return (this.getGenies()==((MagicLamp) obj).getGenies() 
				&& this.getDemons()==((MagicLamp) obj).getDemons()) 
					&& this._numeroInicial==((MagicLamp) obj)._numeroInicial ;
		}


		/**
		 * Retorna o numero de genios que ainda nao foram libertados
		 *
		 *
		 * @return int _numeroDeGenios numero de genios que a lampada ainda pode libertar
		 */	
		public int getGenies()
		{
			return _numeroDeGenios;
		}


		/**
		 * Retorna o numero de vezes que a lampada foi recarregada
		 *
		 * @return int _demonios numero de demonios, e o equivalente a dizer que e o numero de vezes que foi carregada
		 */	

		public int  getDemons()
		{
			return _demonios;
		}

}