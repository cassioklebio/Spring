package br.com.empresa.service;

import java.time.LocalDate;
import java.util.List;

import br.com.empresa.domain.Funcionario;

public interface FuncionarioService {
	
	public void salvar(Funcionario funcionario);
	
	public void editar(Funcionario funcionario);
	
	public void excluir(Long id);
	
	Funcionario buscarPorId(Long id);
	
	List<Funcionario> buscarTodos();

	List<Funcionario> buscarPorNome(String nome);

	List<Funcionario> buscarPorCargo(Long id);

	List<Funcionario> buscarPorDatas(LocalDate entrada, LocalDate saida);
	
	

}
