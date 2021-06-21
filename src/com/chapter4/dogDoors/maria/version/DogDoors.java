package com.chapter4.dogDoors.maria.version;

public class DogDoors {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		door.addAllowedBark(new Bark("rowlf"));
		door.addAllowedBark(new Bark("rooowlf"));
		door.addAllowedBark(new Bark("rawlf"));
		door.addAllowedBark(new Bark("woof"));
		BarkRecognizer recognizer = new BarkRecognizer(door);

		System.out.println("Bruce starts barking.");
		recognizer.recognize(new Bark("Rowlf"));

		System.out.println("\nBruce has gone outside...");

		try {
			Thread.currentThread();
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}

		System.out.println("\nBruce all done...");
		System.out.println("...but he's stuck outside!");

		Bark smallDogBark = new Bark("Boww");
		System.out.println("\nA small dog starts barking.");
		recognizer.recognize(smallDogBark);

		try {
			Thread.currentThread();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}

		System.out.println("\nBruce starts barking.");
		recognizer.recognize(new Bark("Rowlf"));

		System.out.println("\nBruce's back inside...");
	}

}
