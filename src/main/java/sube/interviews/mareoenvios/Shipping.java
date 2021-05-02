package sube.interviews.mareoenvios;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import java.util.List;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;

@Entity
@Table(name = "Shipping")
public class Shipping {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	//Column(name = "customer_id")
	@ManyToOne
	private Customer customer;
	@OneToMany(mappedBy = "shipping")
	private List<ShippingItem> shippend;
	@Column(name = "state")
	private String state;

	@Column(name = "send_date")
	private Timestamp sendLocalDate;

	@Column(name = "arrive_date")
	private Timestamp arriveLocalDate;

	@Column(name = "priority")
	private Integer priority;

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Timestamp getSendLocalDate() {
		return sendLocalDate;
	}

	public void setSendLocalDate(Timestamp sendLocalDate) {
		this.sendLocalDate = sendLocalDate;
	}

	public Timestamp getArriveLocalDate() {
		return arriveLocalDate;
	}

	public void setArriveLocalDate(Timestamp arriveLocalDate) {
		this.arriveLocalDate = arriveLocalDate;
	}

}
