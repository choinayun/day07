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
		
			System.out.println("1. ����ó ���");
			System.out.println("2. ����ó ����");
			System.out.println("3. ����ó ����");
			System.out.println("4. ��� ����ó ����");
			System.out.println("5. ����");
			System.out.println(">>>");
			num = input.nextInt();
			
			if(num == 1) {
				
				System.out.println("�̸��� �Է��ϼ���");
				name = input.next();
				arr01.add(name);
				
				System.out.println("��ȭ��ȣ�� �Է��ϼ���");
				tel = input.next();
				arr02.add(tel);
			
				
			}else if(num == 2) {
				
				for(int a = 0; a <= arr01.size() && a <= arr02.size(); a++) {
					System.out.println("�̸� : " + arr01.get(a));
					System.out.println(arr01.get(a) + "�� ��ȭ��ȣ : " + arr02.get(a));
				}
			}
			
		}
	}
}
