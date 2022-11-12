package tn.esprit.Persistance;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "Universite")
public class Universite implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idUniv")
	private int idUniv;
	private String nomUniv;
	public int getIdUniv() {
		return idUniv;
	}
	public void setIdUniv(int idUniv) {
		this.idUniv = idUniv;
	}
	public String getNomUniv() {
		return nomUniv;
	}
	public void setNomUniv(String nomUniv) {
		this.nomUniv = nomUniv;
	}
	public Universite(int idUniv, String nomUniv) {
		super();
		this.idUniv = idUniv;
		this.nomUniv = nomUniv;
	}
	public Universite() {
		super();
	}
	@OneToMany(cascade = CascadeType.ALL)

	private Set<Department> departments;
	
}
