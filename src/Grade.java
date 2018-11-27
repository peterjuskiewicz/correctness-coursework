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
		
		Classification classification;
		
		int points = this.getPoints();
		
		switch(points) {
		case 20: case 19: case 18: case 17: classification = Classification.Fail;
		break;
		case 16: case 15: case 14: case 13: classification = Classification.Third;
		break;
		case 12: case 11: case 10: case 9: classification = Classification.LowerSecond;
		break;
		case 8: case 7: case 6: case 5: classification = Classification.UpperSecond;
		break;
		case 4: case 3: case 2: case 1: classification = Classification.First;
		break;
		default: classification = Classification.Fail;
		}
		
		return classification;
	}
	
	public static Grade fromPercentage(int g) throws IllegalArgumentException {
		
		if(g > 100 || g < -1) {
			throw new IllegalArgumentException();
		}
		
		Grade grade;
		
		if(g == -1) {
			grade = new Grade(20);
		} else if(g > -1 && g <= 29) {
			grade = new Grade(19);
			
		} else if(g > 29 && g <= 34) {
			grade = new Grade(18);
			
		} else if(g > 34 && g <= 39) {
			grade = new Grade(17);
			
		} else if(g > 39 && g <= 41) {
			grade = new Grade(16);
			
		} else if(g > 41 && g <= 44) {
			grade = new Grade(15);
			
		} else if(g > 44 && g <= 46) {
			grade = new Grade(14);
			
		} else if(g > 46 && g <= 49) {
			grade = new Grade(13);
			
		} else if(g > 49 && g <= 51) {
			grade = new Grade(12);
			
		} else if(g > 51 && g <= 54) {
			grade = new Grade(11);
			
		} else if(g > 54 && g <= 56) {
			grade = new Grade(10);
			
		} else if(g > 56 && g <= 59) {
			grade = new Grade(9);
			
		} else if(g > 59 && g <= 61) {
			grade = new Grade(8);
			
		} else if(g > 61 && g <= 64) {
			grade = new Grade(7);
			
		} else if(g > 64 && g <= 66) {
			grade = new Grade(6);
			
		} else if(g > 66 && g <= 69) {
			grade = new Grade(5);
			
		} else if(g > 69 && g <= 72) {
			grade = new Grade(4);
			
		} else if(g > 72 && g <= 75) {
			grade = new Grade(3);
			
		} else if(g > 75 && g <= 78) {
			grade = new Grade(2);
			
		} else {
			grade = new Grade(1);
		}
		
		
		return grade;
		
	}
}
