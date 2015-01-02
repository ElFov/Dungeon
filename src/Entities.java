
public class Entities {
	
	/*
	 * This class create default values for the Player and the NPC
	 */
	 String name ="Unknown";
	 int hp = 1;
	 int mp = 1 ;
	 int ap = 1;

	public Entities() {
		// TODO Auto-generated constructor stub
		

		
	}
	
	public void setName(String newname){
		
		this.name = newname.toString();
		
	}
	
	public void setHP(int newhp){
		
		this.hp = newhp;
		
	}
	public void setMP(int newmp){
		
		this.mp = newmp;
		
	}
	public void setAP(int newap){
		
		this.ap = newap;
		
	}
	
	public String getName(){
		
		return this.name.toString();
		
	}
	
	public int getHP(){
		
		return this.hp;
		
	}

	public int getMP(){
		
		return this.mp;
		
	}
	
	public int getAP(){
		
		return this.ap;
		
	}
	
	public void attackEntity(Entities newentity){
		
		newentity.hp -= this.ap;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
