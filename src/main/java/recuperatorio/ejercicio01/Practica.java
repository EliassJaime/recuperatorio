package recuperatorio.ejercicio01;

import java.time.LocalDate;

/*Además la empresa cubre diversas prácticas. De una práctica se conoce su descripción, su código numérico y 
el costo de la misma.*/

public class Practica {
	
	String descripcion;
	Integer codigoNum;
	Double costo;
	
	
	public Practica(String descripcion, Integer codigoNum, Double costo) {
		super();
		this.descripcion = descripcion;
		this.codigoNum = codigoNum;
		this.costo = costo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getCodigoNum() {
		return codigoNum;
	}
	public void setCodigoNum(Integer codigoNum) {
		this.codigoNum = codigoNum;
	}
	public Double getCosto() {
		return costo;
	}
	public void setCosto(Double costo) {
		this.costo = costo;
	}
	
	
	

}
