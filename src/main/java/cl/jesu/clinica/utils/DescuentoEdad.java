package cl.jesu.clinica.utils;

public class DescuentoEdad implements ICalculoDescuento{

	@Override
	public double descuento(String[] detalle) {
		//throw new UnsupportedOperationException("Unimplemented method 'descuento'");
			
		String edad="";
		String especialidad="";
		String experiencia="";
		
		detalle[0]= edad;
		detalle[1]= especialidad;
		detalle[2]=experiencia;

		int edad2= Integer.parseInt(edad);
		int exp = Integer.parseInt(experiencia);
		double descuento=0;
		
		
		if(edad2<5) {
			descuento=0.05;
		}else if(edad2>5 &&edad2<13) {
			descuento=0.03;
		}else if(edad2>13 && edad2<35) {
			descuento=0.0;
		}else if(edad2>35&& edad2<60) {
			descuento=0.10;
		}else if(edad2>60) {
			descuento=0.30;
		}
		
		return descuento;
	}

}
