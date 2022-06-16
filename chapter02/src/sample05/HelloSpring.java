package sample05;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloSpring helloSpring =  new HelloSpring();
		
		helloSpring.menu(context);
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void menu(ApplicationContext context) {
		
		Scanner scn = new Scanner(System.in);
		SungJuk sungJuk = null;
		int num;
		
		while(true) {
			System.out.println("*******************");
			System.out.println("\t1. 입력");
			System.out.println("\t2. 출력");
			System.out.println("\t3. 수정");
			System.out.println("\t4. 삭제");
			System.out.println("\t5. 끝");
			System.out.println("*******************");
			System.out.print("번호입력 : ");
			num = scn.nextInt();
			
			if(num == 5) {
				break;
			}else if(num ==1) {
				sungJuk = (SungJuk) context.getBean("sungJukInput");
			}else if(num==2) {
				sungJuk = (SungJuk) context.getBean("sungJukOutput");
			}else if(num==3) {
				sungJuk = (SungJuk) context.getBean("sungJukModify");
			}else if(num==4) {
				sungJuk = (SungJuk) context.getBean("sungJukDelete");
				
			}
			sungJuk.execute();
			
			
		}
		
		
	}

}
