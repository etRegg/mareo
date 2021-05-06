package sube.interviews.mareoenvios.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "Shipping_item")
public class ShippingItem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@ManyToOne
	private Shipping shipping;

	@ManyToOne
	private Product product;

	@Column(name = "product_count")
	private Integer productCount;
}
