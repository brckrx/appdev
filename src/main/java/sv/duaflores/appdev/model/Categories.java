package sv.duaflores.appdev.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Categories {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ct_id;

	@Column(name = "ct_name")
	private String ct_name;

	@Column(name = "ct_file")
	private String ct_file;

	public Categories() {

	}

	public Categories(String ct_name, String ct_file) {
		this.ct_name = ct_name;
		this.ct_file = ct_file;

	}

	public long getCt_id() {
		return ct_id;
	}

	public void setCt_id(long ct_id) {
		this.ct_id = ct_id;
	}

	public String getCt_name() {
		return ct_name;
	}

	public void setCt_name(String ct_name) {
		this.ct_name = ct_name;
	}

	public String getCt_file() {
		return ct_file;
	}

	public void setCt_file(String ct_file) {
		this.ct_file = ct_file;
	}

	@Override
	public String toString() {
		return "Categories [ct_id=" + ct_id + ", ct_name=" + ct_name + ", ct_file=" + ct_file + "]";
	}

}
