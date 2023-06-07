package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Postazione {

	private Long id;

	private String codice;
	private String descrizione;
	private Integer numeroMassimoOccupanti;

	private TipoPostazione tipo;
}
