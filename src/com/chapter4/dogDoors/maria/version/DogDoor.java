package com.chapter4.dogDoors.maria.version;

import java.util.*;

public class DogDoor {
	private boolean open;
	private List<Bark> allowedBarks;

	public DogDoor() {
	    this.allowedBarks = new LinkedList<Bark>();
	    open = false;
	  }

	public void addAllowedBark(Bark bark) {
		allowedBarks.add(bark);
	}

	public List<Bark> getAllowedBarks() {
		return allowedBarks;
	}

	public void open() {
		System.out.println("The dog door opens.");
		open = true;

		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				close();
				timer.cancel();
			}
		}, 5000);
	}

	public void close() {
		System.out.println("The dog door closes.");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}
}
