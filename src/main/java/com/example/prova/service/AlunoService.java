package com.example.prova.service;

import com.example.prova.model.Aluno;
import com.example.prova.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }

    public Aluno buscarPorId(Long id) {
        return alunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado com o id: " + id));
    }

    public Aluno salvar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Aluno atualizar(Long id, Aluno alunoAtualizado) {
        Aluno alunoExistente = buscarPorId(id);
        
        // Atualizando os campos
        alunoExistente.setNome(alunoAtualizado.getNome());
        alunoExistente.setEmail(alunoAtualizado.getEmail());
        alunoExistente.setDataNascimento(alunoAtualizado.getDataNascimento());  // Atualizando dataNascimento
        alunoExistente.setMatricula(alunoAtualizado.getMatricula());  // Atualizando matricula
        alunoExistente.setCursos(alunoAtualizado.getCursos());  // Atualizando cursos (se houver relação)

        return alunoRepository.save(alunoExistente);  // Salvando as alterações
    }

    public void deletar(Long id) {
        alunoRepository.deleteById(id);
    }
}
