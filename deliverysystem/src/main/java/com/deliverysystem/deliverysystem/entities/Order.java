package com.deliverysystem.deliverysystem.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
// import javax.persistence.EnumType;
// import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_order")
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	@Getter private Long id;
	@Getter @Setter private String address;
	@Getter @Setter private Double latitude;
	@Getter @Setter private Double longitude;
	@Getter @Setter private Instant moment;
	@Getter @Setter private OrderStatus status;
	
	@ManyToMany
	@JoinTable(name = "tb_order_product",
				joinColumns = @JoinColumn(name = "order_id"),
				inverseJoinColumns = @JoinColumn(name = "product_id"))
	@Getter private Set<Product> products = new HashSet<>();
	
	public Double getTotal() {
		double sum = 0;
		for (Product p : products) {
			sum += p.getPrice();
		}
		return sum;
	}

	public Order(Long id, String address, Double latitude, Double longitude, Instant moment, OrderStatus status) {
		super();
		this.id = id;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.moment = moment;
		this.status = status;
	}
	
}
