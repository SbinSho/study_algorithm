package baekjoon.levelTest.third;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;


// 3단계 : for 문
public class ForQuestion {
	
	private Scanner sc;
	
	public ForQuestion() {
		sc = new Scanner(System.in);
	}

	// 구구단
	public void guguDan(int n) {
		
		for(int i = 1; i < 10; i++) {
			System.out.println( n + " * " + i + " = " + ( n*i ));
		}
		
	}
	
	// A+B - 3
	public void sumAB(int n) {
		
		int a = 0;
		int b = 0;
		
		int result[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			result[i] = a + b;
		}
		
		for (int i : result) {
			System.out.println(i);
		}
		
	}
	
	// 합
	public void hap(int n) {
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}
	
	// 빠른 A+B
	public int[] fastSum() {
		
		int t = sc.nextInt();
		
		int[] reList = new int[t]; 
		
		int n1 = 0;
		int n2 = 0; 
		
		
		for(int i = 0; i < t; i++) {
			
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			
			reList[i] = n1 + n2;
			
		}
		
		return reList;
	}
	
	// 빠른 A+B ( 성능 개선 )
	public void fastSumUp() {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			
			int t = Integer.parseInt(br.readLine());
			int sum = 0;
			
			
			String[] arr = null;
			
			for(int i = 0; i < t; i++ ) {
				
				arr = br.readLine().split(" ");
				
				sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
				
				bw.write(Integer.toString(sum));
				
				bw.newLine();
			}
			
			bw.flush();
			
			br.close();
			bw.close();
			
		} catch (IOException e) {
			System.out.println("fastSumUp Error : " + e.getMessage());
		}
		
	}
	
	// N 찍기
	// 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
	public void printN() {
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		
	}
	
	// 기찍 N
	public void printNReverse() {
		
		int n = sc.nextInt();
		
		for(int i = n; i >= 1; i--) {
			System.out.println(i);
		}
	}
}
