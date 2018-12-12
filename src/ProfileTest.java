import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ProfileTest {

	@Test (expected = IllegalArgumentException.class)
	public void ShouldThrowIllegalArgumentExceptionIfConstructorRecivesNull() {
		
		Profile profile = new Profile(null);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void ShouldThrowIllegalArgumentExceptionIfConstructorRecivesEmptyList() {
		
		List<Grade> list = new ArrayList<>();
		
		Profile profile = new Profile(list);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void ShouldThrowIllegalArgumentExceptionIfConstructorRecivesListWithFail() {
		
		List<Grade> list = new ArrayList<>();
		
		list.add(Grade.fromPercentage(-1));
		list.add(Grade.fromPercentage(100));
		list.add(Grade.fromPercentage(100));
		list.add(Grade.fromPercentage(100));
		
		Profile profile = new Profile(list);
	}
	
	
	@Test
	public void ShouldClassifyPass2() {
		
		List<Grade> list = new ArrayList<>();
		
		list.add(Grade.fromPercentage(55));
		list.add(Grade.fromPercentage(55));
		list.add(Grade.fromPercentage(55));
		list.add(Grade.fromPercentage(100));
		
		Profile profile = new Profile(list);
		
		assertEquals(profile.classify(), Classification.LowerSecond);
		
	}
	
	@Test
	public void ShouldClassifyMeritPass3() {
		
		List<Grade> list = new ArrayList<>();
		
		list.add(Grade.fromPercentage(40));
		list.add(Grade.fromPercentage(50));
		list.add(Grade.fromPercentage(40));
		list.add(Grade.fromPercentage(40));
		
		Profile profile = new Profile(list);
		
		assertEquals(profile.classify(), Classification.Third);
		
	}
	
	@Test
	public void ShouldReturnFalseForBorderlineMerit() {
		
		List<Grade> list = new ArrayList<>();
		
		list.add(Grade.fromPercentage(40));
		list.add(Grade.fromPercentage(65));
		list.add(Grade.fromPercentage(65));
		list.add(Grade.fromPercentage(100));
		
		Profile profile = new Profile(list);
		
		assertEquals(profile.classify(), Classification.UpperSecond);
		
		assertFalse(profile.isClear());
		
	}
	
	@Test
	public void ShouldReturnTrueForBorderlineMerit() {
		
		List<Grade> list = new ArrayList<>();
		
		list.add(Grade.fromPercentage(65));
		list.add(Grade.fromPercentage(65));
		list.add(Grade.fromPercentage(65));
		list.add(Grade.fromPercentage(100));
		
		Profile profile = new Profile(list);
		
		assertEquals(profile.classify(), Classification.UpperSecond);
		
		assertTrue(profile.isClear());
		
	}
	
	@Test
	public void ShouldReturnFalseForBorderlineDistinction() {
		
		List<Grade> list = new ArrayList<>();
		
		list.add(Grade.fromPercentage(40));
		list.add(Grade.fromPercentage(100));
		list.add(Grade.fromPercentage(100));
		list.add(Grade.fromPercentage(100));
		
		Profile profile = new Profile(list);
		
		assertEquals(profile.classify(), Classification.First);
		
		assertFalse(profile.isClear());
		
	}
	
	@Test
	public void ShouldReturnTrueForBorderlineDistinction() {
		
		List<Grade> list = new ArrayList<>();
		
		list.add(Grade.fromPercentage(100));
		list.add(Grade.fromPercentage(100));
		list.add(Grade.fromPercentage(100));
		list.add(Grade.fromPercentage(100));
		
		Profile profile = new Profile(list);
		
		assertEquals(profile.classify(), Classification.First);
		
		assertTrue(profile.isClear());
		
	}
	


}
