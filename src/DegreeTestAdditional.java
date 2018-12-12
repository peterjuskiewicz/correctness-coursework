import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DegreeTestAdditional {

	@Test (expected = IllegalArgumentException.class)
	public void ShouldThrowIllegalArgumentExceptionIfConstructorRecivesNull() {
		
		List<Grade> list2 = null;
		List<Grade> list1 = new ArrayList<>();
		
		list1.add(Grade.fromPercentage(100));
		list1.add(Grade.fromPercentage(100));
		list1.add(Grade.fromPercentage(100));
		list1.add(Grade.fromPercentage(100));
		

		Degree degree = new Degree(list1, list2);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void ShouldThrowIllegalArgumentExceptionIfConstructorRecivesEmptyList() {
		
		List<Grade> list2 = new ArrayList<>();
		List<Grade> list1 = new ArrayList<>();
		
		list1.add(Grade.fromPercentage(100));
		list1.add(Grade.fromPercentage(100));
		list1.add(Grade.fromPercentage(100));
		list1.add(Grade.fromPercentage(100));
		

		Degree degree = new Degree(list1, list2);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void ShouldThrowIllegalArgumentExceptionIfConstructorRecivesEmptyList1() {
		
		List<Grade> list1 = new ArrayList<>();
		List<Grade> list2 = new ArrayList<>();
		
		
		list2.add(Grade.fromPercentage(100));
		list2.add(Grade.fromPercentage(100));
		list2.add(Grade.fromPercentage(100));
		list2.add(Grade.fromPercentage(100));
		

		Degree degree = new Degree(list1, list2);
	}
	
}
