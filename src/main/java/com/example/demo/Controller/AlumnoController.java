package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.AlumnoDao;
import com.example.demo.Entity.Alumno;


@RestController
public class AlumnoController {
	@Autowired
	private AlumnoDao alumnoDao;
	
	@GetMapping("/list")
	public List<Alumno> listar(){
		return alumnoDao.readAll();
	}
	@GetMapping("/list/{id}")
	public Alumno  listarId(@PathVariable Long id){
		return alumnoDao.readByid(id);
	}

}
