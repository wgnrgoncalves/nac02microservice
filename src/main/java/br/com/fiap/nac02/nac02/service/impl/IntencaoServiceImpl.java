package br.com.fiap.nac02.nac02.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.nac02.nac02.dto.Intencao;
import br.com.fiap.nac02.nac02.entity.IntencaoEntity;
import br.com.fiap.nac02.nac02.repository.IntencaoRepository;
import br.com.fiap.nac02.nac02.service.IntencaoService;

@Service
public class IntencaoServiceImpl implements IntencaoService {

	@Autowired
	private IntencaoRepository repository;
	
	@Override
	public List<Intencao> listaIntecoes() {
		List<IntencaoEntity> lista = repository.findAll();
		List<Intencao> intencoes = fromTo(lista);
		return intencoes;
	}

	

	@Override
	public Intencao salvarIntencao(Intencao intencao) {
		IntencaoEntity entity = fromTo(intencao);
		entity = repository.save(entity);
		
		Intencao intencaoRetorno = fromTo(entity);
		
		return intencaoRetorno;
	}
	@Override
	public Intencao editarIntencao(Long id) {
		IntencaoEntity entity = repository.findById(id).get();
		return fromTo(entity);
	}

	@Override
	public void excluirIntencao(Long id) {
		repository.deleteById(id);
		
	}

	
	private List<Intencao> fromTo(List<IntencaoEntity> lista) {
		List<Intencao> listaDto = new ArrayList<>();
		for (IntencaoEntity intencaoEntity : lista) {
			listaDto.add(fromTo(intencaoEntity));
			
			
		}
		return listaDto;
	}
	
	private IntencaoEntity fromTo(Intencao intencao) {
		IntencaoEntity entity = new IntencaoEntity();
		
		entity.setId(intencao.getId());
		entity.setCliente(intencao.getCliente());		
		entity.setLongradouro(intencao.getLongradouro());
		
		entity.setNumero(intencao.getNumero());
		entity.setCidade(intencao.getCidade());
		entity.setEstado(intencao.getEstado());
		entity.setCep(intencao.getCep());
		entity.setCpf(intencao.getCpf());
		entity.setRg(intencao.getRg());
		entity.setDtnasc(intencao.getDtnasc());
		entity.setEmail(intencao.getEmail());
		entity.setTelefone(intencao.getTelefone());
		entity.setCelular(intencao.getCelular());
		entity.setTpFinanciamento(intencao.getTpFinanciamento());
		entity.setQtd(intencao.getQtd());
		entity.setValor(intencao.getValor());
		entity.setSalario(intencao.getSalario());
		

		return entity;
	}
	
	private Intencao fromTo(IntencaoEntity entity) {
		Intencao intencao = new Intencao();
		
		intencao.setId(entity.getId());
		intencao.setCliente(entity.getCliente());		
		intencao.setLongradouro(entity.getLongradouro());
		
		intencao.setNumero(entity.getNumero());
		intencao.setCidade(entity.getCidade());
		intencao.setEstado(entity.getEstado());
		intencao.setCep(entity.getCep());
		intencao.setCpf(entity.getCpf());
		intencao.setRg(entity.getRg());
		intencao.setDtnasc(entity.getDtnasc());
		intencao.setEmail(entity.getEmail());
		intencao.setTelefone(entity.getTelefone());
		intencao.setCelular(entity.getCelular());
		intencao.setTpFinanciamento(entity.getTpFinanciamento());
		intencao.setQtd(entity.getQtd());
		intencao.setValor(entity.getValor());
		intencao.setSalario(entity.getSalario());
		
		return intencao;
	}

}
