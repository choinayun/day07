package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class Quize01_1 {

	public static void main(String[] args) {
		
		// 선생님 풀이 
		
		ArrayList nameArr = new ArrayList();
		ArrayList numArr = new ArrayList();
		
		int num, temp=0;
		Scanner input = new Scanner(System.in);
		String name = null, tel = null;
		
		while(true) {
			
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.println(">>>");
			num = input.nextInt();
			
			switch(num) {
			
				case 1: 
					
					while(true) {
						System.out.println("이름을 입력하세요");
						name = input.next();
						
						// 해당하는 값이 존재하지 않는다면 -1 로 표시 된다
						if(nameArr.indexOf(name) == -1) {
							break;
						}
						System.out.println("존재하는 이름입니다. 다시 입력하세요");
					}
					System.out.println("전화번호를 입력하세요");
					tel = input.next();
					
					nameArr.add(name);
					numArr.add(tel);
					
					System.out.println("저장완료");
					
					break;
					
					
				case 2: 
					
					System.out.println("이름을 입력하세요");
					name = input.next();
					
					temp = nameArr.indexOf(name);
					
					if(temp == -1) {
						System.out.println("존재하지 않는 정보입니다.");
					}else {
						System.out.println("이름 : " + name);
						System.out.println("전화번호 : " + numArr.get(temp));
					}
					
					break;
					
					
				case 3: 
					
					System.out.println("이름을 입력하세요");
					name = input.next();
					
					temp = nameArr.indexOf(name);
					
					if(temp == -1) {
						System.out.println("존재하지 않는 정보입니다.");
					}else {
						// 방법 1 ) nameArr.remove(temp);
						// 		   numArr.remove(temp);
						nameArr.remove(name);
						numArr.remove(numArr.get(temp));
						System.out.println("삭제 완료");
					}
					
					break;
					
					
				case 4: 
					
					System.out.println("이름\t전화번호");
					System.out.println("============");
					
					for(int i=0; i < numArr.size(); i++) {
						System.out.println(nameArr.get(i) + "\t");
						System.out.println(numArr.get(i));
						System.out.println("---------------");
					}
					
					break;
					
					
				case 5: 
				
					System.exit(1); // 프로그램 종료
				
			}
			
		}
	}
	
}
