package ec.edu.ups.entidad;

import java.io.Serializable;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: SignosVitales
 *
 */
@Entity

public class SignosVitales implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String presion;
	private String frecuenciacardiaca;
	private String frecuenciarespiratoria;
	private String temperatura;
	private String saturacion;
	@OneToOne
	@JoinColumn
	private CitaMedica citamedica;
	
	public SignosVitales() {
		
	}

	public SignosVitales(String presion, String frecuenciacardiaca, String frecuenciarespiratoria, String temperatura,
			String saturacion, CitaMedica citamedica) {
		this.presion = presion;
		this.frecuenciacardiaca = frecuenciacardiaca;
		this.frecuenciarespiratoria = frecuenciarespiratoria;
		this.temperatura = temperatura;
		this.saturacion = saturacion;
		this.citamedica = citamedica;
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPresion() {
		return presion;
	}

	public void setPresion(String presion) {
		this.presion = presion;
	}

	public String getFrecuenciacardiaca() {
		return frecuenciacardiaca;
	}

	public void setFrecuenciacardiaca(String frecuenciacardiaca) {
		this.frecuenciacardiaca = frecuenciacardiaca;
	}

	public String getFrecuenciarespiratoria() {
		return frecuenciarespiratoria;
	}

	public void setFrecuenciarespiratoria(String frecuenciarespiratoria) {
		this.frecuenciarespiratoria = frecuenciarespiratoria;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	public String getSaturacion() {
		return saturacion;
	}

	public void setSaturacion(String saturacion) {
		this.saturacion = saturacion;
	}

	public CitaMedica getCitamedica() {
		return citamedica;
	}

	public void setCitamedica(CitaMedica citamedica) {
		this.citamedica = citamedica;
	}

	@Override
	public String toString() {
		return "SignosVitales [codigo=" + codigo + ", presion=" + presion + ", frecuenciacardiaca=" + frecuenciacardiaca
				+ ", frecuenciarespiratoria=" + frecuenciarespiratoria + ", temperatura=" + temperatura
				+ ", saturacion=" + saturacion + ", citamedica=" + citamedica + "]";
	}
	
   
}
