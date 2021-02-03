package modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="device")
public class Device {
	@Id
	@Column(name="device_id")
	private int id;
	@Column(name="name")
	private String nombre;
	
	public Device() {
		super();
	}

	public Device(String nombre) {
		super();
		this.nombre = nombre;
	}

	
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String nombre) {
		this.nombre = nombre;
	}

	
	@Override
	public String toString() {
		return "Device [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
