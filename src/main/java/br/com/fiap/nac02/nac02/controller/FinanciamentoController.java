package br.com.fiap.nac02.nac02.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.com.fiap.nac02.nac02.dto.Intencao;
import br.com.fiap.nac02.nac02.service.impl.IntencaoServiceImpl;


@Controller
public class FinanciamentoController implements WebMvcConfigurer{
	
	  @Autowired 
	  IntencaoServiceImpl service;
	 
	
	@GetMapping("/")
	public ModelAndView index() {
		
		ModelAndView view = new ModelAndView("index");
		//Solicitacao solicitacao = service.editarSolicitacao(id);
		List<Intencao> intencoes = service.listaIntecoes();
		view.addObject("intencoes", intencoes);
		
		
		return view;
		//return "index";
	}
	
	@GetMapping("/create")
	public ModelAndView create() {
		ModelAndView view = new ModelAndView("create");
		view.addObject(new Intencao());
		return view;
	}
	
	@PostMapping("/create")
	public String createPost(@Valid Intencao intencao, BindingResult result, Model model) {
		if(result.hasErrors())
			return "create";
		service.salvarIntencao(intencao);
		return "redirect:/";
	}
	@GetMapping("/edit/{id}")
	public ModelAndView editarSolicitacao(@PathVariable Long id) {
		ModelAndView view = new ModelAndView("create");
		
		Intencao intencao = service.editarIntencao(id);
		if(intencao == null) {
			intencao = new Intencao();
		}
		view.addObject(intencao);
		return view;
		
	}
	
	

}
