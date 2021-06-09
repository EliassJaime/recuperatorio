package recuperatorio.ejercicio01;

import java.time.LocalDate;

public class Prestacion {
	

	Afiliado afiliado;
	Boolean preAprobada;
	Practica practica;
	LocalDate fechaEfectuada;
	TipoPrestacion tipoDeEsta;
	Double costo;
	
	
	public Prestacion(Afiliado afiliado, Boolean preAprobada, Practica practica, LocalDate fechaEfectuada,
			TipoPrestacion tipoDeEsta, Double costo) {
		super();
		this.afiliado = afiliado;
		this.preAprobada = preAprobada;
		this.practica = practica;
		this.fechaEfectuada = fechaEfectuada;
		this.tipoDeEsta = tipoDeEsta;
		this.costo = costo;
	}
	
	public Afiliado getAfiliado() {
		return afiliado;
	}
	public void setAfiliado(Afiliado afiliado) {
		this.afiliado = afiliado;
	}
	public Boolean getPreAprobada() {
		return preAprobada;
	}
	public void setPreAprobada(Boolean preAprobada) {
		this.preAprobada = preAprobada;
	}
	public Practica getPractica() {
		return practica;
	}
	public void setPractica(Practica practica) {
		this.practica = practica;
	}
	public LocalDate getFechaEfectuada() {
		return fechaEfectuada;
	}
	public void setFechaEfectuada(LocalDate fechaEfectuada) {
		this.fechaEfectuada = fechaEfectuada;
	}
	public TipoPrestacion getTipoDeEsta() {
		return tipoDeEsta;
	}
	public void setTipoDeEsta(TipoPrestacion tipoDeEsta) {
		this.tipoDeEsta = tipoDeEsta;
	}
	public Double getCosto() {
		return costo;
	}
	public void setCosto(Double costo) {
		this.costo = costo;
	}
	
	
	
}
