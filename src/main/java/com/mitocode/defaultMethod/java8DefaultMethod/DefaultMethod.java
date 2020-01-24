package com.mitocode.defaultMethod.java8DefaultMethod;

public class DefaultMethod implements PersonaA, PersonaB {

	@Override
	public void caminar() {
		 System.out.println("Hola Coders");
		
	}
	
	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		PersonaA.super.hablar();
		System.out.println("Suscribance Coders");
	}

	public static void main(String[] args) {
		DefaultMethod app = new DefaultMethod();
		//app.caminar();
		app.hablar();
	}

	
	
}
