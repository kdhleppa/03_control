package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {
	
	public void ex1() {
		
		// if문
		// 조건식이 true일때만 내부 코드 수행
		
		/* 
		 * [작성법]
		 * if(조건식) {
		 *      조건식이 true 일 때 수행할 코드
		 * }
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 입력된 정수가 양수인지 검사
		if ( input > 0) {
			System.out.println("양수입니다");
			
		}
		if ( input <= 0) {
			System.out.println("양수가 아닙니다");
			
		}
	}
	
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		
		// if - else 문
		// 조건식 결과가 true 면 if 문,
		// false 면 else구문이 수행된다.
		
		/* if(조건식) {
		 * 		조건식이 true일때 수행 될 코드
		 * } else {
		 * 		조건식이 false일때 수행 될 코드
		 * }
		 * 
		 */
		
		int input = sc.nextInt();
		
		if (input % 2 != 0) {
			System.out.println("홀수입니다");
			
		} else { // 짝수 또는 0 입력시 수행 
			if(input == 0) {
				System.out.println("0입니다.");
			} else {
					System.out.println("짝수입니다");
				}
		}

		}
		
		
		
		public void ex3() {
			
			// 양수, 음수, 0 판별
			
			// if - else if - else
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수입력 : ");
			int input = sc.nextInt();
			
			if(input > 0) { // input이 양수일 경우
				System.out.println("양수입니다.");
			} else if (input < 0 ) {
				System.out.println("음수입니다.");
			} else {
				System.out.println("0입니다");
			}
			
			
		
		}
		
		public void ex4() {
			
			Scanner sc = new Scanner(System.in);
			
			// 달(month)을 입력받아 해당 달에 맞는 계절 출력
			// 단, 겨울일때 온도가 -15도 이하 "한파 경보", -12이하 "한파 주의보"
			// 여름일때 온도가 35도 이상 "폭염 경보, 33도 이상 "폭염 주의보"
			// 1~12 사이가 아닐땐 "해당하는 계절이 없습니다" 출력
			
			
			
			System.out.print("몇월입니까? : ");
			int month = sc.nextInt();
			
			System.out.print("온도는 몇도입니까? : ");
			int temperature = sc.nextInt();
					
			String season; // 아래 조건문 수행 결과를 저장할 변수 선언
			
			if (month == 1 || month == 2 || month == 12) {
				season = "겨울";
				if (temperature <= -15) {
					season += " 한파 경보";
				} else if (temperature <= -12) {
					season += " 한파 주의보";
				}
			} else if (month >= 3 && month <=5) {
				season = "봄";
			} else if (month >=6 && month <= 8) {
				season = "여름";
				if (temperature >=35) {
					season += " 폭염 경보";
				} else if (temperature >= 33) {
					season += " 폭염 주의보"; 
				}
			} else if (month >= 9 && month <= 11) {
				season = "가을";
			} else {
				season = "해당하는 계절이 없습니다.";
			}
			System.out.println(season);
		}
		
		
		public void ex5() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			if (age <= 13 && age >= 0) {
				System.out.print("어린이 입니다.");
				
			} else if (age > 13 && age <=19 ) {
				System.out.print("청소년 입니다.");
			} else if (age > 19 ) {
				System.out.print("성인 입니다.");
			}
		}
		
		public void ex6() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("점수 : ");
			int score = sc.nextInt();
			
			if (score < 0 || score > 100) {
				System.out.print("잘못 입력하셨습니다");
			} else if (score >= 90) {
				System.out.print("A");
			} else if (score >= 80) {
				System.out.print("B");
			} else if (score >= 70) {
				System.out.print("C");
			} else if (score >= 60) {
				System.out.print("D");
			} else if (score < 60) {
				System.out.print("F");
			}
		}
		
		public void ex7() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("키 : ");
			double height = sc.nextDouble();
			
					
			if (age < 0 || age > 100) {
				System.out.print("잘못 입력 하셨습니다.");
			} else if  (age >= 12) {
				
				if (height >= 140.0) {
					System.out.print("탑승 가능");
					
				} else if (height < 140.0) {
					System.out.print("적정 키가 아닙니다.");
				}
			} else if (age < 12) {
				System.out.print("적정 연령이 아닙니다.");
			} 
		}
		
		public void ex8() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("키 : ");
			double height = sc.nextDouble();
			
					
			if (age < 0 || age > 100) {
				System.out.print("나이를 잘못 입력 하셨습니다.");
			} else if (height < 0 || height > 250.0) {
				System.out.print("키를 잘못 입력 하셨습니다.");
			} else if  (age >= 12) {
				
				if (height >= 140.0) {
					System.out.print("탑승 가능");
					
				} else if (height < 140.0) {
					System.out.print("나이는 적절하나, 키가 적절치 않음");
				}
			} else if (age < 12) {
				if (height >= 140.0) {
					System.out.print("키는 적절하나, 나이는 적절치 않음");	
				} else if (height < 140.0) {
					System.out.print("나이와 키 모두 적절치 않음");
				}
				
			} 
		}
	}