package br.com.empresa.service;

import java.util.List;

import br.com.empresa.domain.Cargo;

public interface CargoService {
	
	public void salvar(Cargo cargo);
	
	public void editar(Cargo cargo);
	
	public void excluir(Long id);
	
	Cargo buscaPorId(Long id);
	
	List<Cargo> buscarTodos();
	
	boolean cargoTemFuncionarios(Long id);

}
