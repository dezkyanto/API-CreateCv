package id.dezkyanto.javaspring.createcv.util;

import java.util.UUID;

public class GenerateUUID {

	public static String getUUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replace("-", "");
	}

}
