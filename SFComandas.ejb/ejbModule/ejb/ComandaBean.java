package ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import version01.Comanda;

/**
 * Session Bean implementation class ComandaBean
 */
@Stateless
public class ComandaBean implements ComandaBeanLocal {
	
	@PersistenceContext(name="sfccontext")
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public ComandaBean() {
        // TODO Auto-generated constructor stub
    }
	@Override
	public void save(Comanda comanda) {
		//Persist é o inserir do bda
		if(em.find(Comanda.class, comanda.getOid())== null){
			em.persist(comanda);
		}else{
			//UPDATE DO BDA
			em.merge(comanda);
		}
	
	}
	@Override
	public void remove(Comanda comanda) {
		em.remove(comanda);
		
	}
	@Override
	public List<Comanda> getAll() {
		Query q = em.createNamedQuery("getAllComanda");
		q.setMaxResults(100);
		return q.getResultList();
	}

}
