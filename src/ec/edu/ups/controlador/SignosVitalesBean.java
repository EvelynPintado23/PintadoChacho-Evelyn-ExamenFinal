package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.PacienteFacade;
import ec.edu.ups.entidad.CitaMedica;
import ec.edu.ups.entidad.Paciente;


@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class SignosVitalesBean implements Serializable{
	
	@EJB
	private PacienteFacade ejbPacienteFacade;
	private String cedula;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String direccion;
	private String Correo;
	private List<CitaMedica> citamedica;

	public SignosVitalesBean() {
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void init() {
		//System.out.println("listando pacientes: ");
		//ejbPacienteFacade.create(new Paciente("0124578536", "asdsed", "asds", "asdas", "asdasd"));
		
	}

	public PacienteFacade getEjbPacienteFacade() {
		return ejbPacienteFacade;
	}

	public void setEjbPacienteFacade(PacienteFacade ejbPacienteFacade) {
		this.ejbPacienteFacade = ejbPacienteFacade;
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
	
	

}
