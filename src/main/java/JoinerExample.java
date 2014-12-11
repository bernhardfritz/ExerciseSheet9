import com.google.common.base.Joiner;

public class JoinerExample {

	public String join(String seperator, String...strings) {
		Joiner joiner = Joiner.on(seperator).skipNulls();
		return joiner.join(strings);
	}

	public static void main(String[] args) {
		JoinerExample j=new JoinerExample();
		System.out.println(j.join("; ", "Harry", null, "Ron", "Hermione"));
	}
}
