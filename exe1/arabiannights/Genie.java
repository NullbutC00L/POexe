package arabiannights;
public abstract class Genie{

	protected int _granted;
	protected int _wish;

	public Genie(int wish){
		_wish=wish;

	}
	public boolean grantWish(){
		
		if(_wish!=0){
			_granted++;
			_wish--;
			return true;
		}
		return false;

	}
	public int getGrantedWishes(){
		return _granted;
		
	}
	public abstract String toString();
}