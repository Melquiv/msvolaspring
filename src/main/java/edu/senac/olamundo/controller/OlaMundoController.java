package edu.senac.olamundo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.senac.olamundo.controller.model.Mensagem;
import edu.senac.olamundo.repository.MensagemRepository;



@RestController
@RequestMapping("/olamundo")
public class OlaMundoController {
	
	@Autowired
	private MensagemRepository mensagemRepository;

	@GetMapping
	public List <Mensagem> getExibir(){
		mensagemRepository.save(new Mensagem("Olá Mundo"));
		return mensagemRepository.findAll();
	}	
	
	
	@PostMapping
	public List <Mensagem> postExibir(){
		mensagemRepository.save(new Mensagem("Olá Mundo"));
		return mensagemRepository.findAll();
	}
	
	@DeleteMapping
	public List <Mensagem> deleteExibir(){
		mensagemRepository.save(new Mensagem("Olá Mundo"));
		return mensagemRepository.findAll();
	}
	
	
	@PutMapping
	public List <Mensagem> putExibir(){
		mensagemRepository.save(new Mensagem("Olá Mundo"));
		return mensagemRepository.findAll();
	}
}
