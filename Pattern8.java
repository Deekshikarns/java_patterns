package com.javabasics.patternprogramming;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows : ");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("* ");	
			}
			System.out.println();
		}

	}

}
