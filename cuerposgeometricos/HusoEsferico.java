package cuerposgeometricos;

public class HusoEsferico {

	public static void main(String[] args) {
		double Area, r, n;
		
		r=8;
		n=45;
		Area= (Math.PI*Math.pow(r,2)*n)/90;

		System.out.println("1.Datos de la Esfera:");
		
		
		System.out.println("2.Grados: "+n);
		
		System.out.println("3.Radio: "+r);
		
		System.out.println("4.Area Total: "+Area);
	
}
}
