package com.pro.wings;

public class ThreadTwo extends Thread {

	Theater theater;
    int seats;
    
    public ThreadTwo(Theater theater, int seats) {
		super();
		this.theater = theater;
		this.seats = seats;
	}

	@Override
	public void run() {
		
    	theater.bookSeats(seats);
	}
}
