package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;
import ec.edu.ups.ejb.SintomasFacade;
import ec.edu.ups.entidad.CitaMedica;
import ec.edu.ups.entidad.Sintomas;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class SintomasBean implements Serializable {
	
	@EJB
	private SintomasFacade ejbSintomasFacade;
	private Sintomas sintomas;
	private Sintomas sintomasListar;
	private List<Sintomas> sintomasList;
	

	public SintomasBean() {
		
	}
	
	 @PostConstruct
	    public void init() {
			this.sintomasList = ejbSintomasFacade.findAll();
		    this.sintomas = new Sintomas();
		    this.sintomasListar = new Sintomas();
	    }

	public Sintomas getSintomas() {
		return sintomas;
	}

	public void setSintomas(Sintomas sintomas) {
		this.sintomas = sintomas;
	}

	public Sintomas getSintomasListar() {
		return sintomasListar;
	}

	public void setSintomasListar(Sintomas sintomasListar) {
		this.sintomasListar = sintomasListar;
	}

	public List<Sintomas> getSintomasList() {
		return sintomasList;
	}

	public void setSintomasList(List<Sintomas> sintomasList) {
		this.sintomasList = sintomasList;
	}
	 
    public void crear() {
    	this.sintomas.setCodigo(sintomas.getCodigo());
    	this.sintomas.setDescripcion(sintomas.getDescripcion());
    	ejbSintomasFacade.create(sintomas);
    	this.sintomas = new Sintomas();
    	sintomasList = ejbSintomasFacade.findAll();
 
    } 
    
    public String delete(Sintomas s) {
    	ejbSintomasFacade.remove(s);
        sintomasList = ejbSintomasFacade.findAll();
        return null;
    }

    public String listsintomas(Sintomas listsintomas) {
    	this.sintomasListar=listsintomas;
    	return "ListaSintomas?faces-redirect=true";
    }
    
	 
}
