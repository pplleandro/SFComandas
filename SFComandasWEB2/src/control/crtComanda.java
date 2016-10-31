package control;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ejb.ComandaBeanLocal;
import version01.Comanda;

@ManagedBean(name="crtcomanda")
@ViewScoped
public class crtComanda {
	@EJB
	private ComandaBeanLocal comandaBean;
	private Comanda model = new Comanda();
	
	public void create(){
		model = new Comanda();
	}
	public void save(){
		
		comandaBean.save(model);
	}
	
	public List<Comanda> getAll(){
		return comandaBean.getAll();
	}
	
	public Comanda getModel() {
		return model;
	}

	public void setModel(Comanda model) {
		this.model = model;
	}
	
}
