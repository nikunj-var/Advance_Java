package toggle_case;

public class App {
	public static void main(String[] args) {
		String str = "Apple";
		char[] ch = str.toCharArray();
		for(int i = 0;i<ch.length;i++) {
			if(ch[i] >= 65 && ch[i] <= 90) {
				ch[i]=(char)(ch[i]+32);
			}
			else if(ch[i] >= 97 && ch[i] <= 122) {
				ch[i] = (char)(ch[i]-32);
			}
		}
		System.out.println(ch);
	}
}
