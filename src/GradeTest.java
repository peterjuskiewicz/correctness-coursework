import static org.junit.Assert.*;

import org.junit.Test;

public class GradeTest {

	@Test (expected = IllegalArgumentException.class)
	public void shouldThrowExceptionIfConstructorRecivesInvalidInput1() {
		
		Grade grade = new Grade(0);	
	
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void shouldThrowExceptionIfConstructorRecivesInvalidInput2() {
			
		Grade grade1 = new Grade (21);
		
	}
	
	
	@Test
	public void shouldCreateObjectWithValidConstructorInput() {
		
		int p = 1;
		
		Grade grade = new Grade(p);
		
		assertEquals(p, grade.getPoints());		
		
	}
	
	@Test
	public void shoudReturnClassificationFail() {
		
		Grade grade = new Grade(20);
		
		Classification classification = grade.classify();
		
		assertEquals(classification, Classification.Fail);
		
		
	}
	
	@Test
	public void shoudReturnClassificationThird() {
		
		Grade grade = new Grade(16);
		
		Classification classification = grade.classify();
		
		assertEquals(classification, Classification.Third);
		
		
	}
	
	@Test
	public void shoudReturnClassificationLowerSecond() {
		
		Grade grade = new Grade(12);
		
		Classification classification = grade.classify();
		
		assertEquals(classification, Classification.LowerSecond);
		
		
	}
	
	@Test
	public void shoudReturnClassificationUpperSecond() {
		
		Grade grade = new Grade(8);
		
		Classification classification = grade.classify();
		
		assertEquals(classification, Classification.UpperSecond);
		
		
	}
	
	@Test
	public void shoudReturnClassificationFirst() {
		
		Grade grade = new Grade(1);
		
		Classification classification = grade.classify();
		
		assertEquals(classification, Classification.First);
		
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void shouldThrowExceptionIfFromPercentageMethodRecivesInvalidInput1() {
		
		Grade.fromPercentage(-2);
		
	}
	
	
	@Test (expected = IllegalArgumentException.class)
	public void shouldThrowExceptionIfFromPercentageMethodRecivesInvalidInput2() {
		
		Grade.fromPercentage(101);
	
	}
	
	@Test 
	public void shouldCreateObjectWithGrade20() {
		
		Grade grade = Grade.fromPercentage(-1);
		
		assertEquals(grade.getPoints(), 20);
		
	}
	
	@Test 
	public void shouldCreateObjectWithGrade19() {
		
		Grade grade = Grade.fromPercentage(0);
		
		assertEquals(grade.getPoints(), 19);
		
	}
	
	
	@Test 
	public void shouldCreateObjectWithGrade18() {
		
		Grade grade = Grade.fromPercentage(30);
		
		assertEquals(grade.getPoints(), 18);
		
	}
	
	@Test 
	public void shouldCreateObjectWithGrade17() {
		
		Grade grade = Grade.fromPercentage(35);
		
		assertEquals(grade.getPoints(), 17);
		
	}
	
	@Test 
	public void shouldCreateObjectWithGrade16() {
		
		Grade grade = Grade.fromPercentage(40);
		
		assertEquals(grade.getPoints(), 16);
		
	}
	
	@Test 
	public void shouldCreateObjectWithGrade15() {
		
		Grade grade = Grade.fromPercentage(42);
		
		assertEquals(grade.getPoints(), 15);
		
	}
	
	@Test 
	public void shouldCreateObjectWithGrade14() {
		
		Grade grade = Grade.fromPercentage(45);
		
		assertEquals(grade.getPoints(), 14);
		
	}
	
	@Test 
	public void shouldCreateObjectWithGrade13() {
		
		Grade grade = Grade.fromPercentage(47);
		
		assertEquals(grade.getPoints(), 13);
		
	}
	
	
	@Test 
	public void shouldCreateObjectWithGrade12() {
		
		Grade grade = Grade.fromPercentage(50);
		
		assertEquals(grade.getPoints(), 12);
		
	}
	
	@Test 
	public void shouldCreateObjectWithGrade11() {
		
		Grade grade = Grade.fromPercentage(52);
		
		assertEquals(grade.getPoints(), 11);
		
	}
	
	@Test 
	public void shouldCreateObjectWithGrade10() {
		
		Grade grade = Grade.fromPercentage(55);
		
		assertEquals(grade.getPoints(), 10);
		
	}
	
	@Test 
	public void shouldCreateObjectWithGrade9() {
		
		Grade grade = Grade.fromPercentage(57);
		
		assertEquals(grade.getPoints(), 9);
		
	}
	
	@Test 
	public void shouldCreateObjectWithGrade8() {
		
		Grade grade = Grade.fromPercentage(60);
		
		assertEquals(grade.getPoints(), 8);
		
	}
	
	@Test 
	public void shouldCreateObjectWithGrade7() {
		
		Grade grade = Grade.fromPercentage(62);
		
		assertEquals(grade.getPoints(), 7);
		
	}
	
	@Test 
	public void shouldCreateObjectWithGrade6() {
		
		Grade grade = Grade.fromPercentage(65);
		
		assertEquals(grade.getPoints(), 6);
		
	}
	
	@Test 
	public void shouldCreateObjectWithGrade5() {
		
		Grade grade = Grade.fromPercentage(67);
		
		assertEquals(grade.getPoints(), 5);
		
	}
	
	@Test 
	public void shouldCreateObjectWithGrade4() {
		
		Grade grade = Grade.fromPercentage(70);
		
		assertEquals(grade.getPoints(), 4);
		
	}
	
	@Test 
	public void shouldCreateObjectWithGrade3() {
		
		Grade grade = Grade.fromPercentage(73);
		
		assertEquals(grade.getPoints(), 3);
		
	}
	
	@Test 
	public void shouldCreateObjectWithGrade2() {
		
		Grade grade = Grade.fromPercentage(76);
		
		assertEquals(grade.getPoints(), 2);
		
	}
	
	@Test 
	public void shouldCreateObjectWithGrade1() {
		
		Grade grade = Grade.fromPercentage(79);
		
		assertEquals(grade.getPoints(), 1);
		
	}

}
