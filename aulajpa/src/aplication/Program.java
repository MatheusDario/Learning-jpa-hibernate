package aplication;

import dominio.Person;

public class Program {

	public static void main(String[] args) {
		
		Person p1 = new Person(1, "Carlos da Silva", "carlos@gmail.com");
		Person p2 = new Person(2, "Pedro da Silva", "pedro@gmail.com");
		Person p3 = new Person(3, "Vivian da Silva", "vivian@gmail.com");

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
