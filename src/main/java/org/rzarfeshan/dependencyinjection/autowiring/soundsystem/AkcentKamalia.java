package org.rzarfeshan.dependencyinjection.autowiring.soundsystem;


import org.springframework.stereotype.Component;

@Component
public class AkcentKamalia implements CompactDisc {
	private String title = "I will not let you go";
	private String artist = "Various";
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
