package com.chapter3.dogDoors.recognizer;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
	    BarkRecognizer recognizer = new BarkRecognizer(door);

	    System.out.println("Fido barks to go outside...");
	    recognizer.recognize("Woof");

	    System.out.println("\nFido has gone outside...");
	    System.out.println("\nFido's all done...");

	    try {
	      Thread.currentThread().sleep(10000);
	    } catch (InterruptedException e) { }

	    System.out.println("...but he's stuck outside!");

	    System.out.println("\nFido starts barking...");
	    recognizer.recognize("Woof");

	    System.out.println("\nFido's back inside...");
	}

}
