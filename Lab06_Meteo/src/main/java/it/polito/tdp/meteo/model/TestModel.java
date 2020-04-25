package it.polito.tdp.meteo.model;

public class TestModel {

	public static void main(String[] args) {
		
		Model m = new Model();
		
		System.out.println(m.getUmiditaMedia(12));
		
		System.out.println("Gennaio:");
		System.out.println(m.trovaSequenza(1)+"\n\n");
		
		System.out.println("Febbraio:");
		System.out.println(m.trovaSequenza(2)+"\n\n");
		
		System.out.println("Marzo:");
		System.out.println(m.trovaSequenza(3)+"\n\n");
		
		System.out.println("Aprile:");
		System.out.println(m.trovaSequenza(4)+"\n\n");
		
		System.out.println("Maggio:");
		System.out.println(m.trovaSequenza(5)+"\n\n");
		
		System.out.println("Giugno:");
		System.out.println(m.trovaSequenza(6)+"\n\n");
		
		System.out.println("Luglio:");
		System.out.println(m.trovaSequenza(7)+"\n\n");
		
		System.out.println("Agosto:");
		System.out.println(m.trovaSequenza(8)+"\n\n");
		
		System.out.println("Settembre:");
		System.out.println(m.trovaSequenza(9)+"\n\n");
		
		System.out.println("Ottobre:");
		System.out.println(m.trovaSequenza(10)+"\n\n");
		
		System.out.println("Novembre:");
		System.out.println(m.trovaSequenza(11)+"\n\n");
		
		System.out.println("Dicembre:");
		System.out.println(m.trovaSequenza(12)+"\n\n");
		
		

	}

}
