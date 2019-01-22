package br.com.empresa.dao;

import java.util.List;

import br.com.empresa.domain.Cargo;


public interface CargoDao {
	
	
public void save(Cargo cargo);
	
	public void update(Cargo cargo);
	
	public void delete(Long id);
	
	Cargo findById(Long id);
	
	List<Cargo> findAll();
	

}
