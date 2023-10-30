/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.argprog.Service;

import com.example.argprog.Interface.ISkillService;
import com.example.argprog.Models.Skills;
import com.example.argprog.Repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author salguero
 */
@Service
public class SkillService implements ISkillService{
    @Autowired SkillsRepository skilrepo;

    @Override
    public List<Skills> verSkills() {
        List<Skills>sk= skilrepo.findAll();
        return sk;
    }

    @Override
    public void crearSkill(Skills sk) {
        skilrepo.save(sk);
    }

    @Override
    public void borrarSkills(Long id) {
        skilrepo.deleteById(id);
    }

    @Override
    public Skills buscarSkill(Long id) {
        Skills sk = skilrepo.findById(id).orElse(null);
        return sk;
    }
}
