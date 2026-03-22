package com.example.ex8.Services;

import com.example.ex8.Models.DepartamentoModel;
import com.example.ex8.Repositories.DepartamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService {

    private DepartamentoRepository departamentoRepository;

    public DepartamentoService(DepartamentoRepository repository) {
        this.departamentoRepository = repository;
    }

    public DepartamentoModel criar(DepartamentoModel departamento) {
        return departamentoRepository.save(departamento);
    }

    public List<DepartamentoModel> listar() {
        return departamentoRepository.findAll();
    }

    public DepartamentoModel buscarPorId(Long id) {
        return departamentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Departamento não encontrado"));
    }

    public void deletar(Long id) {
        departamentoRepository.deleteById(id);
    }

}
