package com.sopra.pox3.base;

import java.math.BigDecimal;

public class PrimitiveApplication {

	public static void main(String[] args) {

		byte x = 10;
		int y = 123456;
		long z = 100_456_397_001L;

		float f = 12;
		f = 2.34F;

		double d = 12.24651321615;

		BigDecimal bigDecimal = new BigDecimal("-12.3516513216512132165132135165132163513132165132");
		char c = 'x';
		boolean vrai = false;
		boolean test = !(3 > 2 && (c != 'x') || (2 > 3));
		System.out.println(test);

		y = 8;
		int move = y>>1;
		System.out.println(move);
		move = y<<1;
		System.out.println(move);

	}

}
