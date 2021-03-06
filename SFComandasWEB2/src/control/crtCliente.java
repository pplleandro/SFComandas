package control;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ejb.CidadeBean;
import ejb.ClienteBeanLocal;
import version01.Cidade;
import version01.Cliente;


@ManagedBean(name="crtcliente")
@ViewScoped

public class crtCliente {
	
	@EJB
	private ClienteBeanLocal clienteBean;
	private Cliente model = new Cliente();
	
	@EJB
	private CidadeBean cidadeBean;
	
	private String busca;
	
	private List<Cidade> colCidades = new ArrayList<Cidade>();
	private List<Cliente> colCliente = new ArrayList<Cliente>();
	
	@PostConstruct
	public void init(){
		colCliente = clienteBean.getAllCliente();
		colCidades = cidadeBean.getAllCidade();
	}
	
	
	public List<Cidade> getColCidades() {
		return colCidades;
	}


	public void setColCidades(List<Cidade> colCidades) {
		this.colCidades = colCidades;
	}


	public List<Cliente> getColCliente() {
		return colCliente;
	}


	public void setColCliente(List<Cliente> colCliente) {
		this.colCliente = colCliente;
	}


	public List<Cliente> getCoolCliente() {
		return colCliente;
	}

	public void setCoolCliente(List<Cliente> coolCliente) {
		this.colCliente = coolCliente;
	}

	public void create(){
		model = new Cliente();
	}
	
	public Cliente getModel() {
		return model;
	}

	public void setModel(Cliente model) {
		this.model = model;
	}

	public void save(){
		
		clienteBean.save(model);
		init();
	}
	
	public List<Cliente> getAllCliente(){
		return clienteBean.getAllCliente();
	}
	
	public void remove(){
		clienteBean.remove(model);
		init();
	}

	/*public void busca(){
		colCliente = clienteBean.getClienteName(busca);
	}*/
	
	public String getBusca() {
		return busca;
	}

	public void setBusca(String busca) {
		this.busca = busca;
	}

	
}
