package br.com.ricardootavio.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ricardootavio.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
