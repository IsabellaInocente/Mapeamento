package com.example.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "itemvenda")
public class ItemVendas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "quantidade", nullable = false, length = 100)
	private int quantidade;
	
	@Column(name = "valor_unitario", nullable = false, length = 100)
	private double valor_unitario;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "produto_id")
	private Venda venda;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "venda_id")
	private Produto produto;
	

}
