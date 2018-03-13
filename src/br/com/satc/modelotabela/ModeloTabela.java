/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.modelotabela;

import br.com.satc.objetos.Disciplina;
import br.com.satc.singleton.SDisciplina;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author SATC
 */
public class ModeloTabela extends AbstractTableModel {
    /* Tem que renomear certinho aqui Iur */

    private List<Disciplina> linhas;

    public List<Disciplina> getLinhas() {
        return linhas;
    }

    public void setLinhas(List<Disciplina> linhas) {
        this.linhas = linhas;
    }

    public ModeloTabela() {
        linhas = new ArrayList<Disciplina>();
    }

    public ModeloTabela(List<Disciplina> linhas) {
        this.linhas = linhas;
    }

    String[] colunas = new String[]{"Nome", "Departamento", "Status"};

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Disciplina agenda = (Disciplina) linhas.get(rowIndex);
        int cont = 0;
        switch (columnIndex) {
            case 0:
                return agenda.getNome();
            case 1:
                return agenda.getDepartamento();
            case 2:
                return agenda.getStatus();
            default:
                throw new IndexOutOfBoundsException("");
        }

    }

    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            default:
                throw new IndexOutOfBoundsException("");
        }

    }

}
