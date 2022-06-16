package basic;

public class BasicTest {

	public static void main(String[] args) {
		System.out.println('A'+ 3);
		System.out.println((char)('A'+ 3));
		System.out.println((char)('A'+ 32));
		System.out.println("A"+ 3);
		System.out.println('a' - 'A');// 영어 대문자와 소문자는 +32, -32
		System.out.println('0' - 0);
		System.out.println('2' - 2); // 숫자와 문자 사이는 +48 , -48
		System.out.println(2 + 5);
		System.out.println('2' + '5'); 			//103
		System.out.println('2'-48 + '5'-48); 	//7, 문자를 숫자로 변환
		System.out.println("2" + '5'); 			//"25"
		System.out.println(Integer.parseInt("2") + Double.parseDouble("5")); 		//7, 문자열을 숫자로 변환, 정수형(Integer), 실수형(Double)

	}

}
