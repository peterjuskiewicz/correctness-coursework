import java.util.List;
import java.util.stream.Collectors;

public class Profile {
	
	// Classification counters
	
	private int first = 0;
	private int upperSecond = 0;
	private int lowerSecond = 0;
	private int third = 0;
	
	private List<Grade> gradesList;

	public Profile(List<Grade> g) throws IllegalArgumentException{
		
		if(g == null || g.isEmpty()) {
			throw new IllegalArgumentException();
		}
		
		boolean isPass =
				g.stream().map(item -> item.classify()).collect(Collectors.toList()).contains(Classification.Fail);
		
		if(g.size() != 4 && g.size() != 8 || isPass) {
			throw new IllegalArgumentException();
		} 
		
		gradesList = g;	
		
		for(int i = 0; i < gradesList.size(); i++) {
			
			Classification grade = this.gradesList.get(i).classify();
			
			if(grade == Classification.First) {
				first++;
			} else if(grade == Classification.UpperSecond) {
				upperSecond++;
			} else if(grade == Classification.LowerSecond) {
				lowerSecond++;
			} else {
				third++;
			}}
		
		
	}
	
	
	public Classification classify() {
		
		int totalGrades = first + upperSecond + lowerSecond + third;
		
		int firstPercent = first * 100 / totalGrades;
		int upperSecondPercent = upperSecond * 100 / totalGrades;
		int lowerSecondPercent = lowerSecond * 100 / totalGrades;
		int thirdPercent = third * 100 / totalGrades;
		
		if(firstPercent >= 50) {
			return Classification.First;	
		} else if (upperSecondPercent >= 50) {
			return Classification.UpperSecond;
		} else if (lowerSecondPercent >= 50) {
			return Classification.LowerSecond;
		}else{
			return Classification.Third;
		}
		
		
	}

	public boolean isClear() {
		
		Classification classification = this.classify();
		
		if(classification != Classification.First && classification != Classification.UpperSecond) {
			return true;
		}
		
		if(third == 0) {
			return true;
		}
		
		return false;
	}
}
