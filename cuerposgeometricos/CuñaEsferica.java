package cuerposgeometricos;

public class CuñaEsferica {
	
	public static void main(String[] args) {
		double Volumen, r, n;
		
		r=8;
		n=45;
		Volumen = (Math.PI*Math.pow(r,3)*n)/270;

		System.out.println("1.Datos de la Esfera:");
		
		
		System.out.println("2.Radio: "+r);
		
		System.out.println("3.Grados: "+n);
		
		System.out.println("4.Volumen: "+Volumen);


}

}
