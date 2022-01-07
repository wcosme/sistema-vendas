package br.com.vendas.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TB_ORDER")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String storeName;
	
	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;	
	private LocalDate dataOrder;
	
	@Column(name = "total", length = 20, precision = 2)
	private BigDecimal total;
	
	@OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
	private List<Product> products;
	
	@Enumerated(EnumType.STRING)
	private Status staus;
	
}
