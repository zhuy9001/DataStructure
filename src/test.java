/**
 * @Title: test.java
 * @Package
 * @Description: TODO
 * @author zhuy
 * @date 2017年3月9日 上午9:38:36
 * @version V1.0
 */
public class test {

	public static void main(String[] args) {
		String s1 = "Programming";
		reverse(s1);
		// String s2 = new String("Programming");
		// String s3 = "Program" + "ming";
		// System.out.println(s1 == s2);
		// System.out.println(s1 == s3);
		// System.out.println(s1 == s2.intern());
	}

	public static String reverse(String originStr) {
		if (originStr == null || originStr.length() <= 1)
			return originStr;
		return reverse(originStr.substring(1)) + originStr.charAt(0);
	}
}
