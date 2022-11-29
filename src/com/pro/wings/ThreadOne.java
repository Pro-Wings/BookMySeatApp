package com.pro.wings;

public class ThreadOne extends Thread{
	
	Theater theater;
    int seats;
    
    public ThreadOne(Theater theater, int seats) {
		super();
		this.theater = theater;
		this.seats = seats;
	}

	@Override
	public void run() {
		
    	theater.bookSeats(seats);
	}
    
    

}
