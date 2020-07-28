package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.CitaMedicaFacade;
import ec.edu.ups.ejb.PacienteFacade;
import ec.edu.ups.entidad.CitaMedica;
import ec.edu.ups.entidad.Paciente;
import ec.edu.ups.entidad.SignosVitales;


@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class CitaMedicaBean implements Serializable{
	
	 	@EJB
	 	private CitaMedicaFacade ejbCitaMedicaFacade;
	    private CitaMedica citamedica;
	    private CitaMedica citaListar;
	    private List<CitaMedica> citaList;

	    public CitaMedicaBean(){ }

	    @PostConstruct
	    public void init() {
	    	this.citaList = ejbCitaMedicaFacade.findAll();
	    	this.citamedica=new CitaMedica();
	    	this.citaListar = new CitaMedica();
	    }

		public CitaMedicaFacade getEjbCitaMedicaFacade() {
			return ejbCitaMedicaFacade;
		}

		public void setEjbCitaMedicaFacade(CitaMedicaFacade ejbCitaMedicaFacade) {
			this.ejbCitaMedicaFacade = ejbCitaMedicaFacade;
		}

		public CitaMedica getCitamedica() {
			return citamedica;
		}

		public void setCitamedica(CitaMedica citamedica) {
			this.citamedica = citamedica;
		}

		public CitaMedica getCitaListar() {
			return citaListar;
		}

		public void setCitaListar(CitaMedica citaListar) {
			this.citaListar = citaListar;
		}

		public List<CitaMedica> getCitaList() {
			return citaList;
		}

		public void setCitaList(List<CitaMedica> citaList) {
			this.citaList = citaList;
		}
	    

		 public void crear() {
			 this.citamedica.isEstado();
		     this.citamedica.setCodigo(citamedica.getCodigo());
		     ejbCitaMedicaFacade.create(citamedica);
		     this.citamedica = new CitaMedica();
		     citaList = ejbCitaMedicaFacade.findAll();
		 }
		
		 public String delete(CitaMedica c) {
			 ejbCitaMedicaFacade.remove(c);
			 citaList = ejbCitaMedicaFacade.findAll();
			 return null;
		 }

		 public String listacita(CitaMedica listacita) {
			 this.citaListar=listacita;
			 return "ListaCita?faces-redirect=true";
		 }
	

}
