/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.singleton;

import br.com.satc.objetos.Professor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinic
 */ 
 
public class SProfessor {
    
    private SProfessor() {
    }

     private List <Professor> professores = new ArrayList();


    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public static SProfessor getInstance() {
        return SProfessorHolder.INSTANCE;
    }
    
    private static class SProfessorHolder {

        private static final SProfessor INSTANCE = new SProfessor();
    }
}
