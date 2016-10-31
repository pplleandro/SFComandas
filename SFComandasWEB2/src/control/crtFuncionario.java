package control;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import ejb.FuncionarioBeanLocal;
import version01.Funcionario;

@ManagedBean(name="crtFuncionario")
@ViewScoped

public class crtFuncionario {

	@EJB
	private FuncionarioBeanLocal funcionarioBean;
	private Funcionario model = new Funcionario();
	
	public Funcionario getModel() {
		return model;
	}
	public void setModel(Funcionario model) {
		this.model = model;
	}
	
	public void create(){
		model = new Funcionario();
	}
	

	public void save(){
		
		funcionarioBean.save(model);
		
	}
	
	public void remove(){
		funcionarioBean.remove(model);
		
	}
	
}
