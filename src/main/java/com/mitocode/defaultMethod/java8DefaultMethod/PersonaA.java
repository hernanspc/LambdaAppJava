package com.mitocode.defaultMethod.java8DefaultMethod;

public interface PersonaA {

	public void caminar();
	
	
	default public void hablar() {
		System.out.println("Salu2 Coders - Persona A");
	}
	 
}
