package com.chapter2.dogDoors.startversion;

public class DogDoor {
	private boolean open;

	public DogDoor() {
		this.open = false;
	}

	public void open() {
		System.out.println("The Dog Door Opens.");
		open = true;
	}

	public void close() {
		System.out.println("The Dog Door Closes.");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}
}
