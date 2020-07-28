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
public class PacienteBean implements Serializable{
	
	@EJB
	private PacienteFacade ejbPacienteFacade;
	private Paciente paciente;
	private List<Paciente> list;

	public PacienteBean() {
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void init() {
		//System.out.println("listando pacientes: ");
		//ejbPacienteFacade.create(new Paciente("0124578536", "asdsed", "asds", "asdas", "asdasd"));
		
	}

   
	/*public void crear() {
        if (ejbPacienteFacade.find(paciente.getCedula())==null){
        	paciente.setNombres(paciente.getNombres().toUpperCase());
        	paciente.setApellidos(paciente.getApellidos().toUpperCase());
        	paciente.setDireccion(paciente.getDireccion().toUpperCase());
        	paciente.setTelefono(paciente.ge);
        	
            empleado.setEstado('A');
            empleado.setNombre(empleado.getNombre().toUpperCase());
            empleado.setApellido(empleado.getApellido().toUpperCase());
            ejbEmpleadoFacade.create(empleado);
            list = ejbEmpleadoFacade.findAll();
            this.empleado=new Empleado();
            Messages.create("Info").detail("Empleado Creado").add();
        }else {
            Messages.create("Fatal!").fatal().detail("Ya existe un empleado con la misma cedula").add();
        }
    }
*/
	

}
