package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		// 1부터 10까지 1씩 증가하며 출력하는 반복문 작성
		// 단, 5를 출력하면 반복문 종료
		
		
		for (int i = 0; i <= 10; i++) {
			
			System.out.print(i + " ");
			if( i == 5) {
				break;
			}
			
		}
	}
	
	public void ex2() {
		
		// 0이 입력될때 까지의 모든 정수의 합 구하기
		
		int input = 0;
		int sum = 0;
		
		// while문을 처음에 무조건 수행하고, 특정 조건에 종료하는 방법
		// 1) input에 초기값을 0이 아닌 다른값 while (input !=0)
		
		// 2) do ~while 문 사용
		
		// 3) 무한 루프 상태의 while문을 만들고
		// 		내부에 break 조건 작성
		
		while(true) { // 무한루프
			System.out.print("정수 입력 : ");
			input = sc.nextInt(); // 입력
			
			
			if(input == 0) {
				break;
			}
			sum += input;
		}
		System.out.println("합계  : " + sum);
	}
	
	public void ex3() {
		
		// 입력받은 모든 문자열을 누적
		// 단, "exit@" 입력시 문자열 누적을 종료하고 결과 출력
		
		String str = ""; // 빈 문자열
						// 쌍따옴표("")라는 기호를 이용해 String 리터럴임을 지정
						// 하지만 내용은 없음.
		
		while(true) {
			
			System.out.print("문자열 입력(exit@ 입력 시 종료) : ");
			
			String input = sc.nextLine();
			// next() : 다음 한 단어 (띄어쓰기 포함 X)
			// nextLine() : 다음 한 줄 (띄어쓰기 포함 0)
			
			
			if(input.equals("exit@")) {
				// String 자료형은 비교연산자(==)로 같은 문자열인지 판별할 수 없다.
				// 비교 연산자는 보통 기본자료형끼리의 연산에서만 사용 가능하다.
				// -> String 은 비교자료형이 아닌 참조형
				
				// ** 해결방법 : 문자열1.equals(문자열2) 으로 문자열 1과 문자열2 비교 가능
				
				break;	

				
			}
			str += input + "\n";
			
		}
		
		System.out.println("===========================");
		System.out.println(str);
		
	}
	
	public void ex4() {
		
		
		for (int i = 2; i <= 9; i++) {
			
			for (int y = 1; y <= i; y++) {
				int result = i * y;
				System.out.printf("%d x %d = %d  ",i, y, result);

				if (i == y) {
					break;
				}
			}
			System.out.println();
		}
	}

}
