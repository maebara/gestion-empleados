package com.sergio.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	@GetMapping("/{id}")
	public Empleado getEmployerById(@PathVariable long id) {
		Empleado employer = new Empleado();
		employer.setEdad((int)id);
		employer.setId(id);
		employer.setNombre("EMPLOYER - " + id);
		employer.setOficina("OFFICE - " + id);
		employer.setOrigen("COUNTRY - " + id);
		employer.setSalario((int)id * 100);
		employer.setfInicio("DATE - " + id);
		return employer;	
	}
	
	
	private Empleado createEmpleado(int i) {
		Empleado e = new Empleado();
		e.setId(i);
		e.setEdad(20 + i);
		e.setfInicio("2019");
		e.setNombre("Pepe" + i);
		e.setOficina("Oficina " +  i);
		e.setOrigen("Argentina");
		e.setSalario(20000 + i*1000);
		return e;
	}
	
}
