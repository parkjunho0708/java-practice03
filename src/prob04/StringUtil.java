package prob04;

public class StringUtil {

	public static String concatenate(String[] strArr) {
		StringBuilder builder = new StringBuilder();
		
		for(String s : strArr) {
		    builder.append(s);
		}
		
		return builder.toString();
	}
	
}
