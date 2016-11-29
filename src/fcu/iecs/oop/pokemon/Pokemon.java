package fcu.iecs.oop.pokemon;

public class Pokemon {
		private String name;
		private int cp;
		public Pokemon(String name,int cp){  
			this.cp = cp;
			this.name = name;
		}
		public void setcp(int cp){
			this.cp = cp;
		}
		public String getname(){
			return name;
		}
		public int getcp(){
			return cp;
		}
}
