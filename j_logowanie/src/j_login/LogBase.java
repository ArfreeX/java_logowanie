package j_login;

import java.util.HashMap;
import java.util.Map;

public class LogBase {

	public static void loginBase() {

		log.put("Admin", "admin1");
		log.put("ProtectedGood", "543acD12");
		log.put("ProtectedBad", "1234");
		log.put("NotProtected", "");
		log.put("User", "inf2017");
		log.put("Gosc", "brakHasla00");
		//log.put("", "");
	}

	public static boolean loginCheck(String login, String password) {

		if (log.containsKey(login)) {
			if (log.get(login).equals(password))
				return true;
			else
				return false;
		} else
			return false;
	}

	private static Map<String, String> log = new HashMap<>();
}
