package com.javabasics.patternprogramming;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows : ");
		int row = sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			System.out.println("* ");
		}


	}

}
