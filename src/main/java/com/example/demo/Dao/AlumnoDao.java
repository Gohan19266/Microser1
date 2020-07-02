package com.example.demo.Dao;

import java.util.List;

import com.example.demo.Entity.Alumno;


public interface AlumnoDao {
	public List<Alumno> readAll();
	public Alumno readByid(Long id);
}
