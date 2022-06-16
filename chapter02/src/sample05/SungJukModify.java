package sample05;

import java.util.List;
import java.util.Scanner;

public class SungJukModify implements SungJuk {
	private List<SungJukDTO2> list;
	
	
	
	public void setList(List<SungJukDTO2> list) {
		this.list = list;
	}



	@Override
	public void execute() {
		Scanner scn = new Scanner(System.in);
		System.out.print("수정할 이름 입력 : ");
		String name = scn.next();
		int count =0;
		
		for( SungJukDTO2 sungJukDTO2 : list ) {
			
			if(sungJukDTO2.getName().equals(name)) {
				count ++;
				
				System.out.print("국어점수 입력 :");
				int kor = scn.nextInt();
				sungJukDTO2.setKor(kor);
				System.out.print("영어점수 입력 :");
				int eng = scn.nextInt();
				sungJukDTO2.setEng(eng);
				
				System.out.print("수학점수 입력 :");
				int math = scn.nextInt();
				sungJukDTO2.setMath(math);
				
				System.out.println(sungJukDTO2.getName()+"님 수정 완료");
			}
		}//for
		if(count==0) {
			System.out.println("찾고자하는 이름이없습니다.");
		}
		
	}

}
