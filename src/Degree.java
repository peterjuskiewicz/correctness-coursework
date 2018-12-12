import java.util.List;

public class Degree {
	// Your additions/changes below this line

	private Profile profile5;	
	private Profile profile6;

	public Degree(List<Grade> year2, List<Grade> year3) throws IllegalArgumentException{
		
		if( year2 == null || year3 == null) {
			throw new IllegalArgumentException();
		}
		
		
		if(year2.isEmpty() || year3.isEmpty()) {
			throw new IllegalArgumentException();
		}
		

		profile6 = new Profile(year3);
		
		year2.addAll(year3);
		
		profile5 = new Profile(year2);
	
	}
		
	public Classification classify() {
		
		if(profile5.classify() == profile6.classify()) {
				return profile5.classify();
		} else if(profile5.classify().ordinal() - profile6.classify().ordinal() == 1 && profile5.isClear()) {
			
				return profile5.classify();
			
		} else if(profile6.classify().ordinal() - profile5.classify().ordinal() == 1 && profile6.isClear()) {
		
				return profile6.classify();
		}
			
		return Classification.Discretion;
	
	}
}
