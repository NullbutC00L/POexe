package arabiannights;
public class FriendlyGenie extends Genie{
	
	public FriendlyGenie(int wish){
		super(wish);
	}
	public int getRemainingWishes(){
		return _wish;

	}
	public boolean canGrantWish(){
		if(_wish>0){
			return true;
		}
		return false;
	}
	
	public String toString(){
			return ("Friendly genie has granted " + getGrantedWishes() 
				+ " wishes and still has " + getRemainingWishes() + " to grant.");
	}

}