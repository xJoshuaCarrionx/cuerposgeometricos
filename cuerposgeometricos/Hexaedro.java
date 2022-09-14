package cuerposgeometricos;

public class Hexaedro {


	public static void main(String[] args) {
		double Area, Volumen, arista, D;
		
		arista=15;
		D=arista*Math.sqrt(3);
		Area= 6*Math.pow(arista,2);
		Volumen = Math.pow(arista,3);
		
		System.out.println("1.Datos de la Hexaedro:");
		
		
		System.out.println("2.Diametro: "+D);
		
		System.out.println("3.Area Total: "+Area);
		
		System.out.println("4.Volumen: "+Volumen);

}

}
