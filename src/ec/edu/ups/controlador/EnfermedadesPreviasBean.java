package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.EnfermedadesPreviasFacade;
import ec.edu.ups.ejb.SintomasFacade;
import ec.edu.ups.entidad.EnfermedadesPrevias;
import ec.edu.ups.entidad.Sintomas;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class EnfermedadesPreviasBean implements Serializable{
	
	@EJB
	private EnfermedadesPreviasFacade ejbEnfermedadesPreviasFacade;
	private EnfermedadesPrevias enfermedades;
	private EnfermedadesPrevias enfermedadesListar;
	private List<EnfermedadesPrevias> enfermedadesList;
	
	@PostConstruct
    public void init() {
		this.enfermedadesList = ejbEnfermedadesPreviasFacade.findAll();
        this.enfermedades=new EnfermedadesPrevias();
        this.enfermedadesListar= new EnfermedadesPrevias();

    }

	public EnfermedadesPrevias getEnfermedades() {
		return enfermedades;
	}

	public void setEnfermedades(EnfermedadesPrevias enfermedades) {
		this.enfermedades = enfermedades;
	}

	public EnfermedadesPrevias getEnfermedadesListar() {
		return enfermedadesListar;
	}

	public void setEnfermedadesListar(EnfermedadesPrevias enfermedadesListar) {
		this.enfermedadesListar = enfermedadesListar;
	}

	public List<EnfermedadesPrevias> getEnfermedadesList() {
		return enfermedadesList;
	}

	public void setEnfermedadesList(List<EnfermedadesPrevias> enfermedadesList) {
		this.enfermedadesList = enfermedadesList;
	}
	
	public void crear() {
		this.enfermedades.setCodigo(enfermedades.getCodigo());
		this.enfermedades.setDescripcion(enfermedades.getDescripcion());
		ejbEnfermedadesPreviasFacade.create(enfermedades);
		this.enfermedades = new EnfermedadesPrevias();
		enfermedadesList = ejbEnfermedadesPreviasFacade.findAll();
 
    } 
    
    public String delete(EnfermedadesPrevias e) {
    	ejbEnfermedadesPreviasFacade.remove(e);
    	enfermedadesList = ejbEnfermedadesPreviasFacade.findAll();
    	return null;
    }

    public String listenfermedad(EnfermedadesPrevias listenfermedad) {
    	this.enfermedadesListar=listenfermedad;
    	return "ListaEnfermedades?faces-redirect=true";
    }

}
