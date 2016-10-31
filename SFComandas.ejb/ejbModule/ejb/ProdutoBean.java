package ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import version01.Produto;

/**
 * Session Bean implementation class ProdutoBean
 */
@Stateless
@LocalBean
public class ProdutoBean implements ProdutoBeanLocal {
	
	@PersistenceContext(name="sfccontext")
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public ProdutoBean() {
        // TODO Auto-generated constructor stub
    }
    

	@Override
	public void save(Produto produto) {
		//Persist é o inserir do bda
		if(em.find(Produto.class, produto.getOid())== null){
			em.persist(produto);
		}else{
			//UPDATE DO BDA
			em.merge(produto);
		}
		
	}

	@Override
	public void remove(Produto produto) {
		em.remove(produto);
		
	}


//	@Override
//	public List<Produto> getAllProduto() {
//		Query q = em.createNamedQuery("getAllProduto");
//		q.setMaxResults(100);
//		return q.getResultList();
//	}
    

}
