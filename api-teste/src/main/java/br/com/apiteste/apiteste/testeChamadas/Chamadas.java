package br.com.apiteste.apiteste.testeChamadas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiteste.apiteste.dtos.ObjetoDTO;

@RestController
@RequestMapping(value="/api")
public class Chamadas {
	@GetMapping("/meuGet")
	public String testaGet() {
		return "Chamou o Get";
	}
	
	@GetMapping("/meuGetComParametro/{id}")
	public String testaGet(@PathVariable(value="id")long id) {
		return "Chamou o Get com Parametro... "+ id;
	}
	
	@PostMapping("/meuPost")
	public ObjetoDTO testaPost(@RequestBody ObjetoDTO obj ) {
		return obj;
	}
}
