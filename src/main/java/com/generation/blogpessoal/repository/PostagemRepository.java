package com.generation.blogpessoal.repository;

import com.generation.blogpessoal.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

    //SELECT * FROM tb_postagens WHERE titulo = "titulo";
    public Optional<Postagem> findByTitulo(String titulo);

    //SELECT * FROM tb_postagens WHERE titulo LIKE "%titulo%";
    public List<Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);

}
