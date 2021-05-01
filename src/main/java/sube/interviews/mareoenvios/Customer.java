package sube.interviews.mareoenvios;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
@Entity // This tells Hibernate to make a table out of this class
@Table(name = "Customer")
public class Customer {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name = "id")
	  private Integer id;
	  
	  @Column(name = "first_name")
	  private String FirstName;
	  
	  @Column(name = "last_name")
	  private String LastName;
	  
	  @Column(name = "address")
	  private String  address;
	  
	  @Column(name = "city")
	  private String city;
}
