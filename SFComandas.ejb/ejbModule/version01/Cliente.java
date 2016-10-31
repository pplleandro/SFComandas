package version01;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@NamedQueries({
	
	@NamedQuery(name="getAllCliente", query="select b from Cliente b"),
	
	//@NamedQuery(name="getClienteName", query="select c from Cliente where c.nome like :nome"),
	
})

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long oid;
	
	@Column(length=500)
	private String nome;
	
	@Column
	private int telefone;
	
	@Column(unique=true)
	private String email;
	
	
	
	//@ManyToMany(cascade={CascadeType.MERGE,CascadeType.REFRESH})
	//private Cidade minhacidade;
	
	//RELACIONAMENTO COM COMANDA
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cliente_comanda")
	private Comanda com;
	
	
	
	
	
	
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Comanda getCom() {
		return com;
	}
	public void setCom(Comanda com) {
		this.com = com;
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

	

}
