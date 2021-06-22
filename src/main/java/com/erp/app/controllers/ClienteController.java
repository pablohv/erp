package com.erp.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.erp.app.entity.Cliente;
import com.erp.app.services.ClienteServiceImpl;

@Controller
@RequestMapping(value = "/cliente")
public class ClienteController {

	@Autowired
	private ClienteServiceImpl clienteService;

	@GetMapping(value = "/")
	public String index(Model model) {
		model.addAttribute("clientes", clienteService.findAll());
		return "cliente/listar";
	}
	
	@GetMapping(value = "/ver/{id}")
	public String ver(@PathVariable Short id, Model model) {
		model.addAttribute("cliente", clienteService.findById(id));
		return "cliente/ver";
	}
	
	@GetMapping(value = "/form")
	public String form(Model model) {
		Cliente cliente = new Cliente();
		model.addAttribute("cliente", cliente);
		return "cliente/form";
	}
	
	@GetMapping(value = "/editar/{id}")
	public String editar(@PathVariable Short id, Model model) {
		Cliente cliente = clienteService.findById(id);
		model.addAttribute("cliente", cliente);
		return "cliente/form";
	}
	
	@PostMapping(value = "/form")
	public String guardar(Cliente cliente) {
		clienteService.save(cliente);
		return "redirect:/cliente/";
	}

}
