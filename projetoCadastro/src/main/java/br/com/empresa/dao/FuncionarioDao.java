package br.com.empresa.dao;

import java.time.LocalDate;
import java.util.List;

import br.com.empresa.domain.Funcionario;

public interface FuncionarioDao {
	
	public void save(Funcionario funcionario);
	
	public void update(Funcionario funcionario);
	
	public void delete(Long id);
	
	
	public Funcionario findById(Long id);
	
	public List<Funcionario> findAll();

    public List<Funcionario> findByNome(String nome);

	public List<Funcionario> findByCargoID(Long id);

	public List<Funcionario> findByDataEntradaDataSaida(LocalDate entrada, LocalDate saida);

	public List<Funcionario> findByDataEntrada(LocalDate entrada);

	public List<Funcionario> findByDataSaida(LocalDate saida);
	
	
	
	
	
	

}
