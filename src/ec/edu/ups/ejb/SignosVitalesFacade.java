package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ec.edu.ups.entidad.SignosVitales;

@Stateless
public class SignosVitalesFacade extends AbstractFacade<SignosVitales> {
	
	public SignosVitalesFacade() {
		super(SignosVitales.class);
		// TODO Auto-generated constructor stub
	}

	@PersistenceContext(unitName= "PintadoChacho-Evelyn-ExamenFinal")
	private EntityManager entityManager;
	
	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return entityManager;
	}

}
