package com.pro.wings;

public class Theater {
	
	int totalSeats = 10;
	
	public synchronized void bookSeats(int seats)
	{
		if(seats <= totalSeats)
		{
			System.out.println(Thread.currentThread().getName()+" "+seats +" seats booked successfully!!");
			totalSeats = totalSeats - seats;
			System.out.println(Thread.currentThread().getName()+" "+"Available seats are : "+ totalSeats);

		}
		else
		{
			System.out.println(Thread.currentThread().getName()+" "+seats + " seats not availabe..");
			System.out.println(Thread.currentThread().getName()+" "+"Available seats are : "+ totalSeats);
		}
		
	}

}
