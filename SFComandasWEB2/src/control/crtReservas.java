package control;


import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ejb.ReservasBeanLocal;
import version01.Reservas;

@ManagedBean(name="crtReservas")
@ViewScoped


public class crtReservas {

	@EJB
	private ReservasBeanLocal reservasBean;
	private Reservas model = new Reservas();
	
	public Reservas getModel() {
		return model;
	}
	public void setModel(Reservas model) {
		this.model = model;
	}
	
	public void create(){
		model = new Reservas();
	}
	

	public void save(){
		
		reservasBean.save(model);
		
	}
	
	public void remove(){
		reservasBean.remove(model);
		
	}
	
	
}
