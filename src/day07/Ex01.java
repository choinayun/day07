package day07;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		 컬렉션 프레임 워크 
		 컬렉션
		 - 다수의 데이터, 데이터 그룹
		 - 무한한 데이터의 집합 - 자바의 자료구조 
		 프레임 워크
		 - 하나의 틀
		 - 표준화된 프로그래밍 방식 
		 
		 List, Set, Map
		 
		 List(부모) 
		 - ArrayList
		 - LinkedList
		 - Stack ...
		 
		 ArrayList
		 - 하나의 자료형
		 - 순서를 유지한다 
		 - 데이터의 중복을 허용한다
		 
		 */
		
		ArrayList arr = new ArrayList();
		
		// add 
		// 값을 추가 
		// 그 값을 출력할땐 get 
		arr.add("123");
		arr.add("456");
		System.out.println(arr.get(0));
		System.out.println(arr.get(1)); 
		
		// size 
		// arraylist가 저장하고 있는 값의 갯수를 얻어온다. 
		// 배열에서는 length ,  array 에서는 size 
		System.out.println(arr.size()); 
		// int s = arr.size();
		// System.out.println(s);
		
		
		int[] a = new int[3];
		System.out.println(a.length); 
		
		
		// contains 
		// 해당하는 값이 있는지 확인 
		// 결과값은 boolean 으로 표시 
		boolean bool = arr.contains("123");
		
		if(bool == true) {
			System.out.println("123은 존재합니다.");
		}
		
		System.out.println(bool);
		System.out.println(arr.contains("12311"));
		
		
		// remove 삭제기능
		System.out.println(arr.remove("123"));
		System.out.println(arr.get(0));
		System.out.println(arr.size()); // 확인 
		
		
		// clear 전체 삭제
		arr.clear();
		System.out.println(arr.size());
		
		
		// indexOf
		// 해당하는 위치의 값 알려주는 
		arr.add("라면"); arr.add("소금");
		arr.add("순대");
		String index = "소금";
		int i = arr.indexOf(index);
		System.out.println(i+"번째 존재함");
		
		
		// set 
		// 특정 위치에 있는 값 변경할 때 사용
		System.out.println("변경 전 : " + arr.get(1));
		arr.set(i, "금금");
		System.out.println("변경 후 : " + arr.get(1));
		
	}
	
}



































