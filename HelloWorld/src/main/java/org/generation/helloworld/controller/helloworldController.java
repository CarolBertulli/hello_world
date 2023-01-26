package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")

 
public class helloworldController {
	@GetMapping
	public String hellowolrd() {
		return "Hello World!";
		}
		
		@GetMapping ("/bsm")
	    public String bsm() {
	        return "Comunicação, Mentalidade de crescimento, Orientação ao detalhe, Orientação ao Futuro, Persistência, Proatividade, Responsabilidade Pessoal, Trabalho em Equipe";
	 }
	        @GetMapping ("/objetivos")
		    public String objetivos() {
		        return "Realização de tarefas, persistência, foco e determinação.";
	}
	}
		
