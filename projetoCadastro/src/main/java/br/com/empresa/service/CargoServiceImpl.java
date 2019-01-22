package br.com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.empresa.dao.CargoDao;
import br.com.empresa.domain.Cargo;

@Service 
@Transactional(readOnly =false)
public class CargoServiceImpl implements CargoService {

	@Autowired
	private CargoDao dao;
	
	public void salvar(Cargo cargo) {
		dao.save(cargo);
		
	}

	public void editar(Cargo cargo) {
		dao.update(cargo);
		
	}

	public void excluir(Long id) {
		dao.delete(id);
		
	}
	@Transactional(readOnly = true)
	public Cargo buscaPorId(Long id) {
		return dao.findById(id);
	}
	
	@Transactional(readOnly = true)
	public List<Cargo> buscarTodos() {
		return dao.findAll();
	}
	
	@Override
	public boolean cargoTemFuncionarios (Long id) {
		if(buscaPorId(id).getFuncionario().isEmpty()) {
			return false;
		}
		return true;
	}

}
