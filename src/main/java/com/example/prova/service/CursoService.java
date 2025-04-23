package com.example.prova.service;

import com.example.prova.model.Curso;
import com.example.prova.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> listarTodos() {
        return cursoRepository.findAll();
    }

    public Curso buscarPorId(Long id) {
        return cursoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Curso não encontrado com id: " + id));
    }    

    public Curso salvar(Curso curso) {
        return cursoRepository.save(curso);
    }

    public void deletar(Long id) {
        cursoRepository.deleteById(id);
    }

    public Curso atualizar(Long id, Curso cursoAtualizado) {
        Curso cursoExistente = buscarPorId(id);

        cursoExistente.setNome(cursoAtualizado.getNome());
        cursoExistente.setDescricao(cursoAtualizado.getDescricao());
        cursoExistente.setCargaHoraria(cursoAtualizado.getCargaHoraria()); // NOVO
        cursoExistente.setNivel(cursoAtualizado.getNivel());               // NOVO

        return cursoRepository.save(cursoExistente);
    }
}
