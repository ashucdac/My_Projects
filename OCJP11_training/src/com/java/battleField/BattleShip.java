package com.java.battleField;

import java.util.Scanner;

public class BattleShip {
	static String arr[][] = new String[12][14];
	static int num1 = 0;
	static int num2 = 0;
	static int num3 = 0;
	static int num4 = 0;
	Scanner sc = new Scanner(System.in);

	public void startGame() {
		System.out.println("*** Welcome to Battleship Game ***");
		System.out.println("Right now the sea is empty...");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println(" ");
		}
	}

	public void deployShips() {
		System.out.print("Deploy your ships:");

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter X coordinate:");
			int x = sc.nextInt();
			System.out.print("Enter Y coordinate:");
			int y = sc.nextInt();
			arr[x][y] = "@";
		}
		System.out.println("Great you have deployed your ships successfully...");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		int choice;
		BattleShip b = new BattleShip();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0 && (j >= 2 && j <= 11)) {
					arr[i][j] = "" + num1;
					num1++;
				} else if (i == 11 && (j >= 2 && j <= 11)) {
					arr[i][j] = "" + num2;
					num2++;
				} else if ((i > 0 && i < 11) && (j < 2 || j > 11)) {
					if (j == 0) {
						arr[i][j] = "" + num3;
						num3++;
					} else if (j == 13) {
						arr[i][j] = num4 + "";
						num4++;
					} else if (j == 1 || j == 12) {
						arr[i][j] = "|";
					}
				} else {
					arr[i][j] = " ";
				}
			}
		}

		System.out.println("1 : Start Game");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		if (choice == 1) {
			b.startGame();
		}

		System.out.println("Enter 5 to deploy your ships ");
		choice = sc.nextInt();
		if (choice == 5) {
			b.deployShips();
		}
	}
}
