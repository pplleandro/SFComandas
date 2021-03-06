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

@NamedQueries({
	
	@NamedQuery(name="getAllEstoque", query="select b from Estoque b"),
})

@Entity
public class Estoque {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long oid;
	
	private String itemNome;
	private int quantidade;
	private float valorU;
	private String descricao;
	
	
	
	
	//RELACIONAMENTO COM PRODUTOS
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ESTOQ_produto")
	private List<Produto> itens = new ArrayList<Produto>();




	public List<Produto> getItens() {
		return itens;
	}
	public void setItens(List<Produto> itens) {
		this.itens = itens;
	}
	public void setValorU(float valorU) {
		this.valorU = valorU;
	}
	public long getOid() {
		return oid;
	}
	public void setOid(long oid) {
		this.oid = oid;
	}
	public String getItemNome() {
		return itemNome;
	}
	public void setItemNome(String itemNome) {
		this.itemNome = itemNome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getValorU() {
		return valorU;
	}
	public void setValorU(int valorU) {
		this.valorU = valorU;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
