package ec.edu.ups.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: CitaMedica
 *
 */
@Entity

public class CitaMedica implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private Date fecha_cita;
	private Date hora_cita;
	@OneToOne
	@JoinColumn
	private SignosVitales signos;
	@ManyToOne
	@JoinColumn
	private Paciente paciente;
	private boolean estado;
	
	public CitaMedica() {
	}
	
	

	public CitaMedica(Date fecha_cita, Date hora_cita, SignosVitales signos, Paciente paciente, boolean estado) {

		this.fecha_cita = fecha_cita;
		this.hora_cita = hora_cita;
		this.signos = signos;
		this.paciente = paciente;
		this.estado = estado;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getFecha_cita() {
		return fecha_cita;
	}

	public void setFecha_cita(Date fecha_cita) {
		this.fecha_cita = fecha_cita;
	}

	public Date getHora_cita() {
		return hora_cita;
	}

	public void setHora_cita(Date hora_cita) {
		this.hora_cita = hora_cita;
	}

	public SignosVitales getSignos() {
		return signos;
	}

	public void setSignos(SignosVitales signos) {
		this.signos = signos;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "CitaMedica [codigo=" + codigo + ", fecha_cita=" + fecha_cita + ", hora_cita=" + hora_cita + ", signos="
				+ signos + ", paciente=" + paciente + ", estado=" + estado + "]";
	}


	
}
