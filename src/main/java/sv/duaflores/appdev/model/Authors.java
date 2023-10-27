package sv.duaflores.appdev.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "authors")
public class Authors {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long at_id;

	@Column(name = "at_name")
	private String at_name;

	@Column(name = "at_birth_date")
	private Date at_birth_date;

	@Column(name = "at_country")
	private String at_country;

	public Authors() {

	}

	public Authors(String at_name, Date at_birth_date, String at_country) {
		this.at_name = at_name;
		this.at_birth_date = at_birth_date;
		this.at_country = at_country;

	}

	public long getAt_id() {
		return at_id;
	}

	public void setAt_id(long at_id) {
		this.at_id = at_id;
	}

	public String getAt_name() {
		return at_name;
	}

	public void setAt_name(String at_name) {
		this.at_name = at_name;
	}

	public Date getAt_birth_date() {
		return at_birth_date;
	}

	public void setAt_birth_date(Date at_birth_date) {
		this.at_birth_date = at_birth_date;
	}

	public String getAt_country() {
		return at_country;
	}

	public void setAt_country(String at_country) {
		this.at_country = at_country;
	}

	@Override
	public String toString() {
		return "Authors [at_id=" + at_id + ", at_name=" + at_name + ", at_birth_date=" + at_birth_date + ", at_country="
				+ at_country + "]";
	}

}
