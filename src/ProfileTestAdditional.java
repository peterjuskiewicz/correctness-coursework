import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ProfileTestAdditional {

	@Test
	public void shouldReturnClearForClassificationLowerThanUpperSecond() {
		
		List<Grade> list = new ArrayList<>();
		
		list.add(Grade.fromPercentage(50));
		list.add(Grade.fromPercentage(50));
		list.add(Grade.fromPercentage(50));
		list.add(Grade.fromPercentage(50));
		
		Profile profile = new Profile(list);
		
		assertTrue(profile.isClear());
		
	}
	


}
