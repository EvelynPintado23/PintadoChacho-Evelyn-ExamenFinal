package ec.edu.ups.entidad;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Paciente
 *
 */
@Entity
public class Paciente implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String cedula;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String direccion;
	private String Correo;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
	private List<CitaMedica> citamedica;
	
	
	public Paciente() {

	}


	public Paciente(String cedula, String nombres, String apellidos, String telefono, String direccion, String correo,
			List<CitaMedica> citamedica) {
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.direccion = direccion;
		Correo = correo;
		this.citamedica = citamedica;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getCorreo() {
		return Correo;
	}


	public void setCorreo(String correo) {
		Correo = correo;
	}


	public List<CitaMedica> getCitamedica() {
		return citamedica;
	}


	public void setCitamedica(List<CitaMedica> citamedica) {
		this.citamedica = citamedica;
	}


	@Override
	public String toString() {
		return "Paciente [cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono="
				+ telefono + ", direccion=" + direccion + ", Correo=" + Correo + ", citamedica=" + citamedica + "]";
	}
	
   
}
