import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DegreeTest {

	@Test (expected = IllegalArgumentException.class)
	public void ShouldThrowIllegalArgumentExceptionIfConstructorRecivesNull() {
		
		List<Grade> list1 = null;
		List<Grade> list2 = new ArrayList<>();
		
		list2.add(Grade.fromPercentage(100));
		list2.add(Grade.fromPercentage(100));
		list2.add(Grade.fromPercentage(100));
		list2.add(Grade.fromPercentage(100));
		

		Degree degree = new Degree(list1, list2);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void ShouldThrowIllegalArgumentExceptionIfConstructorRecivesNotFour() {
		
		List<Grade> list1 = new ArrayList<>();
		List<Grade> list2 = new ArrayList<>();
		
		list1.add(Grade.fromPercentage(100));
		
		list2.add(Grade.fromPercentage(100));
		list2.add(Grade.fromPercentage(100));
		list2.add(Grade.fromPercentage(100));
		list2.add(Grade.fromPercentage(100));
		

		Degree degree = new Degree(list1, list2);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void ShouldThrowIllegalArgumentExceptionIfConstructorRecivesInvalidList() {
		
		List<Grade> list1 = new ArrayList<>();
		List<Grade> list2 = new ArrayList<>();
		
		list1.add(Grade.fromPercentage(100));
		
		list2.add(Grade.fromPercentage(100));
		list2.add(Grade.fromPercentage(100));
		list2.add(Grade.fromPercentage(100));
		list2.add(Grade.fromPercentage(100));
		

		Degree degree = new Degree(list1, list2);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void ShouldThrowIllegalArgumentExceptionIfConstructorRecivesFailGrade() {
		
		List<Grade> list1 = new ArrayList<>();
		List<Grade> list2 = new ArrayList<>();
		
		list1.add(Grade.fromPercentage(100));
		list1.add(Grade.fromPercentage(100));
		list1.add(Grade.fromPercentage(100));
		list1.add(Grade.fromPercentage(0));
		
		
		
		list2.add(Grade.fromPercentage(100));
		list2.add(Grade.fromPercentage(100));
		list2.add(Grade.fromPercentage(100));
		list2.add(Grade.fromPercentage(100));
		

		Degree degree = new Degree(list1, list2);
	}
	
	
	@Test
	public void ShouldClassifytWithBothProfilesHavingSameClassification() {
		
		List<Grade> list1 = new ArrayList<>();
		List<Grade> list2 = new ArrayList<>();
		
		list1.add(Grade.fromPercentage(100));
		list1.add(Grade.fromPercentage(100));
		list1.add(Grade.fromPercentage(100));
		list1.add(Grade.fromPercentage(100));
		
		
		
		list2.add(Grade.fromPercentage(100));
		list2.add(Grade.fromPercentage(100));
		list2.add(Grade.fromPercentage(100));
		list2.add(Grade.fromPercentage(100));
		

		Degree degree = new Degree(list1, list2);
		
		assertEquals(degree.classify(), Classification.First);
		
		
		
	}
	
	@Test
	public void ShouldClassifyWithProfile5HigherAndClear() {
		
		List<Grade> list1 = new ArrayList<>();
		List<Grade> list2 = new ArrayList<>();
		
		list1.add(Grade.fromPercentage(100));
		list1.add(Grade.fromPercentage(100));
		list1.add(Grade.fromPercentage(100));
		list1.add(Grade.fromPercentage(100));
		
		
		
		list2.add(Grade.fromPercentage(60));
		list2.add(Grade.fromPercentage(60));
		list2.add(Grade.fromPercentage(60));
		list2.add(Grade.fromPercentage(60));
		

		Degree degree = new Degree(list1, list2);
		
		assertEquals(degree.classify(), Classification.First);
			
	}
	

	@Test
	public void ShouldClassifyWithProfile6HigherAndClear() {
		
		List<Grade> list1 = new ArrayList<>();
		List<Grade> list2 = new ArrayList<>();
		
		list1.add(Grade.fromPercentage(100));
		list1.add(Grade.fromPercentage(100));
		list1.add(Grade.fromPercentage(100));
		list1.add(Grade.fromPercentage(100));
		
		
		
		list2.add(Grade.fromPercentage(60));
		list2.add(Grade.fromPercentage(60));
		list2.add(Grade.fromPercentage(60));
		list2.add(Grade.fromPercentage(60));
		

		Degree degree = new Degree(list2, list1);
		
		assertEquals(degree.classify(), Classification.First);
			
	}
	
	@Test
	public void ShouldClassifyFirstDiscretion() {
		
		List<Grade> list1 = new ArrayList<>();
		List<Grade> list2 = new ArrayList<>();
		
		list1.add(Grade.fromPercentage(100));
		list1.add(Grade.fromPercentage(100));
		list1.add(Grade.fromPercentage(100));
		list1.add(Grade.fromPercentage(100));
		
		
		
		list2.add(Grade.fromPercentage(60));
		list2.add(Grade.fromPercentage(60));
		list2.add(Grade.fromPercentage(60));
		list2.add(Grade.fromPercentage(40));
		

		Degree degree = new Degree(list1, list2);
		
		assertEquals(degree.classify(), Classification.Discretion);
			
	}
	
	@Test
	public void ShouldClassifySecondDiscretion() {
		
		List<Grade> list1 = new ArrayList<>();
		List<Grade> list2 = new ArrayList<>();
		
		list1.add(Grade.fromPercentage(60));
		list1.add(Grade.fromPercentage(60));
		list1.add(Grade.fromPercentage(60));
		list1.add(Grade.fromPercentage(60));
		
		
		
		list2.add(Grade.fromPercentage(60));
		list2.add(Grade.fromPercentage(40));
		list2.add(Grade.fromPercentage(40));
		list2.add(Grade.fromPercentage(40));
		

		Degree degree = new Degree(list1, list2);
		
		assertEquals(degree.classify(), Classification.Discretion);
			
	}
	
	
}
