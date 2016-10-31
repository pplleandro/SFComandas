package control;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ejb.ServicosBeanLocal;
import version01.Servicos;

@ManagedBean(name="crtServicos")
@ViewScoped

public class crtServicos {

	@EJB
	private ServicosBeanLocal servicosBean;
	private Servicos model = new Servicos();
	
	public Servicos getModel() {
		return model;
	}
	public void setModel(Servicos model) {
		this.model = model;
	}
	
	public void create(){
		model = new Servicos();
	}
	

	public void save(){
		
		servicosBean.save(model);
		
	}
	
	public void remove(){
		servicosBean.remove(model);
		
	}
}
