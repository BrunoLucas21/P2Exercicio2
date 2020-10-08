package br.edu.unifacisa.p2.logica;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExerciciosDeLogica {
	public static int somaArray(int[] numeros) {
		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		return soma;
	}

	public static int getMaior(int[] numeros) {
		int maior = Integer.MIN_VALUE;
		int indiceMaior = -1;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
				indiceMaior = i;
			}
		}
		return maior;
	}

	public static int getMenor(int[] numeros) {
		int menor = Integer.MAX_VALUE;
		int indiceMenor = -1;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < menor) {
				menor = numeros[i];
				indiceMenor = i;
			}
		}
		return menor;
	}

	public static double getMedia(int[] numeros) {
		double soma = 0.0;
		for (int i : numeros) {
			soma += i;
		}

		double media = soma / numeros.length;
		return media;
	}

	public static String[] inverteArray(String[] nomes) {
		String[] invertido = new String[nomes.length];
		for (int i = 0; i < nomes.length; i++) {
			invertido[i] = nomes[(nomes.length - i) - 1];
		}
		return invertido;
	}

	public static List<String> inverteLista(List<String> nomes) {
		List<String> invertido = new ArrayList<>();
		for (int i = nomes.size() - 1; i >= 0; i--) {
			String nome = nomes.get(i);
			invertido.add(nome);
		}

		return invertido;
	}

	public static String junta(List<String> nomes, String caractere) {
		String juntado = new String();
		juntado = caractere.join(caractere, nomes);
		return juntado;
	}

	public static String substitui(String mensagem, String localizar, String substituir) {
		String novaMensagem = new String(mensagem);
		novaMensagem = mensagem.replaceAll(localizar, substituir);
		return novaMensagem;
	}

	public static boolean ehNumero(String valor) {
		for (int i = 0; i < valor.length(); i++) {
			char caractere = valor.charAt(i);
			if (caractere < '0' || caractere > '9') {
				return false;
			}
		}
		return true;
	}

	public static boolean validaCEP(String cep) {
		String padrao = "\\d{5}[-]\\d{2}";
		Pattern p = Pattern.compile(padrao);
		Matcher m2 = p.matcher(cep);

		if (m2.find()) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean validaCPF(String cpf) {
		/*
		 * Pesquise na internet. Existem algoritmos prontos. No site da receita federal
		 * existe a explicação de como os dígitos verificadores são calculados.
		 */
		
		String padrao = "/^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$/";
		Pattern p = Pattern.compile(padrao);
		Matcher m2 = p.matcher(cpf);
		
		if (m2.find()) {
			return false;
		} else {
			return true;
		}
	}

	public static long fatorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * fatorial(n - 1);
		}
	}

	public static int fibonacci(int n) {
		int f = 0;
		int ant = 0;
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				f = 1;
				ant = 0;
			} else {
				f += ant;
				ant = f - ant;
			}
		}
		return f;
	}
}
