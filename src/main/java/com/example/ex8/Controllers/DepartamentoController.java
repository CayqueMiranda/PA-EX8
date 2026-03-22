package com.example.ex8.Controllers;

import com.example.ex8.Models.DepartamentoModel;
import com.example.ex8.Services.DepartamentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {

    private DepartamentoService departamentoService;

    public DepartamentoController(DepartamentoService service) {
        this.departamentoService = service;
    }

    @PostMapping
    public DepartamentoModel criar(@RequestBody DepartamentoModel departamento) {
        return departamentoService.criar(departamento);
    }

    @GetMapping
    public List<DepartamentoModel> listar() {
        return departamentoService.listar();
    }

    @GetMapping("/{id}")
    public DepartamentoModel buscar(@PathVariable Long id) {
        return departamentoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        departamentoService.deletar(id);
    }

}
