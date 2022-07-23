package kadai4_a3;

public class PasswordChecker {
	static final int PW_INVALID = 0; // 正しくないパスワード
	static final int PW_WEAK = 1; // 弱いパスワード
	static final int PW_STRONG = 2; // 強いパスワード
	int passLen;
	boolean includeNum, includeAlp, includeStr;

	int checkPassword(String password) {
		passLen = password.length();
		if (passLen < 6)
			return PW_INVALID;
		for (int i = 0; i < passLen; i++) {
			char c = password.charAt(i);
			if ('0' <= c && '9' >= c)
				includeNum = true;
			else if ('a' <= c && 'z' >= c || 'A' <= c && 'Z' >= c)
				includeAlp = true;
			else if ('-' == c || '_' == c)
				includeStr = true;
			else
				return PW_INVALID;
		}
		if (passLen >= 8 && includeNum && includeAlp && includeStr)
			return PW_STRONG;
		else if(includeNum && includeAlp)
			return PW_WEAK;
		else
			return PW_INVALID;
	}
}
