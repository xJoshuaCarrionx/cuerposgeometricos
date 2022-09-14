package cuerposgeometricos;

public class octaedro {

	public static void main(String[] args) {
		double Area, Volumen, arista;
		
		arista=11;
		Area= 2*Math.pow(arista,2)*Math.sqrt(3);
		Volumen = Math.pow(arista,3)*Math.sqrt(2)/3;
		
		System.out.println("1.Datos de la Octaedro:");
		
		
		System.out.println("2.Area Total: "+Area);
		

		System.out.println("3.Volumen: "+Volumen);

}

}
