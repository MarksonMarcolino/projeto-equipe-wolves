/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.modelotabela;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author SATC
 */
public class ModeloTabela extends AbstractTableModel {

    private List<ItemAgenda> linhas;

    public List<ItemAgenda> getLinhas() {
        return linhas;
    }

    public void setLinhas(List<ItemAgenda> linhas) {
        this.linhas = linhas;
    }

    public EstabelecimentoTable() {
        linhas = new ArrayList<ItemAgenda>();
    }

    public EstabelecimentoTable(List<ItemAgenda> linhas) {
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
        Estabelecimento agenda = (Estabelecimento) linhas.get(rowIndex);
        int cont = 0;
        switch (columnIndex) {
            case 0:
                return agenda.getNome();
            case 1:
                return agenda.getTelefone();
            case 2:
                return agenda.getEmail();
            case 3:
                return agenda.getHomePage();
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
            case 3:
                return String.class;
            default:
                throw new IndexOutOfBoundsException("");
        }

    }

}
