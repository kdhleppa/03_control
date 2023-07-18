package edu.kh.control.condition;

import java.util.Scanner;

public class SwitchExample {
	Scanner sc = new Scanner(System.in);
	
	/* switch문
	 * - 식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문
	 * -> 식의 결과로 얻은 값과 같은 case 구문이 수행된다.
	 * 
	 * [작성법]
	 * swich(식) {
	 * 
	 * case 결과값1 : 수행코드1; break;
	 * case 결과값2 : 수행코드2; break;
	 * .....
	 * deafault : case를 모두 만족하지 않을 경우 수행하는 코드;
	 * 
	 * }
	 */

	public void ex1() {
		
		
		
		int colorNum = sc.nextInt();
		// 키보드로 정수를 입력받아
		// 1 이면 "빨강색"
		// 2 이면 "주황색"
		// 3 이면 "노란색"
		// 4 이면 "초록색"
		// 1~4 사이 숫자가 아니면 "흰색" 출력
		String color;
		
		switch(colorNum) {
		case 1: color = "빨강색"; break;
		case 2: color = "주황색"; break;
		case 3: color = "노란색"; break;
		case 4: color = "초록색"; break;
		default : color = "흰색";
		}
		System.out.println(color);
	}
	
	
	public void ex2() {
		
		System.out.print("달(월) 입력 : ");
		int month = sc.nextInt();
		String result;
		
		
		switch(month) {
		case 3 : case 4: case 5: result = "봄"; break;
		case 6 : case 7: case 8: result = "여름"; break;
		case 9 : case 10: case 11: result = "가을"; break;
		case 12 : case 1: case 2: result = "겨울"; break;
		default : result = "잘못입력";
		}
		
		System.out.println(result);
		
	}
}
