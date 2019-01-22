package br.com.empresa.service;

import java.util.List;

import br.com.empresa.domain.Departamento;

public interface DepartamentoService {
	
	public void salvar(Departamento departamento);
	
	public void editar(Departamento departamento);
	
	public void excluir(Long id);
	
	Departamento buscaPorId(Long id);
	
	List<Departamento> buscarTodos();

	public boolean departamentoTemCargos(Long id);

}
