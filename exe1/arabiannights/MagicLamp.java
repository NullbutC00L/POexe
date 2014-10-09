package arabiannights;
public class MagicLamp{
	private int _gens;
	private int _rubs;
	private int _demon;
	private int _wish;
	private int _capacity;
	
	public MagicLamp(int gens){
		_gens=gens;
		_capacity=gens;
	}
	public Genie rub(int wish){
		_wish=wish;
		if(_gens!=0){
			_gens--;
			_rubs++;
			if((_rubs-1)%2!=0){	
				return new FriendlyGenie(_wish);
				
			}
			else{

				return new GrumpyGenie(1);
				
			}
		}	
		else{
				return new RecyclableDemon(-1);
			
		}
		
	}
	public void feedDemon(RecyclableDemon demonio){
		if (!demonio.recycled()){
			demonio.recycle();
			_demon++;
			_rubs = 0;
			_gens=_capacity;
			
		}
	}
	public int getGenies(){
		return _gens;

	}
	public int getDemons(){
		return _demon;
	}
	public int capacity(){
		return _capacity;
	}
	public boolean equals(Object first){
		return this.capacity()==((MagicLamp)first).capacity() && this.getGenies()==((MagicLamp)first).getGenies()&&this.getDemons()==((MagicLamp)first).getDemons();
	}

}