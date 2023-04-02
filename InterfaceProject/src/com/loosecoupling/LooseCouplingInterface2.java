package com.loosecoupling;

interface MessageServices

{
	void message(String msg);
}

class Whatsapp1 implements MessageServices {
	public void message(String msg) {
		System.out.println("Whatsapp :" + msg);
	}

}

class Facebook1 implements MessageServices {
	public void message(String msg) {
		System.out.println("Facebook :" + msg);
	}

}

class Instagram1 implements MessageServices {
	public void message(String msg) {
		System.out.println("Instagram :" + msg);
	}

}

public class LooseCouplingInterface2 {

	public void getMessage(MessageServices m1, String s1)

	{
		m1.message(s1);
	}

	public static void main(String[] args) {

		LooseCouplingInterface2 l = new LooseCouplingInterface2();

		MessageServices m;
		m = new Whatsapp1();
		l.getMessage(m, "Good morning");

		m = new Facebook1();
		l.getMessage(m, "Hiiiiiii");

		m = new Instagram1();
		l.getMessage(m, "Hellooo");

		// loose copupling ---independent
		m = new Facebook1();
		l.getMessage(m, "How are you");

	}

}
