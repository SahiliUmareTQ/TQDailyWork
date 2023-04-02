package com.tightcoupling;

interface MessageService {
	void message(String msg);
}

class Whatsapp implements MessageService {
	public void message(String msg) {
		System.out.println("Whatsapp :" + msg);
	}

}

class Facebook implements MessageService {
	public void message(String msg) {
		System.out.println("Facebook :" + msg);
	}

}

class Instagram implements MessageService {
	public void message(String msg) {
		System.out.println("Instagram :" + msg);
	}

}

public class TightCouplingInterface {

	public void getMessage(Whatsapp w1, String s1) {
		w1.message(s1);
	}

	public void getMessage(Facebook f1, String s1) {
		f1.message(s1);
	}

	public void getMessage(Instagram i1, String s1) {
		i1.message(s1);
	}

	public static void main(String[] args) {

		Whatsapp wsap = new Whatsapp();
		Facebook fb = new Facebook();
		Instagram in = new Instagram();

		TightCouplingInterface t1 = new TightCouplingInterface();

		t1.getMessage(wsap, "Good morning");

		t1.getMessage(fb, "Hello");

		t1.getMessage(in, "Hiiiiiiiiii");

		t1.getMessage(fb, "Where are you from");
	}

}
