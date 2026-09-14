package com.academicrace.api.service;

import com.academicrace.api.model.Mensagem;
import com.academicrace.api.repository.MensagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensagemService {

    @Autowired
    private MensagemRepository mensagemRepository;

    public List<Mensagem> listarPorGrupo(Long grupoId) {
        return mensagemRepository.findByGrupoId(grupoId);
    }

    public Mensagem salvar(Mensagem mensagem) {
        return mensagemRepository.save(mensagem);
    }

    public void deletar(Long id) {
        mensagemRepository.deleteById(id);
    }
}