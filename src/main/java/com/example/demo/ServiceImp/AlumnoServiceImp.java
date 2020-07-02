package com.example.demo.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Dao.AlumnoDao;
import com.example.demo.Entity.Alumno;
import com.example.demo.Repository.AlumnoRepository;


@Service
public class AlumnoServiceImp implements AlumnoDao{
	@Autowired
	private AlumnoRepository alumnRepository;

	@Override
	@Transactional(readOnly=true)
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return alumnRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Alumno readByid(Long id) {
		// TODO Auto-generated method stub
		return alumnRepository.findById(id).orElse(null);
	}
}
