package com.pro.wings;

public class BookMySeat {

	public static void main(String[] args) {

		Theater theater = new Theater();
		ThreadOne t1 = new ThreadOne(theater, 5);
		t1.setName("Ram");
		t1.start();

		ThreadTwo t2 = new ThreadTwo(theater, 7);
		t2.setName("Sham");
		t2.start();

	}

}
