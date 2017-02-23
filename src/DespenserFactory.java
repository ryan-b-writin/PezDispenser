
public class DespenserFactory {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Assembling New Pez Dispenser");
		PezDispenser dispenser = new PezDispenser("Chewbacca");
		System.out.printf("The head piece looks like %s. %n",dispenser.getCharacterName());
	}
	
	
	
}
