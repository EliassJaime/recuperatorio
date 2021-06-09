package recuperatorio.ejercicio01;

import java.time.LocalDate;
import java.util.List;



/*Para ello necesita en un sistema registrar toda la información de sus afiliados, como el nombre, el correo electrónico,
 el número de documento , la fecha de nacimiento y el tipo de afiliación que posee.

Los afiliados son de dos tipos, plan plus  y plan joven orientado a estudiantes universitarios.
 En ambos tipos de afiliado se guarda información de cual es el porcentaje que se reconoce para prácticas médicas 
 y para prestaciones odontológicas. Además para los afiliados del plan plus se guarda el cuit del empleador. 
 En los afiliados del plan joven se guarda información de la universidad y la carrera que cursa.
 
 *Los afiliados también guardan una lista de las prestaciones efectivas de una práctica que recibieron. 
Las mismas son registradas y se guarda información de la práctica a la que refiere, la fecha en que se efectuó 
y si fue pre-aprobada y a que afiliado la realizó. Las prestaciones a su vez son de dos tipos, médicas y odontológicas.

*

*/

public abstract class Afiliado {
	
	String nombre;
	String correo;
	Integer DNI;
	LocalDate FechaNac;
	List<Prestacion> prestacionesRecibidas;
	
	
	
	public Afiliado(String nombre, String correo, Integer dNI, LocalDate fechaNac,
			List<Prestacion> prestacionesRecibidas) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		DNI = dNI;
		FechaNac = fechaNac;
		this.prestacionesRecibidas = prestacionesRecibidas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Integer getDNI() {
		return DNI;
	}
	public void setDNI(Integer dNI) {
		DNI = dNI;
	}
	public LocalDate getFechaNac() {
		return FechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		FechaNac = fechaNac;
	}
	public List<Prestacion> getPrestacionesRecibidas() {
		return prestacionesRecibidas;
	}
	public void setPrestacionesRecibidas(List<Prestacion> prestacionesRecibidas) {
		this.prestacionesRecibidas = prestacionesRecibidas;
	}
	
	/*b) En la clase que representa un afiliado implemente un método que calcule cual es el monto que debe facturarse 
al afiliado, teniendo en cuenta las prácticas que realizó (debe implementarlo de manera polimórfica).*/
	
	public abstract Double calcularMonto();
	/*c) Implementar el método registrar prestación a un afiliado, donde se agregue a la lista de prestaciones recibidas 
	 * una prestación. Este método debe arrojar una excepción personalizada, si se agregan en el mismo mes mas de 3 
	 * prácticas odontológicas. (este método debe ser final)*/
	
	final void RegistrarPresentacion(Prestacion e) throws MasDe3Odontolo {
		
		List<Prestacion> prestaciones = this.getPrestacionesRecibidas();
			
			
				Double aux = prestaciones.stream()
				            .filter(c->c.getTipoDeEsta().equals(TipoPrestacion.ODONTOLOGICAS))
				            .mapToDouble( c->c.getTipoDeEsta())
				            .sum();
			       if(aux>3.0) {
			    	   throw new MasDe3Odontolo();	
			       }else {
			    	   prestaciones.add(e);
			       }
	}
	
	

}
