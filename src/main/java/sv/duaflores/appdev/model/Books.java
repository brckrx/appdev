package sv.duaflores.appdev.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_books_id")
	@SequenceGenerator(name = "sq_books_id", sequenceName = "sq_books_id", allocationSize = 1)
	private long bk_id;

	@OneToOne
	@JoinColumn(name = "bk_ct_id")
	private Categories category;

	@OneToOne
	@JoinColumn(name = "bk_at_id")
	private Authors author;

	@Column(name = "bk_name")
	private String bk_name;

	@Column(name = "bk_price")
	private BigDecimal bk_price;

	@Column(name = "bk_status")
	private String bk_status;

	public Books() {

	}

	public Books(Categories category, Authors author) {
		this.category = category;
		this.author = author;
	}

	public long getBk_id() {
		return bk_id;
	}

	public void setBk_id(long bk_id) {
		this.bk_id = bk_id;
	}

	public Categories getCategory() {
		return category;
	}

	public void setCategory(Categories category) {
		this.category = category;
	}

	public Authors getAuthor() {
		return author;
	}

	public void setAuthor(Authors author) {
		this.author = author;
	}

	public String getBk_name() {
		return bk_name;
	}

	public void setBk_name(String bk_name) {
		this.bk_name = bk_name;
	}

	public BigDecimal getBk_price() {
		return bk_price;
	}

	public void setBk_price(BigDecimal bk_price) {
		this.bk_price = bk_price;
	}

	public String getBk_status() {
		return bk_status;
	}

	public void setBk_status(String bk_status) {
		this.bk_status = bk_status;
	}

	@Override
	public String toString() {
		return "Books [bk_id=" + bk_id + ", category=" + category + ", author=" + author + ", bk_name=" + bk_name
				+ ", bk_price=" + bk_price + ", bk_status=" + bk_status + "]";
	}

}
