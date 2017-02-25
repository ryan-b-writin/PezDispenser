
public class DespenserFactory {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Assembling New Pez Dispenser");
		System.out.printf("Maximum pez capacity: %d %n", PezDispenser.MAX_PEZ);
		
		PezDispenser dispenser = new PezDispenser("Chewbacca");
		
		System.out.printf("The head piece looks like %s. %n",dispenser.getCharacterName());
		if (dispenser.isEmpty()){
			System.out.println("Dispenser is currrently empty.");
		}
		System.out.println("Filling with candy...");
		dispenser.fill();
		if (!dispenser.isEmpty()){
			System.out.println("Dispenser filled.");
		}
		while (dispenser.dispense()){
			System.out.println("Eating single pez...");
		}
		if (dispenser.isEmpty()){
			System.out.println("ALL PEZ HAVE BEEN CONSUMED.");
		}
		System.out.println("MORE PLEASE.");
		dispenser.fill(3);
		while (dispenser.dispense()){
			System.out.println("Eating single pez...");
		}
		
	}
	
	
	
}
