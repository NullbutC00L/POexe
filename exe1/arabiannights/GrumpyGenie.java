package arabiannights;

public class GrumpyGenie extends Genie{

	public GrumpyGenie(int wish){
		super(wish);

	}
	public String toString()
		{
			if (getGrantedWishes()==0)
				return ("Grumpy genie has a wish to grant.");
		else 
			return ("Grumpy genie has granted a wish.");
		}	
}