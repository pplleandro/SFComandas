package control;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ejb.ProdutoBeanLocal;
import version01.Produto;

@ManagedBean(name="crtProduto")
@ViewScoped

public class crtProduto {
	
	@EJB
	private ProdutoBeanLocal produtoBean;
	private Produto model = new Produto();
	
	
	public Produto getModel() {
		return model;
	}
	public void setModel(Produto model) {
		this.model = model;
	}
	
	public void create(){
		model = new Produto();
	}
	

	public void save(){
		
		produtoBean.save(model);
		
	}
	
	public void remove(){
		produtoBean.remove(model);
		
	}
	public List<Produto> getAllProduto(){
		return produtoBean.getAllProduto();
	}

}
