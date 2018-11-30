import java.util.List;

public class Degree {
	// Your additions/changes below this line

	private Profile profile5;	
	private Profile profile6;

	public Degree(List<Grade> year2, List<Grade> year3) {
		
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
		} else if(profile5.classify() == Classification.First && profile6.classify() == Classification.UpperSecond ||
				profile5.classify() == Classification.UpperSecond && profile6.classify() == Classification.First) {
			if(profile5.isClear() && profile6.isClear()) {
				return Classification.First;
			}
		} else if(profile5.classify() == Classification.UpperSecond && profile6.classify() == Classification.LowerSecond ||
				profile5.classify() == Classification.LowerSecond && profile6.classify() == Classification.UpperSecond) {
			if(profile5.isClear() && profile6.isClear()) {
				return Classification.UpperSecond;
			}
		} else if(profile5.classify() == Classification.LowerSecond && profile6.classify() == Classification.Third ||
				profile5.classify() == Classification.Third && profile6.classify() == Classification.LowerSecond) {
				return Classification.LowerSecond;
		} 
		
		return Classification.Discretion;
	
	}
}
