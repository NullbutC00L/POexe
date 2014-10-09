import arabiannights.*;

public class arabiannights
{
	public static void main(String[] args)
	{
		MagicLamp lamp = new MagicLamp(4);
		Genio [] genies= new Genio[5];
		genies[0]=lamp.rub(2);
		genies[1]=lamp.rub(3);
		genies[2]=lamp.rub(4);
		genies[3]=lamp.rub(5);
		genies[4]=lamp.rub(1);
		for (int i=0;i<5;i++)
		{
			System.out.println (genies[i].toString()); 
		}

		for (int i=0;i<5;i++)
		{
			genies[i].grantWish(); 
		}

		for (int i=0;i<5;i++)
		{
			System.out.println (genies[i].toString()); 
		}
		lamp.feedDemon((RecyclableDemon)genies[4]);
		Genio genie = lamp.rub(7);
		System.out.print(genie.toString()+"\n");


	}
}