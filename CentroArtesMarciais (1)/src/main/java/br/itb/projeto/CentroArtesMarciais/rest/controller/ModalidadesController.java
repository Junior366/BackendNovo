package br.itb.projeto.CentroArtesMarciais.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itb.projeto.CentroArtesMarciais.model.entity.Modalidades;
import br.itb.projeto.CentroArtesMarciais.service.ServiceBase;
@RequestMapping("/Modalidades/")
@RestController
public class ModalidadesController extends ControllerBase <Modalidades> {

	public ModalidadesController(ServiceBase<Modalidades> service) {
		super(service);
		// TODO Auto-generated constructor stub
	}
	

}
