package com.chapter4.dogDoors.randy.version;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
	    door.setAllowedBark("Rowlf");
	    BarkRecognizer recognizer = new BarkRecognizer(door);


	    System.out.println("Bruce starts barking.....");
	    recognizer.recognize("Rowlf");

	    System.out.println("\nBruce has gone outside...");

	    try {
	      Thread.currentThread();
	      Thread.sleep(10000);
	    } catch (InterruptedException e) { }

	    System.out.println("\nBruce all done...");
	    System.out.println("but he's stuck outside!.....");

	    System.out.println("\nA small dog starts barking.");
	    recognizer.recognize("Woof");

	    try {
	      Thread.currentThread();
	      Thread.sleep(5000);
	    } catch (InterruptedException e) { }

	    System.out.println("\nBruce starts barking.");
	    recognizer.recognize("Rowlf");

	    System.out.println("\nBruce's back inside...");
	}

}
