package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class Quize01_1 {

	public static void main(String[] args) {
		
		// ������ Ǯ�� 
		
		ArrayList nameArr = new ArrayList();
		ArrayList numArr = new ArrayList();
		
		int num, temp=0;
		Scanner input = new Scanner(System.in);
		String name = null, tel = null;
		
		while(true) {
			
			System.out.println("1. ����ó ���");
			System.out.println("2. ����ó ����");
			System.out.println("3. ����ó ����");
			System.out.println("4. ��� ����ó ����");
			System.out.println("5. ����");
			System.out.println(">>>");
			num = input.nextInt();
			
			switch(num) {
			
				case 1: 
					
					while(true) {
						System.out.println("�̸��� �Է��ϼ���");
						name = input.next();
						
						// �ش��ϴ� ���� �������� �ʴ´ٸ� -1 �� ǥ�� �ȴ�
						if(nameArr.indexOf(name) == -1) {
							break;
						}
						System.out.println("�����ϴ� �̸��Դϴ�. �ٽ� �Է��ϼ���");
					}
					System.out.println("��ȭ��ȣ�� �Է��ϼ���");
					tel = input.next();
					
					nameArr.add(name);
					numArr.add(tel);
					
					System.out.println("����Ϸ�");
					
					break;
					
					
				case 2: 
					
					System.out.println("�̸��� �Է��ϼ���");
					name = input.next();
					
					temp = nameArr.indexOf(name);
					
					if(temp == -1) {
						System.out.println("�������� �ʴ� �����Դϴ�.");
					}else {
						System.out.println("�̸� : " + name);
						System.out.println("��ȭ��ȣ : " + numArr.get(temp));
					}
					
					break;
					
					
				case 3: 
					
					System.out.println("�̸��� �Է��ϼ���");
					name = input.next();
					
					temp = nameArr.indexOf(name);
					
					if(temp == -1) {
						System.out.println("�������� �ʴ� �����Դϴ�.");
					}else {
						// ��� 1 ) nameArr.remove(temp);
						// 		   numArr.remove(temp);
						nameArr.remove(name);
						numArr.remove(numArr.get(temp));
						System.out.println("���� �Ϸ�");
					}
					
					break;
					
					
				case 4: 
					
					System.out.println("�̸�\t��ȭ��ȣ");
					System.out.println("============");
					
					for(int i=0; i < numArr.size(); i++) {
						System.out.println(nameArr.get(i) + "\t");
						System.out.println(numArr.get(i));
						System.out.println("---------------");
					}
					
					break;
					
					
				case 5: 
				
					System.exit(1); // ���α׷� ����
				
			}
			
		}
	}
	
}
