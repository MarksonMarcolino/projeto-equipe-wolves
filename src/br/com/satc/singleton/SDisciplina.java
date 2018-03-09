/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.singleton;

import br.com.satc.objetos.Disciplina;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinic
 */
public class SDisciplina {
    
    private SDisciplina() {
    }
    
    private List<Disciplina>  disciplinas = new ArrayList();

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    public static SDisciplina getInstance() {
        return SDisciplinaHolder.INSTANCE;
    }
    
    private static class SDisciplinaHolder {

        private static final SDisciplina INSTANCE = new SDisciplina();
    }
}
