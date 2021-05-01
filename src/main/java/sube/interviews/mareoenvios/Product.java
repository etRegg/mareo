package sube.interviews.mareoenvios;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
@Entity // This tells Hibernate to make a table out of this class
@Table(name = "Product")
public class Product {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name = "id")
	  private Integer id;
	  
	  @Column(name = "description")
	  private String description;
	  
	  @Column(name = "weight")
	  private double weight;
	  
	 
}
