package recuperatorio.ejercicio01;

import java.time.LocalDate;
import java.util.List;



/*Para ello necesita en un sistema registrar toda la informaci�n de sus afiliados, como el nombre, el correo electr�nico,
 el n�mero de documento , la fecha de nacimiento y el tipo de afiliaci�n que posee.

Los afiliados son de dos tipos, plan plus  y plan joven orientado a estudiantes universitarios.
 En ambos tipos de afiliado se guarda informaci�n de cual es el porcentaje que se reconoce para pr�cticas m�dicas 
 y para prestaciones odontol�gicas. Adem�s para los afiliados del plan plus se guarda el cuit del empleador. 
 En los afiliados del plan joven se guarda informaci�n de la universidad y la carrera que cursa.
 
 *Los afiliados tambi�n guardan una lista de las prestaciones efectivas de una pr�ctica que recibieron. 
Las mismas son registradas y se guarda informaci�n de la pr�ctica a la que refiere, la fecha en que se efectu� 
y si fue pre-aprobada y a que afiliado la realiz�. Las prestaciones a su vez son de dos tipos, m�dicas y odontol�gicas.

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
	
	/*b) En la clase que representa un afiliado implemente un m�todo que calcule cual es el monto que debe facturarse 
al afiliado, teniendo en cuenta las pr�cticas que realiz� (debe implementarlo de manera polim�rfica).*/
	
	public abstract Double calcularMonto();
	/*c) Implementar el m�todo registrar prestaci�n a un afiliado, donde se agregue a la lista de prestaciones recibidas 
	 * una prestaci�n. Este m�todo debe arrojar una excepci�n personalizada, si se agregan en el mismo mes mas de 3 
	 * pr�cticas odontol�gicas. (este m�todo debe ser final)*/
	
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
