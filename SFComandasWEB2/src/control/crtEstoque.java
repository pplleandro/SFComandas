package control;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ejb.EstoqueBeanLocal;
import version01.Estoque;

@ManagedBean(name="crtEstoque")
@ViewScoped


public class crtEstoque {
	@EJB
	private EstoqueBeanLocal estoqueBean;
	private Estoque model = new Estoque();
	
	public Estoque getModel() {
		return model;
	}
	public void setModel(Estoque model) {
		this.model = model;
	}
	
	public void create(){
		model = new Estoque();
	}
	public List<Estoque> getAllEstoque(){
		return estoqueBean.getAllEstoque();
	}

	public void save(){
		
		estoqueBean.save(model);
		
	}
	public void remove(){
		estoqueBean.remove(model);
		
	}
}
