package ejb;

import javax.ejb.Local;
import version01.Funcionario;

@Local
public interface FuncionarioBeanLocal {
	
	public void save(Funcionario funcionario);
	public void remove(Funcionario funcionario);
	
	
}
