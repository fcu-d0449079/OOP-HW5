package fcu.iecs.oop.pokemon;

public class GYM {
	
	public static void fight(Pokemon p1, Pokemon p2){
		String a[]={"Psyduck","Pikachu"};
		System.out.println("Winner is [name of "+ a[(int)(Math.random()*2)] +"].");
		if(a[(int)(Math.random()*2)] == p1.getname()){
			System.out.println(p1.getcp()+200);
		}
		else
		{
			System.out.println(p2.getcp()+200);
		}
	}
}
