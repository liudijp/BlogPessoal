package com.generation.blogpessoal.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

//Criação de Tabela do DataBase
@Entity
@Table(name = "tb_postagem") //Definição do nome da Tabela
public class Postagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AutoIncrement
    private Long id;

    @NotBlank   //Campo Obrigatoriamente preenchido
    @Size(min = 5, max = 100, message = "O Titulo deve ter no minimo 5 e maximo 100 Char")
    private String titulo;

    @NotBlank
    @Size(min = 10, max = 1000, message = "O texto deve ter no mínimo 10 e maximo 1000 Char")
    private String texto;

    @UpdateTimestamp    //Atulização em tempo real do registro
    private LocalDate data;

    //Getter e Setter para acesso e escrita de infomações

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
