package es.cic.bootcamp.ejercicio001;

public class Calculadora {
	private Coprocesador coprocesador;
	 int total=0;
	public int sumar(int...s) {
		for(int i=0;i<s.length;i++) {
			total += s[i];
		}
		return total;
		 
	}
	
	


}
