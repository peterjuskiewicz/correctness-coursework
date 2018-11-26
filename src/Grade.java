public class Grade {
	private final int points;

	public int getPoints() {
		return points;
	}

	public Grade(int p) throws IllegalArgumentException {
		if(p<1 || p>20) 
			throw new IllegalArgumentException();
		points = p;
	}
	
	// Your additions/changes below this line

	public Classification classify() {
		return Classification.Fail;
	}
	
	public static Grade fromPercentage(int g) throws IllegalArgumentException {
		throw new IllegalArgumentException();
	}
}
