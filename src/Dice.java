import java.util.Random;

/**
 * 
 */

/**
 * @author greg
 *
 */
public class Dice {

	/**
	 * 
	 */
	/*
	 * With this class we can create a RPG dice with a default
	 * value of 6 or we can choose how many faces they will be
	 * Added as well methods to generate a number
	 */
	// First we create the attributes
	private int faces = 0;
	private int face_selected = 1;
	
	//Default constructor. We create a 6 faces dice
	public Dice() {
		// TODO Auto-generated constructor stub

		this.faces = 6;
	
	}

	// Create a dice with number of faces in paramters
	public Dice(int nbfaces){
		
		this.faces = nbfaces;	
	}
	
	// Generate a random number from 1 to value of faces of the instance of the dice. Return nothing
	public void roll(){
		 int num_rolled = 0;
		 
		 Random rand = new Random();
		 num_rolled += rand.nextInt(this.faces) + 1 ;
		 this.face_selected = num_rolled;
		
	}
	
	// Generate a random number. Dice been flipped number of times. Return nothing
	
	public void roll(int num){
		 int num_rolled = 0;
		 int i = 0;
		 Random rand = new Random();
		 
		 while (i < num) {
		 num_rolled = 0;
		 num_rolled += rand.nextInt(this.faces) + 1;
		 i++;
		 }
		 this.face_selected = num_rolled;
		
	}
	
	// Get the number selected after a roll. Return an int
	public int getFace(){
		int theface = this.face_selected;
		
		return theface;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// testing
		// TODELETE Before prod
		Dice dice6 = new Dice();
		Dice dice10 = new Dice(10);
		
		dice6.roll();
		System.out.println("Premier jet ==> " + dice6.getFace());
		dice6.roll();
		System.out.println("Second jet ==> " + dice6.getFace());
		
		dice10.roll();
		System.out.println("Premier jet ==> " + dice10.getFace());
		dice10.roll(4);
		System.out.println("Second, relance 4 fois jet ==> " + dice10.getFace());

	}

}
