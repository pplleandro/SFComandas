package version01;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

//@NamedQueries({
//	@NamedQuery(name="getAllProduto", query="select c from Produto c")
//})


@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long oid;
	private String nome;
	private float valor;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="produto_oid")//Para nao criar uma tabela associativa errada com dois FK
	private List<ItemComanda> itens = new ArrayList<ItemComanda>();
	
	//RELACIONAMENTO COM COMANDA
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="comanda_func")
	private List<Funcionario> funcs = new ArrayList<Funcionario>();
	

	
	
	
	public List<ItemComanda> getItens() {
		return itens;
	}
	public void setItens(List<ItemComanda> itens) {
		this.itens = itens;
	}
	public long getOid() {
		return oid;
	}
	public void setOid(long oid) {
		this.oid = oid;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
}
