package br.com.brasilcap.prmesbtemplate.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.brasilcap.prmesbtemplate.dtos.ObjetoDTO;

@RestController
@RequestMapping(value="/consome")
public class TemplateController {
	
	@PostMapping("/meuPost")
	public ObjetoDTO testaPost(@RequestBody ObjetoDTO obj ) {
		RestTemplate restTemplate = new RestTemplate();
		ObjetoDTO dto = restTemplate.postForObject("http://localhost:8080/api/meuPost",obj, ObjetoDTO.class);
		return dto;
	}

}
