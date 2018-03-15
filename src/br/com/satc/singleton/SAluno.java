/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.singleton;

import br.com.satc.objetos.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iuril
 */
public class SAluno {
    
    private SAluno() {
    }
    private List<Aluno> alunos = new ArrayList();

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public static SAluno getInstance() {
        return SAlunoHolder.INSTANCE;
    }
    
    private static class SAlunoHolder {

        private static final SAluno INSTANCE = new SAluno();
    }
}
