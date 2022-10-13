package com.codebode;
import java.util.Scanner;
public class Group {
public static void main(String[] args) {
	System.out.println("Role number");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	if(a%4 == 1 || a== 1) {
		System.out.println("Sapphire group");
	}else if(a%4 == 2 || a== 2) {
		System.out.println("Peral group");
	}else if(a%4 == 2 || a== 2) {
		System.out.println("Ruby group");
	}else if(a%4 == 2 || a== 2) {
		System.out.println("Emerald group");
	}
}
}
