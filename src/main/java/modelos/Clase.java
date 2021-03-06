package modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="class")
public class Clase {
	@Id
	@Column(name="class_id")
	private int id;
	@Column(name="class_name")
	private String name;
	
	public Clase() {
		super();
	}
	public Clase(String name) {
		super();
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Clase [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
