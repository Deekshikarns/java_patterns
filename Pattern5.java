package com.javabasics.patternprogramming;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows : ");
		int row = sc.nextInt();
		for(int i=row;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}


	}

}
