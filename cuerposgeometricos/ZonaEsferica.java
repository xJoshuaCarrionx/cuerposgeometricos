package cuerposgeometricos;

public class ZonaEsferica {
	

	public static void main(String[] args) {
		double Area, Volumen, r, R, h;
		
		R=7;
		r=5;
		h=12;
		Area= 2*Math.PI*(R*h);
		Volumen = (Math.PI*Math.pow(R,2)*h)*2/3;

		System.out.println("1.Datos de la Zona Esferica:");
	    	System.out.println("2.Radio: "+r);
		    System.out.println("3.Radio Mayor: "+R);
		    System.out.println("4.Altura: "+h);
		    System.out.println("5.Area Total: "+Area);
		System.out.println("6.Volumen: "+Volumen);

}

}
