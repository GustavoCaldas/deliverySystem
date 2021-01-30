package com.deliverysystem.deliverysystem.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.deliverysystem.deliverysystem.entities.Order;
import com.deliverysystem.deliverysystem.entities.OrderStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class OrderDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Getter private Long id;
	@Getter @Setter private String address;
	@Getter @Setter private Double latitude;
	@Getter @Setter private Double longitude;
	@Getter @Setter private Instant moment;
	@Getter @Setter private OrderStatus status;
	@Getter @Setter private Double total;
	
	@Getter private List<ProductDTO> products = new ArrayList<>();
	
	public OrderDTO(Long id, String address, Double latitude, Double longitude, Instant moment, OrderStatus status, Double total) {
		super();
		this.id = id;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.moment = moment;
		this.status = status;
		this.total = total;
	}
	
	public OrderDTO(Order entity) {
		super();
		this.id = entity.getId();
		this.address = entity.getAddress();
		this.latitude = entity.getLatitude();
		this.longitude = entity.getLongitude();
		this.moment = entity.getMoment();
		this.status = entity.getStatus();
		this.total = entity.getTotal();
		products = entity.getProducts().stream()
				.map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}
}
