package com.example.fornecedor.controller;

import java.util.List;
import com.example.fornecedor.cadastro.CadastroRepository;
import com.example.fornecedor.cadastro.Fornecedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fornecedor")
public class FornecedorController {

    @Autowired
    private CadastroRepository repository;
    @GetMapping
    public  List<Fornecedor> getAll(){
        List<Fornecedor> fornecedorList = repository.findAll();
        return fornecedorList;

    }
}
