
public class PezDispenser {

	public static final int MAX_PEZ = 12;
	final private String characterName;
	private int pezCount;
	
	public PezDispenser(String characterName) {
		this.characterName = characterName;
		pezCount = 0;
	}
	
	public void fill() {
		pezCount = MAX_PEZ;
	}
	
	public void fill(int pezAmt){
		int newAmt = pezCount + pezAmt;
		if (newAmt > MAX_PEZ){
			throw new IllegalArgumentException("Too many pez.");
		}
		
	}
	
	public boolean isEmpty() {
		return pezCount == 0;
	}
	
	public boolean dispense(){
		boolean wasDispensed = false;
		if (!isEmpty()) {
			pezCount--;
			wasDispensed = true;
		}
		return wasDispensed;
	}
	
	public String getCharacterName() {
		return characterName;
	}

}
