package br.com.empresa.dao;

import java.util.List;

import br.com.empresa.domain.Departamento;

public interface DepartamentoDao {
	
	public void save(Departamento departamento);
	
	public void update(Departamento departamento);
	
	public void delete(Long id);
	
	Departamento findById(Long id);
	
	List<Departamento> findAll();
	
	
	

}
