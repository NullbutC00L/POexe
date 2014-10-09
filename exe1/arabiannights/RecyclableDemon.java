package arabiannights;

public class RecyclableDemon extends Genie{
	private boolean _rec;

	public RecyclableDemon(int wish){
		super(wish);
	}
	public boolean recycle(){
		_wish=0;
		_rec=true ;
		return true;
	}
	public boolean recycled(){
		return _rec;

	}

	public String toString(){
		if (!_rec)
		 return "Recyclable demon has granted " + getGrantedWishes() + " wishes";
		else return "Demon has been recycled.";
	}

}