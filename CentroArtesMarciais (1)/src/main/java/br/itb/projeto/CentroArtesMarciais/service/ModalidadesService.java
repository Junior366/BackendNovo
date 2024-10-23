package br.itb.projeto.CentroArtesMarciais.service;

import org.springframework.stereotype.Service;

import br.itb.projeto.CentroArtesMarciais.model.entity.Modalidades;
import br.itb.projeto.CentroArtesMarciais.model.repository.RepositoryBase;

@Service
public class ModalidadesService extends ServiceBase <Modalidades>{

	public ModalidadesService(RepositoryBase<Modalidades> mensagemRepository) {
		super(mensagemRepository);
		// TODO Auto-generated constructor stub
	}
	

}
