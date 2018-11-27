import java.util.List;
import java.util.stream.Collectors;

public class Profile {
	// Your additions/changes below this line
	
	// Classification counters
	
	private int first = 0;
	private int upperSecond = 0;
	private int lowerSecond = 0;
	private int third = 0;
	
	private List<Grade> gradesList;

	public Profile(List<Grade> g) {
		
		if(g == null) {
			throw new IllegalArgumentException();
		}
		
		boolean isPass =
				g.stream().map(item -> item.classify()).collect(Collectors.toList()).contains(Classification.Fail);
		
		if(g.size() == 0 || isPass) {
			throw new IllegalArgumentException();
		} 
		
		gradesList = g;	
	}
	
	
	public Classification classify() {
		
		
		
		for(int i = 0; i < 4; i++) {
			
			Classification grade = this.gradesList.get(i).classify();
			
			if(grade == Classification.First) {
				first++;
			} else if(grade == Classification.UpperSecond) {
				upperSecond++;
			} else if(grade == Classification.LowerSecond) {
				lowerSecond++;
			} else if(grade == Classification.Third) {
				third++;
			}}
		
		if(first >= 2 && third <= 1) {
			return Classification.First;
		} else if (upperSecond >= 2 && third <= 1) {
			return Classification.UpperSecond;
		} else if (lowerSecond >= 2) {
			return Classification.LowerSecond;
		}else{
			return Classification.Third;
		}
		
	}

	public boolean isClear() {
		
		Classification classification = this.classify();
		
		if(classification == Classification.First || classification == Classification.UpperSecond) {
			
			if(third == 1) {
				return false;
			} else {
				return true;
			}
			
		}
		
		return false;
		
	}
}
