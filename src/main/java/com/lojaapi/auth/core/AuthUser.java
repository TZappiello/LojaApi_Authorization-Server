package com.lojaapi.auth.core;

import java.util.Collections;

import org.springframework.security.core.userdetails.User;

import com.lojaapi.auth.domain.UsuarioEntity;

import lombok.Getter;

@Getter
public class AuthUser extends User {
	private static final long serialVersionUID = 1L;
	
	private Long userId;
	private String fullname;
	

	public AuthUser(UsuarioEntity usuario) {
		super(usuario.getEmail(), usuario.getSenha(), Collections.EMPTY_LIST);
		
		this.userId = usuario.getId();
		this.fullname = usuario.getNome();
	}
}
