package ec.edu.ups.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import ec.edu.ups.entidad.Paciente;

@Stateless
public class PacienteFacade extends AbstractFacade<Paciente>{
	
	public PacienteFacade() {
		super(Paciente.class);
		// TODO Auto-generated constructor stub
	}

	@PersistenceContext(unitName= "PintadoChacho-Evelyn-ExamenFinal")
	private EntityManager entityManager;
	
	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return entityManager;
	}
	
	/*
	public List<Paciente> findByName(String name) {        
  	  String $name = "%" + name.replaceAll(" ", "%") + "%";        
  	  CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();          
  	  CriteriaQuery<Paciente> criteriaQuery = criteriaBuilder.createQuery(Paciente.class);        
  	  Root<Paciente> paciente = criteriaQuery.from(Paciente.class);        
  	  criteriaQuery.select(paciente);        
  	  criteriaQuery.where(criteriaBuilder.like(paciente.get("name").as(String.class), $name));        
  	  List<Paciente> list = entityManager.createQuery(criteriaQuery).getResultList();        return list;    
  	}
*/
}
