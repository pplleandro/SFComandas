package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import version01.Servicos;

/**
 * Session Bean implementation class ServicosBean
 */
@Stateless
@LocalBean
public class ServicosBean implements ServicosBeanLocal {
	@PersistenceContext(name="sfccontext")
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public ServicosBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(Servicos serv) {
		// TODO Auto-generated method stub
		//Persist � o inserir do bda
		if (em.find(Servicos.class, serv.getOid()) == null) {
			em.persist(serv);
		} else {
			// UPDATE DO BDA
			em.merge(serv);
		}
		
	}

	@Override
	public void remove(Servicos serv) {
		// TODO Auto-generated method stub
		serv = em.find(Servicos.class, serv.getOid());
		em.remove(serv);
	}

}
