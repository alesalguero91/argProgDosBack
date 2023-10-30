/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.argprog.Service;

import com.example.argprog.Interface.IIdiomaService;
import com.example.argprog.Models.Idiomas;
import com.example.argprog.Repository.IdiomaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author salguero
 */
@Service
public class IdiomaService implements IIdiomaService{
    @Autowired IdiomaRepository idiomRepo;

    @Override
    public List<Idiomas> verIdiomas() {
        List<Idiomas>lg = idiomRepo.findAll();
        return lg;
    }

    @Override
    public void crearIdiomas(Idiomas lang) {
        idiomRepo.save(lang);
    }

    @Override
    public void borrarIdiomas(Long id) {
        idiomRepo.deleteById(id);
    }

    @Override
    public Idiomas buscarIdiomas(Long id) {
        Idiomas lg = idiomRepo.findById(id).orElse(null);
        return lg;
    }
    
    
}
