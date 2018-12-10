import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.*;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class GradeTestParam {
	
	
	@Parameters
	public static Collection<Object[]> data() {
		
		
		return Arrays.asList(new Object[][] {

				{ 100, 1 }, { 99, 1 }, { 98, 1 }, { 97, 1 }, { 96, 1 }, { 95, 1 }, { 94, 1 }, { 93, 1 }, { 92, 1 }, { 91, 1 },
				{ 90, 1 }, { 89, 1 }, { 88, 1 }, { 87, 1 }, { 86, 1 }, { 85, 1 }, { 84, 1 }, { 83, 1 }, { 82, 1 }, { 81, 1 },
				{ 80, 1 }, { 79, 1 }, { 78, 2 }, { 77, 2 }, { 76, 2 }, { 75, 3 }, { 74, 3 }, { 73, 3 }, { 72, 4 }, { 71, 4 },
				{ 70, 4 }, { 69, 5 }, { 68, 5 }, { 67, 5 }, { 66, 6 }, { 65, 6 }, { 64, 7 }, { 63, 7 }, { 62, 7 }, { 61, 8 },
				{ 60, 8 }, { 59, 9 }, { 58, 9 }, { 57, 9 }, { 56, 10 }, { 55, 10 }, { 54, 11 }, { 53, 11 }, { 52, 11 }, { 51, 12 },
				{ 50, 12 }, { 49, 13 }, { 48, 13 }, { 47, 13 }, { 46, 14 }, { 45, 14 }, { 44, 15 }, { 43, 15 }, { 42, 15 }, { 41, 16 },
				{ 40, 16 }, { 39, 17 }, { 38, 17 }, { 37, 17 }, { 36, 17 }, { 35, 17 }, { 34, 18 }, { 33, 18 }, { 32, 18 }, { 31, 18 },
				{ 30, 18 }, { 29, 19 }, { 28, 19 }, { 27, 19 }, { 26, 19 }, { 25, 19 }, { 24, 19 }, { 23, 19 }, { 22, 19 }, { 21, 19 },
				{ 20, 19 }, { 19, 19 }, { 18, 19 }, { 17, 19 }, { 16, 19 }, { 15, 19 }, { 14, 19 }, { 13, 19 }, { 12, 19 }, { 11, 19 },
				{ 10, 19 }, { 9, 19 }, { 8, 19 }, { 7, 19 }, { 6, 19 }, { 5, 19 }, { 4, 19 }, { 3, 19 }, { 2, 19 }, { 1, 19 }, { 0, 19 },
				{ -1, 20 }
				
		});

	}

	@Parameter
	public int PercentageInput;

	@Parameter(1)
	public int GradeExpected;

	@Test 
	public void shouldCreateObjectWithGrade6() {
		
		Grade grade = Grade.fromPercentage(PercentageInput);
		
		assertEquals(grade.getPoints(), GradeExpected);
		
	}
	


}
