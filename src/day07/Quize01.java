package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class Quize01 {

	public static void main(String[] args) {
		
		ArrayList arr01 = new ArrayList();
		ArrayList arr02 = new ArrayList();
		
		int num;
		String name = null, tel = null;
		Scanner input = new Scanner(System.in);
		
		while(true) {
		
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.println(">>>");
			num = input.nextInt();
			
			if(num == 1) {
				
				System.out.println("이름을 입력하세요");
				name = input.next();
				arr01.add(name);
				
				System.out.println("전화번호를 입력하세요");
				tel = input.next();
				arr02.add(tel);
			
				
			}else if(num == 2) {
				
				for(int a = 0; a <= arr01.size() && a <= arr02.size(); a++) {
					System.out.println("이름 : " + arr01.get(a));
					System.out.println(arr01.get(a) + "의 전화번호 : " + arr02.get(a));
				}
			}
			
		}
	}
}
