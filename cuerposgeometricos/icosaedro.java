package cuerposgeometricos;

public class icosaedro {

	public static void main(String[] args) {
		double Area, Volumen, arista;
		
		arista=8;
		Area= 5*Math.pow(arista,2)*Math.sqrt(3);
		Volumen = (3+Math.sqrt(5))*Math.pow(arista,3)*5/12;
		
		System.out.println("1.Datos de la Icosaedro:");
		
		
		System.out.println("2.Area Total: "+Area);
		
		System.out.println("3.Volumen: "+Volumen);

}
	
	
}
