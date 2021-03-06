package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import version01.Funcionario;

/**
 * Session Bean implementation class FuncionarioBean
 */
@Stateless
@LocalBean
public class FuncionarioBean implements FuncionarioBeanLocal{
	
	@PersistenceContext(name="sfccontext")
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public FuncionarioBean() {
        // TODO Auto-generated constructor stub
    }
    public void save(Funcionario funcionario) {
	    //Persist � o inserir do bda
		if(em.find(Funcionario.class, funcionario.getOid())== null){
			em.persist(funcionario);
		}else{
			//UPDATE DO BDA
			em.merge(funcionario);
		}
	}
	public void remove(Funcionario funcionario) {
		funcionario = em.find(Funcionario.class, funcionario.getOid());
		em.remove(funcionario);
	}
}


