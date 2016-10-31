package version01;

import java.util.Date;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long oid;
	
	private String funcNome;
	
	private String funcSobreNome;
	
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date dataNasc;
	
	
	
	
	public long getOid() {
		return oid;
	}
	public void setOid(long oid) {
		this.oid = oid;
	}
	public String getFuncNome() {
		return funcNome;
	}
	public void setFuncNome(String funcNome) {
		this.funcNome = funcNome;
	}
	public String getFuncSobreNome() {
		return funcSobreNome;
	}
	public void setFuncSobreNome(String funcSobreNome) {
		this.funcSobreNome = funcSobreNome;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	

}
