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
				int result =  i * y;
				System.out.printf("%d x %d = %2d",i, y, result);

				if (i == y) {
					break;
				}
			}
			System.out.println();
		}
	}
	
	public void ex5() {
		
		// break : 반복문을 바로 멈춤
		// continue : 다음 반복으로 넘어감
		// 1~ 10 까지 1씩 증가하며 출력
		
		
		for (int i = 1; i<=10; i++) {
			
			if (i % 3 == 0) { // 3의 배수 제외
				continue;
			}
			
			System.out.print(i + " ");
			
		}
		
	}
	
	public void ex6() {
		// 1 ~ 100까지 1씩 증가하며 5의 배수를 건너뛰고 증가값이 40일때 멈춤
		
		
		for (int i = 1; i <=100; i++) {
			
			if (i % 5 == 0) {
				continue;
			}
			if (i >= 40) {
				break;
			}
			
			System.out.println(i);
		}
	}
	
	public void RSPGame() {
		
		// 가위 바위 보 게임을 만들어보자.
		
		System.out.println("[가위 바위 보 게임~!!]");
		System.out.print("몇 판? : ");
		int round = sc.nextInt();
		
		// 승패 기록용 변수
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		for(int i = 1; i <= round; i++) { //입력받은 판 수 만큼 반복
			
			System.out.println("\n" + i + "번째 게임");
			
			System.out.print("가위/바위/보 중 하나를 입력 해주세요 : ");
			
			String input = sc.next();
			
			Math.random();
			// 난수 생성 -> 0.0 이상 1.0 미만의 난수 생성
			
			// 1) 1~3사이 난수 생성
			// 2) 1이면 가위, 2이면 바위, 3이면 보 지정(switch)
			
			int random = (int)(Math.random() * 3 + 1);
								// 1 <= (int)(x*3+1) <4
								// == 1 이상 4 미만 정수 -->1 2 3
			
			String com = null; // 컴퓨터가 선택한 가위, 바위, 보를 저장하는 변수
						//null; 아무것도 참조하고 있지 않음.
			
			switch(random) {
			case 1 : com = "가위"; break;
			case 2 : com = "바위"; break;
			case 3 : com = "보"; break;
			}
			
			// 컴퓨터는 [바위]를 선택했습니다.
			
			System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n", com);
			
			// 컴퓨터와 플레이어 가위 바위 보 판별
			
			if (input.equals(com)) {
				System.out.println("비겼습니다.");
				draw++;
				
			} else {
				
				boolean win1 = input.equals("가위") && com.equals("보");
				boolean win2 = input.equals("바위") && com.equals("가위");
				boolean win3 = input.equals("보") && com.equals("바위");
				
				if (win1 || win2 || win3) {
					System.out.println("플레이어 승!");
					win++;
					
				} else {
					System.out.println("졌습니다 ㅜㅜ");
					lose++;
				}
				
			}
			
			System.out.printf("현재 기록 : %d승 %d무 %d패\n", win, draw, lose);
			
			
		}
		
		
	}

}
