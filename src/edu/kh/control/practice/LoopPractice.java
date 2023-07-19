package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	
	public void practice1() {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if (input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	
	public void practice2() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if (input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice3() {
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= input; i++) {
			sum += i;
			
			if (i < input) {
			System.out.print(i + " + ");
			} else {
				System.out.print(i + " ");
			}
		}
		System.out.print("= " + sum);
	}
	
	public void practice4() {
		
		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();
		
		
		if (input1 < 1 || input2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else if (input1 < input2) {
			for (int i = input1; i <= input2; i++ ) {
				System.out.print(i + " ");
			}
		} else if (input1 > input2) {
			for (int i = input2; i <= input1; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice5() {
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.printf("=============%d단=============\n", dan);
		
		for (int i = 1; i <= 9; i++) {
			int dg = dan * i;
			
			System.out.printf("%d * %d = %d\n", dan, i, dg);
		}
		
	}
	
	public void practice6() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if (num > 2 && num <= 9) {
			for (int x = num; x <=9; x++) {
				System.out.printf("====== %d단 ======\n", x);
				for (int y = 1; y <= 9; y++) {
					int xy = x * y;
					System.out.printf("%d X %d = %d\n", x, y, xy);
				}
			}
			
		} else {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		}
	}
	
	public void practice7() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {

			for (int y = 1; y <= i; y++) {
			
				System.out.print("*");
				
			}
			
			
			System.out.println();	
		}
		
	}
	
	
	public void practice8() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = num; i >= 1; i--) {

			for (int y = i; y >=1; y--) {
			
				System.out.print("*");
				
			}
			
			
			System.out.println();
		}
		
		
	}
	
	public void practice9() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int num2 = num -1;
		
		for (int i = 1; i <= num; i++) {
			
			for (int y = 1; y <= num2 ; y++) {
				System.out.print(" ");
				
			}
			
			for (int x = 1; x <= i; x++) {
				System.out.print("*");
			}
				
			num2--;
			
			System.out.println();	
		}
		
		
	}
	
	public void practice10() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {

			for (int y = 1; y <= i; y++) {
			
				System.out.print("*");
			}
			System.out.println();
		}

		for (int j = num -1; j >= 1 ; j--) {
			
			for (int x = j; x >= 1; x--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	public void practice11() {
		
		System.out.print("정수 입력 : ");
		
		int num = sc.nextInt();
		int num2 = num - 1;
		
		for (int i = 1; i <= num; i++) {
			
			for (int x = 1; x <= num2; x++) {
				
				System.out.print(" ");
				
				
			}
			
			for (int y = 1; y <= i * 2 - 1; y++) {
				
				System.out.print("*");
				
			}
			num2--;
			System.out.println();
			
		}
		
		
	}
	
	
	public void practice12() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		
		for (int i = 1; i <= num; i++) {
			if ( i == 1 || i == num) {
				for (int y =1; y <=num; y++) {					
					System.out.print("*");
				}
				
			} else {
				System.out.print("*");
				for (int x = 1; x <= num-2; x++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			
			System.out.println();
			
		}
			
			
			
		
		
	
	}
	
	public void practice13() {
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		System.out.println();
		
		int count = 0;
		
		int num;
		
		
		for (int i = 1; i <= input; i++) {
			
			if (i %2 == 0 || i %3 == 0) {
				
				System.out.print(i + " ");
				
			}
			if (i %2 == 0 && i %3 == 0) {
				count++;
			}
			
		} 
		System.out.println();
		System.out.println();
		System.out.println("conunt : " + count);
		
		
		
	}
	
	public void practice20() {
		
		// practice11의 변형
		
		System.out.print("정수 입력: ");
        int n = sc.nextInt();
        
        // 상향식과 하향식을 함께 출력
        for (int i = 1; i <= 2 * n - 1; i++) {
            int starsInLine = i <= n ? i : 2 * n - i;
            for (int j = 1; j <= starsInLine; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
		
	}
	
	
}
