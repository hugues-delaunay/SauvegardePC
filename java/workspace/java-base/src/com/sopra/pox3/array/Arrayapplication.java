package com.sopra.pox3.array;

import java.util.Arrays;

public class Arrayapplication {

	public static void main(String[] args) {

		int[] ints = new int[3];
		ints[0] = 21;
		System.out.println(Arrays.toString(ints));

		int[] faster = { 3, 45, 10 };
		System.out.println(Arrays.toString(faster));

		int[][] strangerMatrix = { { 2, 3, 4 }, { 34, 8, 45 }, { 2, 9, 95, 8, 12, 5 } };

		System.out.println(Arrays.toString(strangerMatrix));
		strangerMatrix[1] = new int[] { 3, 5, 1, 51, 56, 94, 6 };

		for (int i = 0; i < faster.length; i++) {
			System.out.println(faster[i]);
		}

		for (int content : faster) {
			System.out.println(content);
		}

		for (int[] column:strangerMatrix ){
			for(int cell : column){
				System.out.println(cell+"-");
			}
			System.out.println();
		}
	}
}
