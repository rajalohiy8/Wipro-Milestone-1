//6b501a80
class UserMainCode2 {

	public String userIdGeneration(String input1, String input2, int input3, int input4) {
		// Read only region end
		// Write code here...}
		int f = input4 - 1,l;
		char inp21, inp31, inp41, a;
		int b;
		String output1 = null;
		StringBuffer inp1 = new StringBuffer(input1);
		StringBuffer inp2 = new StringBuffer(input2);
		StringBuffer inp3 = new StringBuffer(Integer.toString(input3));
		StringBuffer inp4 = new StringBuffer(Integer.toString(input4));

		if (input1.length() < input2.length()) {
			inp21 = inp1.charAt(0);
			inp31 = inp3.charAt(input4 - 1);
			l = inp3.length() - 1;
			inp41 = inp3.charAt(l - f);
			inp1 = new StringBuffer(Character.toString(inp21));
			inp3 = new StringBuffer(Character.toString(inp31));
			inp4 = new StringBuffer(Character.toString(inp41));
			inp1.append(input2).append(inp3).append(inp4);
			for (int i = 0; i < inp1.length(); i++) {
				a = inp1.charAt(i);
				b = (int) a;
				if (b >= 65 && b <= 90) {
					b = b + 32;
					char c = (char) b;
					inp1.setCharAt(i, c);
				} else if (b >= 97 && b <= 122) {
					b = b - 32;
					char c = (char) b;
					inp1.setCharAt(i, c);
				}
			}
			output1 = inp1.toString();
		}

		else if (input1.length() > input2.length()) {
			l = inp3.length() - 1;
			inp41 = inp3.charAt(l - f);
			inp21 = inp2.charAt(0);
			inp31 = inp3.charAt(input4 - 1);
			inp41 = inp3.charAt(l - f);

			inp2 = new StringBuffer(Character.toString(inp21));

			inp3 = new StringBuffer(Character.toString(inp31));

			inp4 = new StringBuffer(Character.toString(inp41));

			inp2.append(input1).append(inp3).append(inp4);
			for (int i = 0; i < inp2.length(); i++) {
				a = inp2.charAt(i);
				b = (int) a;
				if (b >= 65 && b <= 90) {
					b = b + 32;
					char c = (char) b;
					inp2.setCharAt(i, c);
				} else if (b >= 97 && b <= 122) {
					b = b - 32;
					char c = (char) b;
					inp2.setCharAt(i, c);
				}
			}
			output1 = inp2.toString();

		}

		else if (input1.length() == input2.length()) {
			int d, e;

			inp21 = inp2.charAt(0);
			char inp11 = inp1.charAt(0);
			e = (int) inp21;
			d = (int) inp11;
			if (e > d) {
				inp21 = inp1.charAt(0);
				inp31 = inp3.charAt(input4 - 1);
				l = inp3.length() - 1;
				inp41 = inp3.charAt(l - f);
				inp1 = new StringBuffer(Character.toString(inp21));
				inp3 = new StringBuffer(Character.toString(inp31));
				inp4 = new StringBuffer(Character.toString(inp41));
				inp1.append(input2).append(inp3).append(inp4);
				for (int i = 0; i < inp1.length(); i++) {
					a = inp1.charAt(i);
					b = (int) a;
					if (b >= 65 && b <= 90) {
						b = b + 32;
						char c = (char) b;
						inp1.setCharAt(i, c);
					} else if (b >= 97 && b <= 122) {
						b = b - 32;
						char c = (char) b;
						inp1.setCharAt(i, c);
					}
				}
				output1 = inp1.toString();
			} else {
				inp21 = inp2.charAt(0);
				inp31 = inp3.charAt(input4 - 1);
				l = inp3.length() - 1;
				inp41 = inp3.charAt(l - f);
				inp2 = new StringBuffer(Character.toString(inp21));
				inp3 = new StringBuffer(Character.toString(inp31));
				inp4 = new StringBuffer(Character.toString(inp41));
				inp2.append(input1).append(inp3).append(inp4);
				for (int i = 0; i < inp2.length(); i++) {
					a = inp2.charAt(i);
					b = (int) a;
					if (b >= 65 && b <= 90) {
						b = b + 32;
						char c = (char) b;
						inp2.setCharAt(i, c);
					} else if (b >= 97 && b <= 122) {
						b = b - 32;
						char c = (char) b;
						inp2.setCharAt(i, c);
					}
				}
				output1 = inp2.toString();
			}
		} else {

		}

		return output1;

	}
}

public class UserIdGen {

	public static void main(String[] args) {
		String a;
		UserMainCode2 abc = new UserMainCode2();
		a = abc.userIdGeneration("Rajiv", "roy", 560037, 6);
		System.out.println(a);
	}
}
