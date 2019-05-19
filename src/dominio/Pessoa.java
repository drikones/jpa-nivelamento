package dominio;

import java.io.Serializable;


/**
 * 
 * @author Adriano Rocha
 * @since 19/05/2019
 * 
 * @category classe responsável por representar a entidade Pessoa no sistema
 */
public class Pessoa implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
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
