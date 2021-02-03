package modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="weapon")
public class Weapon {
	@Id
	@Column(name="weapon_id")
	private int id;
	@Column(name="name")
	private String nombre;
	@Column(name="type")
	private String tipo;
	@Column(name="damage")
	private String dano_arma;
	@Column(name="accuracy")
	private String precision;
	
	public Weapon() {
		super();
	}
	public Weapon(String nombre, String tipo, String dano_arma, String precision) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.dano_arma = dano_arma;
		this.precision = precision;
	}
	
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public String getDano_arma() {
		return dano_arma;
	}
	public String getPrecision() {
		return precision;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setDano_arma(String dano_arma) {
		this.dano_arma = dano_arma;
	}
	public void setPrecision(String precision) {
		this.precision = precision;
	}
	
	@Override
	public String toString() {
		return "Weapon [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", dano_arma=" + dano_arma
				+ ", precision=" + precision + "]";
	}
	
	
	
}
