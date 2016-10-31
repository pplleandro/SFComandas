package ejb;

import java.util.List;

import javax.ejb.Local;

import version01.Cliente;


@Local
public interface ClienteBeanLocal {

	public void save(Cliente cliente);
	public void remove(Cliente cliente);
//	public List<Cliente> getClienteName(String nome);
	public List<Cliente> getAllCliente();
   
}
