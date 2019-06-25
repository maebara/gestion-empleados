package com.sergio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sergio.entity.Empleado;

@RestController
@RequestMapping("/api/empleado/")
public class EmpleadoController {
	
	@GetMapping("/all")
	public List<Empleado> getAllEmployers() {
		List<Empleado> lista = new ArrayList<>();		
		for(int i = 0; i < 20; i++) {
			lista.add(createEmpleado(i));
		}
		return lista;
	}

	private Empleado createEmpleado(int i) {
		Empleado e = new Empleado();
		e.setEdad(20 + i);
		e.setfInicio("2019");
		e.setNombre("Pepe" + i);
		e.setOficina("Oficina " +  i);
		e.setOrigen("Argentina");
		e.setSalario(20000 + i*1000);
		return e;
	}
	
}
