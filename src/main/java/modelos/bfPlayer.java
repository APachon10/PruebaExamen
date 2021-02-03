package modelos;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bfPlayer")
public class bfPlayer {
	//Atributos
	@Id
	@Column(name="user_id")
	private String id;
	@Column(name="class_id")
	private int clase;
	@Column(name="primary_weapon")
	private int arma_principal;
	@Column(name="device1")
	private int dispositivo;
	@Column(name="kills")
	private int bajas;
	@Column(name="Deads")
	private int caidas;
	
	public bfPlayer() {
		super();
	}

	public bfPlayer(String id,int clase, int arma_principal, int dispositivo, int bajas, int caidas) {
		super();
		this.id=id;
		this.clase = clase;
		this.arma_principal = arma_principal;
		this.dispositivo = dispositivo;
		this.bajas = bajas;
		this.caidas = caidas;
	}

	
	public String getId() {
		return id;
	}

	public int getClase() {
		return clase;
	}

	public int getArma_principal() {
		return arma_principal;
	}

	public int getDispositivo() {
		return dispositivo;
	}

	public int getBajas() {
		return bajas;
	}

	public int getCaidas() {
		return caidas;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setClase(int clase) {
		this.clase = clase;
	}

	public void setArma_principal(int arma_principal) {
		this.arma_principal = arma_principal;
	}

	public void setDispositivo(int dispositivo) {
		this.dispositivo = dispositivo;
	}

	public void setBajas(int bajas) {
		this.bajas = bajas;
	}

	public void setCaidas(int caidas) {
		this.caidas = caidas;
	}

	
	@Override
	public String toString() {
		return "bfPlayer [id=" + id + ", clase=" + clase + ", arma_principal=" + arma_principal + ", dispositivo="
				+ dispositivo + ", bajas=" + bajas + ", caidas=" + caidas + "]";
	}

	
	
	
}
