package edu.kh.contrl.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num1 = sc.nextInt();
		
		String result;
		
		if (num1 <= 0) {
			result = "양수만 입력해주세요.";
		} else {
			if (num1 % 2 == 0) {
				result = "짝수입니다.";
			} else {
				result = "홀수입니다.";
			}
		}
		System.out.println(result);
				
		
	}
	
	public void practice2() {
		
		
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		String result;
		
		int sum = korean + math + eng;
		
		double avg = sum / 3;
		
		if (korean < 40 || math < 40 || eng < 40 || avg < 60) {
			result = "불합격입니다.";
			
		} else {
			System.out.printf("국어 : %d\n", korean);
			System.out.printf("수학 : %d\n", math);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("합계 : %d\n", sum);
			System.out.printf("평균 : %.1f\n", avg);
			result = "축하합니다, 합격입니다!";
		}
		
		System.out.println(result);
		
	}
	
	public void practice3() {
		
		
		System.out.print("1~12 사이의 정수 입력 : ");
		
		int month = sc.nextInt();
		
		String result;
		String result2;
		
		switch (month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			System.out.printf("%d월은 31일까지 있습니다.", month); break;
		case 2 :
			System.out.printf("%d월은 28일까지 있습니다.", month); break;
		case 4 : case 6: case 9: case 11:
			System.out.printf("%d월은 30일까지 있습니다.", month); break;
		default :
			System.out.printf("%d월은 잘못 입력된 달입니다.", month);
		}
		
			
	}
	public void practice4() {
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(Kg)를 입력해 주세요 : ");
		double wt = sc.nextDouble();
		
		double bmi = wt / (height * height);
		
		String result;
		
		if (bmi < 18.5) {
			result = "저체중";
			
		} else if ( bmi  < 23 ) {
			result = "정상체중";
		} else if ( bmi < 30) {
			result = "과체중";
		} else if ( bmi < 35) {
			result = "비만";
		} else {
			result = "고도 비만";
		}
		System.out.printf("BMI 지수 : %.14f\n", bmi);
		System.out.println(result);
		
		
		
	}
	public void practice5() {
		
		System.out.print("중간 고사 점수 : ");
		int midScore = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int finalScore = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int studyScore = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		int chekScore = sc.nextInt();
		
		double midScore20 = midScore * 0.2; // midScore20 *= 0.2; 로 표현 가능
		double finalScore30 = finalScore * 0.3;
		double studyScore30 = studyScore * 0.3;
		double chekScore20 = (chekScore * 0.05)*0.2*100;
		
		
		double scoreSum = (midScore20 + finalScore30 + studyScore30 + chekScore20);
		
		String result;
			
		System.out.println("================== 결과 ==================");
		
		if (chekScore <= (20*0.3) ) {
			result = "Fail [출석 횟수 부족 ";
		} else {
			if (scoreSum < 70 ) {
				System.out.printf("중간 고사 점수(20) : %.1f\n", midScore20);
				System.out.printf("기말 고사 점수(30) : %.1f\n", finalScore30);
				System.out.printf("과제 점수     (30) : %.1f\n", studyScore30);
				System.out.printf("출석 점수     (20) : %.1f\n", chekScore20);
				System.out.printf("총점               : %.1f\n", scoreSum);
				result = "Fail [점수 미달]";
			} else {
				System.out.printf("중간 고사 점수(20) : %.1f\n", midScore20);
				System.out.printf("기말 고사 점수(30) : %.1f\n", finalScore30);
				System.out.printf("과제 점수     (30) : %.1f\n", studyScore30);
				System.out.printf("출석 점수     (20) : %.1f\n", chekScore20);
				System.out.printf("총점               : %.1f\n", scoreSum);
				result = "PASS";
			}
		}
		
		switch (result) {
		case "PASS" : 
			System.out.print(result); break;
		case "Fail [점수 미달]" :
			System.out.print(result); break;
		case "Fail [출석 횟수 부족 " :
			System.out.printf("%s(%d/20)]", result, chekScore); break;
		}
		
		
	}

}
