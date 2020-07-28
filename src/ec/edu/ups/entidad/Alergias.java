package ec.edu.ups.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Alergias
 *
 */
@Entity

public class Alergias implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String descripcion;
	@OneToOne
	@JoinColumn
	private CitaMedica citamedica;

	public Alergias() {
		
	}
	

	public Alergias(String descripcion, CitaMedica citamedica) {
		super();
		this.descripcion = descripcion;
		this.citamedica = citamedica;
	}


	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public CitaMedica getCitamedica() {
		return citamedica;
	}

	public void setCitamedica(CitaMedica citamedica) {
		this.citamedica = citamedica;
	}



	@Override
	public String toString() {
		return "Alergias [codigo=" + codigo + ", descripcion=" + descripcion + ", citamedica=" + citamedica + "]";
	}
	
	
   
}
