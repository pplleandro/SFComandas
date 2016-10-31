package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import version01.Reservas;

/**
 * Session Bean implementation class ReservasBean
 */
@Stateless
@LocalBean
public class ReservasBean implements ReservasBeanLocal{
	
	@PersistenceContext(name="sfccontext")
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public ReservasBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(Reservas reserv) {
		// TODO Auto-generated method stub
		if(em.find(Reservas.class, reserv.getOid())== null){
			em.persist(reserv);
		}else{
			//UPDATE DO BDA
			em.merge(reserv);
		}
	}

	@Override
	public void remove(Reservas reserv) {
		// TODO Auto-generated method stub
		reserv = em.find(Reservas.class, reserv.getOid());
		em.remove(reserv);
	}

}
