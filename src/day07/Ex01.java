package day07;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		 �÷��� ������ ��ũ 
		 �÷���
		 - �ټ��� ������, ������ �׷�
		 - ������ �������� ���� - �ڹ��� �ڷᱸ�� 
		 ������ ��ũ
		 - �ϳ��� Ʋ
		 - ǥ��ȭ�� ���α׷��� ��� 
		 
		 List, Set, Map
		 
		 List(�θ�) 
		 - ArrayList
		 - LinkedList
		 - Stack ...
		 
		 ArrayList
		 - �ϳ��� �ڷ���
		 - ������ �����Ѵ� 
		 - �������� �ߺ��� ����Ѵ�
		 
		 */
		
		ArrayList arr = new ArrayList();
		
		// add 
		// ���� �߰� 
		// �� ���� ����Ҷ� get 
		arr.add("123");
		arr.add("456");
		System.out.println(arr.get(0));
		System.out.println(arr.get(1)); 
		
		// size 
		// arraylist�� �����ϰ� �ִ� ���� ������ ���´�. 
		// �迭������ length ,  array ������ size 
		System.out.println(arr.size()); 
		// int s = arr.size();
		// System.out.println(s);
		
		
		int[] a = new int[3];
		System.out.println(a.length); 
		
		
		// contains 
		// �ش��ϴ� ���� �ִ��� Ȯ�� 
		// ������� boolean ���� ǥ�� 
		boolean bool = arr.contains("123");
		
		if(bool == true) {
			System.out.println("123�� �����մϴ�.");
		}
		
		System.out.println(bool);
		System.out.println(arr.contains("12311"));
		
		
		// remove �������
		System.out.println(arr.remove("123"));
		System.out.println(arr.get(0));
		System.out.println(arr.size()); // Ȯ�� 
		
		
		// clear ��ü ����
		arr.clear();
		System.out.println(arr.size());
		
		
		// indexOf
		// �ش��ϴ� ��ġ�� �� �˷��ִ� 
		arr.add("���"); arr.add("�ұ�");
		arr.add("����");
		String index = "�ұ�";
		int i = arr.indexOf(index);
		System.out.println(i+"��° ������");
		
		
		// set 
		// Ư�� ��ġ�� �ִ� �� ������ �� ���
		System.out.println("���� �� : " + arr.get(1));
		arr.set(i, "�ݱ�");
		System.out.println("���� �� : " + arr.get(1));
		
	}
	
}



































