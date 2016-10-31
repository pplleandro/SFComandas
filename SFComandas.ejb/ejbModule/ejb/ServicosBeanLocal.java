package ejb;

import javax.ejb.Local;
import version01.Servicos;

@Local
public interface ServicosBeanLocal {
	
	public void save(Servicos serv);
	public void remove(Servicos serv);
	
}
