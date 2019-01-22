package br.com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.empresa.dao.DepartamentoDao;
import br.com.empresa.domain.Departamento;

@Service
public class DepartamentoImpl implements DepartamentoService {

	@Autowired
	private DepartamentoDao dao;
	
	@Transactional(readOnly = false)
	public void salvar(Departamento departamento) {
		dao.save(departamento);
		
	}
	
	@Transactional(readOnly = false)
	public void editar(Departamento departamento) {
		dao.update(departamento);
		
	}

	@Transactional(readOnly = false)
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Transactional(readOnly = true)
	@Override
	public Departamento buscaPorId(Long id) {
		
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Departamento> buscarTodos() {
		return dao.findAll();
	}

	@Override
	public boolean departamentoTemCargos(Long id) {
		if(buscaPorId(id).getCargos().isEmpty()) {
			return false;
		}
		return true;
	}

}
