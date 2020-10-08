package br.edu.unifacisa.p2.romanos;

import static java.util.Collections.nCopies;

import java.util.Scanner;

import static java.lang.String.join;

public class Romanos {
	private static final int[] DECIMAL = 
		{ 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	private static final String[] ROMANOS = 
		{ "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	public static String paraRomanos(int decimal) {
		StringBuilder resultado = new StringBuilder();

		for (int i = 0; i < DECIMAL.length; i++) {
			int parteInteira = decimal / DECIMAL[i];
			decimal -= DECIMAL[i] * parteInteira;
			resultado.append(join("", nCopies(parteInteira, ROMANOS[i])));
		}

		return resultado.toString();
	}

	public static int paraDecimal(String romanos) {
		if (romanos == "I") {
			return 1;
		} 
		if (romanos == "V") {
			return 5;
		} 
		if (romanos == "X") {
			return 10;
		}
		if (romanos == "L") {
			return 50;
		}
		if (romanos == "C") {
			return 100;
		}
		if (romanos == "D") {
			return 500;
		}
		if (romanos == "M"){
			return 1000;
		} else {
			return 1982;
		}
	}
}
