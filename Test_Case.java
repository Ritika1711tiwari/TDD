package Tcs;

public class Test_Case {
	public int isValid(String password) {
//		int count=0;
//		for(int i=0;i<password.length();i++) {
//			if(password.contains(" ")) {
//				count++;
//			}
//		}
		if(password.length()<8) {
			return 0;
	}
		return 1;
}
}
