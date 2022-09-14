package cuerposgeometricos;

public class Esfera {

	public static void main(String[] args) {
		double Area, Volumen, r;
		
		r=5;
		Area= 4*Math.PI*(Math.pow(r,2));
		Volumen = (Math.PI*Math.pow(r,3))*4/3;

		System.out.println("1.Datos de la Esfera:");
		
		
		System.out.println("2.Radio: "+r);
		
		System.out.println("3.Area Total: "+Area);
		
		System.out.println("4.Volumen: "+Volumen);

}

}
