package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	
	Scanner sc = new Scanner(System.in);
	
	/* for 문
	 * - 끝이 정해져 있는(횟수가 지정되어 있는) 반복문
	 * 
	 * [작성법]
	 * 
	 * for (초기식; 조건식; 증감식) {
	 * 		반복 수행할 코드
	 * }
	 * 
	 * - 초기식 : for문을 제어하는 용도의 변수 선언
	 * 
	 * - 조건식 : for문의 반복 여부를 지정하는 식.
	 * 				보통 초기식에 사용된 변수를 이용하여 조건식을 작성한다.
	 * 
	 * - 증감식 : 초기식에 사용된 변수르
	 * 				for문이 끝날 때 마다 증가 또는 감소시켜
	 * 				조건시의 결과를 변하게 하는 식
	 */
	
	public void ex1() {
		// for 문 기초 사용법1
		// 1~10 출력하기
		// 1부터 10까지 1씩 증가하며 출력
		
		// * 반복문은 조건식이 true일 때만 반복한다.
		
		for (int i = 1 ; i <= 10; i++) {
			
			System.out.println(i);
		}
	}
	
	public void ex2() {
		// 3에서 7까지 1씩 증가하며 출력
		
		for (int i = 3; i <= 7; i++) {
			
			System.out.println(i);
			
		}
	}
	
	
	public void ex3() {
		// 2 부터 15까지 1씩 증가하며 출력
		
		for (int i = 2; i <= 15; i++) {
			System.out.println(i);
		}
	}
	
	public void ex4() {
		// 1부터 입력받은 수까지 1씩 증가하며 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		
		
		for (int i = 1; i <= input; i++) {
			System.out.println(i);
		}
				
		
		
	}
	
	public void ex5() {
		// 1 부터 입력 받은 수 가지 2씩 증가하며 출력
		
		
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= input; i +=2 ) {
			System.out.println(i);
		}
		
	}
	
	public void ex6() {
		// 1.0부터 입력 받은 실수 까지 0.5씩 증가하며 출력
		
		System.out.print("숫자 입력 : ");
		double input = sc.nextDouble();
		
		for (double i = 1.0 ; i <= input; i += 0.5) {
			System.out.println(i);
		}
	}
	
	public void ex7() {
		// 영어 알파벳 A 부터 Z 까지 한줄로 출력
		// ABCDEF....Z
		
		// * char 자료형은 문자형이지만 실제로 정수를 저장한다.
		
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.print( (char)i );
		}
		
		System.out.println("\n---------------------------");
		
		for(char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
		
	}
	
	public void ex8() {
		// 10에서 1까지 1씩 감소하며 출력
		
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
	}
	
	public void ex9() {

		// for문 응용 1: 반복문을 이용한 값의 누적
		// 1부터 10까지 모든 정수의 합 구하기
		
		int sum = 0; // 반복되어 증가되는 i의 값을 합계를 저장할 변수
						// 0으로 시작하는 이유 : 아무것도 더하지 않음으로
												// 정확한 결과를 도출할 수 있기때문
		for (int i = 1; i <= 10; i++) {
			// sum = sum + i
			sum += i;
			
			
					
		}
		System.out.println(sum);
	}
	
	public void ex10() {
		
		// for문 응용 2: 정수 5개를 입력 받아서 합계 구하기
		
	
		
		int sum = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.printf("입력 %d : ", i);
			int input = sc.nextInt();
			
			sum += input; // sum에 입력받은 input값 누적
		}
		System.out.println(sum);
		
	}
	
	public void ex11() {
		// 정수를 몇 번 입력 받을지 먼저 입력 받고
		// 입력된 정수의 합계를 출력
		
		int sum = 0;
		System.out.print("입력 받을 정수의 개수 : ");
		int input1 = sc.nextInt();
		
		
		for (int i = 1; i <= input1; i++) {
			System.out.print("입력 "+ i + " : ");
			int input2 = sc.nextInt();
			
			sum += input2;
			
		}
		System.out.println("합계 : " + sum);
		
		
	}
	
	public void ex12() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 5의 배수 () 를 붙여서 출력
		
		
		for (int i = 0; i <= 20; i++) {
			if (i % 5 ==0) {
				System.out.print("(" + i + ") ");
				
			} else {
				System.out.print(i + " ");
			}
		}
		
		
	}
	
	public void ex13() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 입력 받은 수의 배수는 () 표시
		
		System.out.print("괄호를 표시할 배수 : ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= 20; i++) {
			if (i % input == 0) {
				System.out.print("(" + i + ") ");
			} else {
				System.out.print(i + " ");
			}
		}
	}
	
	public void ex14() {
		// [구구단 출력]
		// 2~9 사이 수를 하나 입력받아
		// 해당 단을 출력
		// 닻, 입력받은수가 2~9 사이 숫자가 아니면 "잘못입력하셨습니다." 출력
		
		
		
		System.out.print("출력할 구구단의 단수 : ");
		int num = sc.nextInt();
		
		if (num <= 9 && num >= 2) {
	
			for (int i = 1; i <=9; i++) {
				int num2 = num * i;
				System.out.println(num + " X " + i + " = " + num2);
			}
		} else {
			System.out.print("잘못입력하셨습니다.");
				
		}
	}
	
	public void ex15() {
		// [19단 출력기]
		System.out.print("단 : ");
		int dan = sc.nextInt();
		
		if (dan <=19 && dan >=2) {
			
			for (int i = 1; i <= 19; i++) {
				int num = dan * i;
				System.out.printf("%d X %d = %d\n", dan, i, num);
			}
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
	}
	
	public void ex16() {
		
		//구구단 모두 출력하기
		
		
		for ( int i = 2; i <= 9; i++) { // 2 ~ 9 단까지 차례대로 증가
			
			for (int y = 1; y <= 9; y ++) { // 각 단에 곱해질 수 1~9까지 증가
				
				System.out.printf("%2d X %2d = %2d ", i, y, i * y);
				
			}
			System.out.println(); // 아무내용 없는 println은 줄바꿈
			System.out.printf("===============%d단==============\n", i);
		}
			
		
		
		
		
	}
	
	public void ex17() {
		// 구구단 역순 출력
		// 9단 -> 2단까지 역방향
		// 곱해지는 수는 1 - > 9 정방향
		
		
		for (int i = 9; i >=2; i--) {
			System.out.printf("====================%d단==================\n", i);
			for (int y = 1; y <= 9; y++) {
				
				System.out.println(i + " X " + y + " = " + i * y);
				
			}
			
		}
	}
	
	
	public void ex18() {
		// 2중 for 문을 이용해서 다음 모양을 출력하시오
		
		
		// 12345 다섯줄
		
		
		for (int i = 1; i <= 5; i++) {
			
			for (int y = 1; y <= 5; y++) {
				
				System.out.print(y);
			}
			System.out.println();
		} 
	}
	
	public void ex19() {
		// 54321 세줄
		
		for (int i = 1; i <= 3; i++) {
			
			for (int j = 5; j>= 1; j--) {
				
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}
	
	public void ex20() {
		
		//1
		//12
		//123
		//1234
		
		for (int i = 1; i <= 4; i++) { // 줄반복
			
			for (int j = 1; j <= i; j++) { // 출력 반복
				System.out.print(j);
				
			}
			
			System.out.println();
		}
		
	}
	
	public void ex21() {
		
		for (int x = 4; x >= 1; x--) {
			
			for (int i = x; i >= 1; i--) {
				
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	
	public void ex22() {
		String str = " ";
		for (int x = 1; x <= 5; x++) {
			
			for (int y = 1; y <= x; y++) {
				System.out.printf("", str);
				System.out.print("*");
			}
			System.out.print(" ");
			System.out.println();
			
			
		
		}
	}
	
	public void ex23() {
		
		// 숫자세기 count
		// 1부터 20까지 1씩 증가하면서
		// 3의 배수의 총 개수 출력
		// 3의 배수의 합계 출력
		
		// 3 6 9 12 15 18 : 6개
		// 3의 배수 합계 : 63
		
		int count = 0; // 3의 배수의 개수를 세기 위한 변수
		int sum = 0; // 3의 배수의 합계를 위한 변수
		
		
		for (int i = 1; i <= 20; i++) {
			
			if (i % 3 == 0) {
				System.out.print(i + " ");
				count++;
				sum += i;
			}
		}
		
		System.out.println(": " + count + "개");
		System.out.println("3의 배수 합계 : " + sum);
	}
	
	public void ex24() {
		// 2중 for 문과 count 를 이용해서 아래 모양 출력하기
		
		// 1  2  3  4
		// 5  6  7  8
		// 9 10 11 12
		
		int count = 1;
		
		for (int i = 1; i <= 3; i++) { // 3줄
			for (int y = 1; y <= 4; y++) { // 4칸
				
				System.out.printf("%3d", count);
				count++;
				}
			}
			System.out.println();
		
		
	}
	
	
	public void ex25() {
		
		String n;
		for (int dan = 2; dan <= 9; dan++) {
			for (int num = 1; num <= 9; num ++) {
				int result = dan * num;
				if (result >= 10) {
					n = "       ";
				} else {
					n = "        ";
				}
				System.out.printf("%d X %d = %d%s", dan, num, result, n);
				
						
			}System.out.println();
		}
		
	}

}
