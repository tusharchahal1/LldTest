package com.spring.ObserverDesignPattern;

public class Youtube {

	public static void main(String[] args) {

		Channel youtubeChannel = new Channel();
		
		Subscriber subscriber0 = new Subscriber("Tushar");
		Subscriber subscriber1 = new Subscriber("Pinkle");
		Subscriber subscriber2 = new Subscriber("Shlok");
		Subscriber subscriber3 = new Subscriber("Vaayu");

		youtubeChannel.subscribe(subscriber0);
		youtubeChannel.subscribe(subscriber1);
		youtubeChannel.subscribe(subscriber2);
		youtubeChannel.subscribe(subscriber3);
		
		youtubeChannel.unSubscribe(subscriber2);
		
		subscriber0.subscribeChannel(youtubeChannel);
		subscriber1.subscribeChannel(youtubeChannel);
		subscriber2.subscribeChannel(youtubeChannel);
		subscriber3.subscribeChannel(youtubeChannel);
		
		youtubeChannel.upload("Observer Design Pattern");
	}

}
