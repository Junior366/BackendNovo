package br.itb.projeto.CentroArtesMarciais.rest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.itb.projeto.CentroArtesMarciais.model.entity.EntidadeBase;
import br.itb.projeto.CentroArtesMarciais.model.entity.Mensagem;
import br.itb.projeto.CentroArtesMarciais.service.ServiceBase;

public class ControllerBase<Entidade extends EntidadeBase> {
	ServiceBase<Entidade> service;
	
	
	
	public ControllerBase(ServiceBase<Entidade> service) {
		super();
		this.service = service;
	}

	@GetMapping("findAll")
	public ResponseEntity<List<Entidade>> findAll() {
		List<Entidade> mensagens = service.findAll();

		return new ResponseEntity<List<Entidade>>(
								mensagens, HttpStatus.OK);
	}
	
	@GetMapping("findById/{id}")
	public ResponseEntity<Entidade> findById(
			@PathVariable long id){
		Entidade mensagem = service.findById(id);
		
		return new ResponseEntity<Entidade>
						(mensagem, HttpStatus.OK);
		
	}
	
	@PostMapping("create")
	public ResponseEntity<Entidade> create (
			@RequestBody Entidade mensagem){
		
		Entidade _mensagem = 
				service.create(mensagem);
		
		return new ResponseEntity<Entidade>
				      (_mensagem, HttpStatus.OK);	
	}
	
	@PutMapping("update/{id}")
	public ResponseEntity<Entidade> update(
			@PathVariable long id, @RequestBody Entidade nova){
		
		Entidade mensagem = service.update(id, nova);
		
		return new ResponseEntity<Entidade>(
				mensagem, HttpStatus.OK);
	}
	
	@PutMapping("inativar/{id}")
	public ResponseEntity<Entidade> inativar(
			@PathVariable long id){
		
		Entidade mensagem = service.inativar(id);
		
		return new ResponseEntity<Entidade>(
				mensagem, HttpStatus.OK);
	}
	
	@DeleteMapping("deletar/{id}")
	public ResponseEntity<String> deletar(@PathVariable long id) {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	

}
