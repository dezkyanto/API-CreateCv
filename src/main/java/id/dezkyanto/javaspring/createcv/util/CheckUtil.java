package id.dezkyanto.javaspring.createcv.util;

public class CheckUtil {

	public static boolean isNotNull(Object object) {
		
		if (object != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isNull(Object object) {
		if (object != null) {
			return false;
		} else {
			return true;
		}
	}
}
