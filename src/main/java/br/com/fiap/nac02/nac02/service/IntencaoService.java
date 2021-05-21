package br.com.fiap.nac02.nac02.service;

import java.util.List;

import br.com.fiap.nac02.nac02.dto.Intencao;



public interface IntencaoService {
	List<Intencao> listaIntecoes();
	Intencao salvarIntencao(Intencao intencao);
	Intencao editarIntencao(Long id);
	void excluirIntencao(Long id);

}
