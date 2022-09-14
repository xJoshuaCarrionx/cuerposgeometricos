package cuerposgeometricos;

public class Dodecaedro {


	public static void main(String[] args) {
		double Area, Volumen, arista;
		
		arista=5;
		Area= 3*Math.pow(arista,2)*Math.sqrt(25+10*Math.sqrt(5));
		Volumen = (15+7*(Math.sqrt(5)))*Math.pow(arista,3)*1/4;
		
		System.out.println("1.Datos de la Dodecaedro:");
		
		System.out.println("2.Area Total: "+Area);
		
		System.out.println("3.Volumen: "+Volumen);

}

}
