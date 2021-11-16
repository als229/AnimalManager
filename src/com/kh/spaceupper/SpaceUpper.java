package com.kh.spaceupper;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("영어를 입력하시오(띄어쓰기 포함) : ");
		String str = sc.nextLine();
		String[] atn = str.split(" ");

		for (int i = 0; i < atn.length; i++) {
			System.out.print(atn[i].substring(0, 1).toUpperCase() + atn[i].substring(1).toLowerCase() +" ");
		}

	}

}
