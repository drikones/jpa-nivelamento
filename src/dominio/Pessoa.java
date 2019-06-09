package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * 
 * @author Adriano Rocha
 * @since 19/05/2019
 * 
 * @category classe responsável por representar a entidade Pessoa no sistema
 */
@Entity
public class Pessoa implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	private String nome;
	private String email;
	
	public Pessoa() {}
	
	public Pessoa(Integer id, String nome, String email) {
		super();
		Id = id;
		this.nome = nome;
		this.email = email;
	}


	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [Id=" + Id + ", nome=" + nome + ", email=" + email + "]";
	}
	
	

}
