package sube.interviews.mareoenvios.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;

import javax.persistence.Column;

@Entity 
@Table(name = "Customer")
public class Customer implements Comparable<Customer> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "first_name")
	private String FirstName;

	@Column(name = "last_name")
	private String LastName;

	@Column(name = "address")
	private String address;

	@Column(name = "city")
	private String city;
	
	@OneToMany(mappedBy = "customer")
	private List<Shipping> shippend;
	
	public Integer getCount() {
		return this.getShipped().size();
	}
	
    private List<Shipping> getShipped() {
    	return this.shippend;
    }


	@Override
	public int compareTo(Customer o) {
		
		return (o.getCount() - this.shippend.size());
	}
	
}
