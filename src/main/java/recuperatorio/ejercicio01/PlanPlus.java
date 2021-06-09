package recuperatorio.ejercicio01;

import java.time.LocalDate;
import java.util.List;

public class PlanPlus extends Afiliado {
	
         String infoPorcentaje;
         Integer cuitDelEmpleador;
         
         
         
		
		public PlanPlus(String nombre, String correo, Integer dNI, LocalDate fechaNac,
				List<Prestacion> prestacionesRecibidas, String infoPorcentaje, Integer cuitDelEmpleador) {
			        super(nombre, correo, dNI, fechaNac, prestacionesRecibidas);
					this.infoPorcentaje = infoPorcentaje;
					this.cuitDelEmpleador = cuitDelEmpleador;
			// TODO Auto-generated constructor stub
		}
		public String getInfoPorcentaje() {
			return infoPorcentaje;
		}
		public void setInfoPorcentaje(String infoPorcentaje) {
			this.infoPorcentaje = infoPorcentaje;
		}
		public Integer getCuitDelEmpleador() {
			return cuitDelEmpleador;
		}
		public void setCuitDelEmpleador(Integer cuitDelEmpleador) {
			this.cuitDelEmpleador = cuitDelEmpleador;
		}
		
	
		
		@Override
		public Double calcularMonto() {
			
			Prestacion ultPrestacion = this.prestacionesRecibidas.stream()
					                   .findFirst().get();
			
			Double costo = ultPrestacion.getTipoDeEsta().equals(TipoPrestacion.MEDICAS)? (ultPrestacion.getCosto()*0.25):(ultPrestacion.getCosto()*0.50); 
			
			return costo;
		}
         

}
