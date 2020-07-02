package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long>{

}
