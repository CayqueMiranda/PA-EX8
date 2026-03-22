package com.example.ex8.Repositories;

import com.example.ex8.Models.DepartamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository <DepartamentoModel, Long> {
}
