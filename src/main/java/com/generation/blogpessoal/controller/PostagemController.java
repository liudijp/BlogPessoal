package com.generation.blogpessoal.controller;

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Classe é do tipo RestController, que receberá requisições
@RequestMapping("/postagens") //mapear as solicitações para os Métodos da Classe controladora PostagemController, ou seja, definir a URL (endereço) padrão do Recurso (/postagens). Ao digitar a url do servidor seguida da url do Recurso (http://localhost:8080/postagens), o Spring envia a requisição para a Classe responsável pelo Recurso associado à este endereço.
@CrossOrigin(origins = "*", allowedHeaders = "*") //permiti receber requisições feitas fora do domínio ao qual ela pertence
public class PostagemController {

    @Autowired //implementação utilizada pelo Spring Framework para aplicar a Inversão de Controle (IoC) quando for necessário. A Injeção de Dependência define quais Classes serão instanciadas e em quais lugares serão Injetadas quando houver necessidade.
    private PostagemRepository postagemRepository;

    @GetMapping //mapeia todas as Requisições HTTP GET, enviadas para um endereço específico, chamado endpoint, dentro do Recurso Postagem, para um Método específico que responderá a requisição, ou seja, ele indica que o Método getAll(), responderá a todas as requisições do tipo HTTP GET, enviadas no endereço http://localhost:8080/postagens/.
    public ResponseEntity<List<Postagem>> getall(){
        return ResponseEntity.ok(postagemRepository.findAll());
    }

}
