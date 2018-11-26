import java.util.List;

public class Profile {
	// Your additions/changes below this line

	public Profile(List<Grade> g) {
		throw new IllegalArgumentException();
	}
	
	public Classification classify() {
		return Classification.Third;
	}

	public boolean isClear() {
		return true;
	}
}
