package basic;

public class HelloTest {

	public static void main(String[] args) {
		System.out.print("Hello Java!!\n");
		System.out.println(25 + 36);
		System.out.println("25 + 36");
		System.out.println("25" + "36");//문자열에서 +는 덧셈이 아니라 결합
		System.out.println("25 + 36 = " + (25 + 36));
		System.out.println("25 / 36 = " + (25 / 36)); //정수 / 정수 = 정수
		System.out.println("25 / 36 = " + (25.0 / 36)); // 실수 / 정수 = 실수
		System.out.println("25 / 36 = " + ((double)25 / 36)); // 형변환 (Casting)
		System.out.println("25 / 36 = " + String.format("%.3f", (double)25 / 36)); // 소수이하 3째자리

	}

}
