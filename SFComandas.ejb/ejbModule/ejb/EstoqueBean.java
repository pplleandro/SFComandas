package ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import version01.Cliente;
import version01.Estoque;

/**
 * Session Bean implementation class EstoqueBean
 */
@Stateless
@LocalBean
public class EstoqueBean implements EstoqueBeanLocal {
	@PersistenceContext(name="sfccontext")
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public EstoqueBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(Estoque estq) {
		// TODO Auto-generated method stub
		if(em.find(Estoque.class, estq.getOid())== null){
			em.persist(estq);
		}else{
			//UPDATE DO BDA
			em.merge(estq);
		}
		
	}

	@Override
	public void remove(Estoque estq) {
		// TODO Auto-generated method stub
		estq = em.find(Estoque.class, estq.getOid());
		em.remove(estq);
	}

	@Override
	public List<Estoque> getAllEstoque() {
		Query q = em.createNamedQuery("getAllEstoque");
		q.setMaxResults(100);
		return q.getResultList();
	}

}
