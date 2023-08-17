package cl.jesu.clinica.utils;

public class DescuentoEspecialidad implements ICalculoDescuento{

	@Override
	public double descuento(String[] detalle) {
		double descuento=0;
		
		String edad="";
		String especialidad="";
		String experiencia="";
		
		detalle[0]= edad;
		detalle[1]= especialidad;
		detalle[2]=experiencia;

		int edad2= Integer.parseInt(edad);
		int exp = Integer.parseInt(experiencia);
		
		if(especialidad == "Dermatologo") {
			
		}
		return descuento;
		
		
	}

}
