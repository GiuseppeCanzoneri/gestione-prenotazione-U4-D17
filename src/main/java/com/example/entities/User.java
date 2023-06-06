package com.example.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

	private Long id;
	private String username;
	private String nome;
	private String email;
	private Boolean active = true;

}
