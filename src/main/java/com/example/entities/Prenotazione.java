package com.example.entities;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Prenotazione {

	private Long id;

	private User user;

	private Postazione postazione;

	private LocalDate dataPrenotata;

	private LocalDate dataPrenotazione;

}
