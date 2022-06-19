package com.gabrielssobrinho.CadastroDeEstudantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrielssobrinho.CadastroDeEstudantes.domain.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}