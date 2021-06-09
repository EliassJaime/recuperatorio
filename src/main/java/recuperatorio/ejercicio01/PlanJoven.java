package recuperatorio.ejercicio01;

import java.time.LocalDate;
import java.util.List;

public class PlanJoven extends Afiliado {

	String infoPorcentaje;
	String Universidad;
	String carrera;
	
	

	public PlanJoven(String nombre, String correo, Integer dNI, LocalDate fechaNac,
			List<Prestacion> prestacionesRecibidas,String infoPorcentaje, String universidad, String carrera) {
		super(nombre, correo, dNI, fechaNac, prestacionesRecibidas);
		this.infoPorcentaje = infoPorcentaje;
		Universidad = universidad;
		this.carrera = carrera;
		// TODO Auto-generated constructor stub
	}
	public String getInfoPorcentaje() {
		return infoPorcentaje;
	}
	public void setInfoPorcentaje(String infoPorcentaje) {
		this.infoPorcentaje = infoPorcentaje;
	}
	public String getUniversidad() {
		return Universidad;
	}
	public void setUniversidad(String universidad) {
		Universidad = universidad;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	/*En las prestaciones por medicas, los afiliados del plan joven pagan
	 *  el 20% de la prestación y $150 fijos y los afiliados del plan plus pagan el 25%  de la prestacion.
	 *  En las prestaciones odontologicas el afiliado por plan jove paga el 80% de la prestacion 
	 *  y el   afiliado plan plus paga el 50% de la prestación.*/
	
	@Override
	public Double calcularMonto() {
		
		Prestacion ultPrestacion = this.prestacionesRecibidas.stream()
				                   .findFirst().get();
		
		Double costo = ultPrestacion.getTipoDeEsta().equals(TipoPrestacion.MEDICAS)? (ultPrestacion.getCosto()*0.20+150.0):(ultPrestacion.getCosto()*0.80); 
		
		return costo;
	}
	
}
