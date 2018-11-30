import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Grade> list = new ArrayList<>();
		
		list.add(Grade.fromPercentage(55));
		list.add(Grade.fromPercentage(55));
		list.add(Grade.fromPercentage(55));
		list.add(Grade.fromPercentage(100));
		
List<Grade> list1 = new ArrayList<>();
		
		list.add(Grade.fromPercentage(55));
		list.add(Grade.fromPercentage(55));
		list.add(Grade.fromPercentage(55));
		list.add(Grade.fromPercentage(100));
		
		Profile profile = new Profile(list);
		
		list.addAll(list1);
		
		System.out.println(profile.classify());
		
	}
}
