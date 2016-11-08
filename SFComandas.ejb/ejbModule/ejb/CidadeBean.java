package ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import version01.Cidade;

/**
 * Session Bean implementation class CidadeBean
 */
@Stateless
@LocalBean
public class CidadeBean implements CidadeBeanLocal{

	
	@PersistenceContext(name="sfccontext")
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public CidadeBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Cidade> getAllCidade() {
		Query q = em.createNamedQuery("getAllCidade");
		q.setMaxResults(100);
		return q.getResultList();
	}

}
