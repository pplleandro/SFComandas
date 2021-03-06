package ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import version01.Cliente;


/**
 * Session Bean implementation class ClienteBean
 */
@Stateless
@LocalBean
public class ClienteBean implements ClienteBeanLocal {
	
	@PersistenceContext(name="sfccontext")
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public ClienteBean() {
        // TODO Auto-generated constructor stub
    }

	public void save(Cliente cliente) {
	    //Persist � o inserir do bda
		if(em.find(Cliente.class, cliente.getOid())== null){
			em.persist(cliente);
		}else{
			//UPDATE DO BDA
			em.merge(cliente);
		}
	}
	public void remove(Cliente cliente) {
		cliente = em.find(Cliente.class, cliente.getOid());
		em.remove(cliente);
	}
	public List<Cliente> getAllCliente() {
		Query q = em.createNamedQuery("getAllCliente");
		q.setMaxResults(100);
		return q.getResultList();
	}

	/*@Override
	public List<Cliente> getClienteName(String nome) {
		Query q = em.createNamedQuery("getClienteName");
		q.setParameter("nome", "%"+nome+"%");
		return q.getResultList();
	}*/

}
