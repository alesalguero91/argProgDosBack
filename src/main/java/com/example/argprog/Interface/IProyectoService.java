/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.argprog.Interface;

import com.example.argprog.Models.Proyectos;
import java.util.List;

/**
 *
 * @author salguero
 */
public interface IProyectoService {
    
    public List<Proyectos> verProyectos();
    public void crearProyectos(Proyectos proy);
    public void borrarProyectos(Long id);
    public Proyectos buscarProyectos(Long id);
}