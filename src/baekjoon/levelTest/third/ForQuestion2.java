package baekjoon.levelTest.third;

import java.util.ArrayList;
import java.util.Scanner;

// 3단계 : for 문
public class ForQuestion2 {

	private Scanner sc;
	
	public ForQuestion2() {
		sc = new Scanner(System.in);
	}
	
	// A+B - 7
	// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	public void abSum() {
		
		int t = sc.nextInt();
		
		int[] result = new int[t];
		
		int n1 = 0;
		int n2 = 0;
		
		for(int i = 0; i < t; i++) {
			
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			
			result[i] = n1 + n2;
			
		}
		
		for(int i = 0;i < t; i++) {
			System.out.println("Case #" + (i+1) + ": " + result[i]);
		}
		
		sc.close();
		
	}
	
	
	// A+B - 8
	public void abSum2() {
		
		int t = sc.nextInt();
		
		int n1 = 0;
		int n2 = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < t; i++) {
			
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			
			list.add(n1);
			list.add(n2);
			
		}
		
		int j = 0;
		
		for(int i = 0;i < t; i++) {
			System.out.println("Case #" + (i+1) + ": " + list.get(j) + " + " + list.get(j+1) + " = " + (list.get(j) + list.get(j+1)));
			j = j + 2;
		}
		
		sc.close();
		
	}
	// 별 찍기 - 1
	public void printStar() {
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	// 별 찍기 - 2
	public void printStar2() {
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			for(int g = n; g > i; g--) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	// X보다 작은 수
	// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
	public void smallX() {
		
		int n = sc.nextInt();
		
		int x = sc.nextInt();
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int num = 0;
		
		for(int i = 0; i < n; i++) {
			num = sc.nextInt();
			
			if(num < x) {
				list.add(num);
			}
		}
		
		String result = "";
		
		for (Integer integer : list) {
			result += Integer.toString(integer) + " ";
		}
		
		System.out.println(result.trim());
		
	}
	
}
