package object;

public class StringPractice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "dtrtata{\"numbtrtrer\":\"1330\"}";
		String[] str1 = str.split("\\{");
		String key = str1[0];
		String[] str2 = str1[1].split(":");

		String subkey = str2[0].replaceAll("\"", "");
		String[] str3 = str2[1].split("\\}");

		int value = Integer.parseInt(str3[0].replaceAll("\"", ""));
		System.out.println(key);
		System.out.println(subkey);
		System.out.println(value);

	}

}
