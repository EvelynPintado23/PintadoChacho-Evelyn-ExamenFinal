package ec.edu.ups.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Sintomas
 *
 */
@Entity

public class Sintomas implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String descripcion;
	@OneToOne
	@JoinColumn
	private CitaMedica citamedica;
	
	public Sintomas() {
		
	}

	public Sintomas(String descripcion, CitaMedica citamedica) {
		super();
		this.descripcion = descripcion;
		this.citamedica = citamedica;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Sintomas [codigo=" + codigo + ", descripcion=" + descripcion + ", citamedica=" + citamedica + "]";
	}
	
	
   
}
