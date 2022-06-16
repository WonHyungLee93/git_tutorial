package sample05;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {
	private List<SungJukDTO2> list;
	
	public void setList(List<SungJukDTO2> list) {
		this.list = list;
	}
	
	@Override
	public void execute() {
		Scanner scn = new Scanner(System.in);
		System.out.print("삭제할 이름 : ");
		String name = scn.next();
		int count =0;
		Iterator<SungJukDTO2> it = list.iterator();
		
		while(it.hasNext()) {
			SungJukDTO2 sungJukDTO2 = it.next();
			if(sungJukDTO2.getName().equals(name)) {
				it.remove();
				count++;
			}
			
		}

		
		
		
		if(count==0) {
			System.out.println("찾고자하는 이름이없습니다.");
		}
	}

}
