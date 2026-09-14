package com.academicrace.api.controller;

import com.academicrace.api.model.Mensagem;
import com.academicrace.api.service.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mensagens")
public class MensagemController {

    @Autowired
    private MensagemService mensagemService;

    @GetMapping("/grupo/{grupoId}")
    public List<Mensagem> listarPorGrupo(@PathVariable Long grupoId) {
        return mensagemService.listarPorGrupo(grupoId);
    }

    @PostMapping
    public Mensagem salvar(@RequestBody Mensagem mensagem) {
        return mensagemService.salvar(mensagem);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        mensagemService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}