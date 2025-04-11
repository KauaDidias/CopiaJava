package Aula08;

import java.util.Scanner;

public class MesesDoAno {

public static void main(String[] args) {
		
		int Meses;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o número do mês (1-12): ");
		Meses = ler.nextInt();
		ler.close();
		
		if (Meses == 1) {
			System.out.println("O mês é Janeiro!");}
		else if (Meses == 2) {
			System.out.println("O mês é Fevereiro!");}
		else if (Meses == 3) {
			System.out.println("O mês é Março!");}
		else if (Meses == 4) {
			System.out.println("O mês é Abril!");}
		else if (Meses == 5) {
			System.out.println("O mês é Maio!");}
		else if (Meses == 6) {
			System.out.println("O mês é Junho!");}
		else if (Meses == 7) {
			System.out.println("O mês é Julho!");}
		else if (Meses == 8) {
			System.out.println("O mês é Agosto!");}
		else if (Meses == 9) {
			System.out.println("O mês é Setembro!");}
		else if (Meses == 10) {
			System.out.println("O mês é Outubro!");}
		else if (Meses == 11) {
			System.out.println("o mês é Novembro!");}
		else if (Meses == 12) {
			System.out.println("O mês é Dezembro!");}
		else {
			System.out.println("O número desse mês é inválido!");}
		
	}

}