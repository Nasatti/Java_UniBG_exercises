package Potenze;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci il numero");
		int n = sc.nextInt();
		Potenze p = new Potenze(n);
		System.out.print("la potenza di " + n + " è ");
		System.out.println(p.pow());
		System.out.println("Modifica il numero");
		n = sc.nextInt();
		p.setnum(n);
		System.out.println(p.getnum());
	}
}