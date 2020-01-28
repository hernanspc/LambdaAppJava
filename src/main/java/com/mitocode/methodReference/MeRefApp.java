package com.mitocode.methodReference;

import java.util.Comparator;
import java.util.Arrays;
/**
 * @author LENOVO
 *
 */
public class MeRefApp {

	public static void referenciarMetodoStatic() {
		System.out.println("Metodo Referido Static");
	}
	
	public void referenciarMetodoInstanciaObjetoArbitrario() {
		String[] nombres = { "Karyme" , "Claudia" , "Valeria" , "Sofia" };
		
		
		
		Arrays.sort(nombres, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			
			}
		});
		
		Arrays.sort(nombres, ( s1 , s2 ) -> s1.compareToIgnoreCase(s2));
		System.out.println(nombres);
		
	}
	
	public void referenciarMetodoInstanciaObjetoParticular() {
		
	}
	
	public void referenciarConstructor() {
		
	}
	
	public void operar() {
		/*
		 * Operacion op = () -> MeRefApp.referenciarMetodoStatic(); op.saludar();
		 */
		
		Operacion op2 = MeRefApp::referenciarMetodoStatic;
		op2.saludar();
		
		
	}
	
	public static void main(String[] args) {
		MeRefApp app = new MeRefApp();
		//app.operar();
		app.referenciarMetodoInstanciaObjetoArbitrario();
	}
	
	
	
	
	
}
