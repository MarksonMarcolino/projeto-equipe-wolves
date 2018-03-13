/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.modelotabela;

import br.com.satc.objetos.Disciplina;
import br.com.satc.objetos.Professor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author SATC
 */
public class ModeloTabelaProfessores extends AbstractTableModel{
      private List<Professor> linhas;

    public List<Professor> getLinhas() {
        return linhas;
    }

    public void setLinhas(List<Professor> linhas) {
        this.linhas = linhas;
    }

    public ModeloTabelaProfessores() {
        linhas = new ArrayList<Professor>();
    }

    public ModeloTabelaProfessores(List<Professor> linhas) {
        this.linhas = linhas;
    }

    String[] colunas = new String[]{"Nome", "Rg", "Cpf","Carga Horaria","Data de nascimento","Disciplinas","Salario","Valor hora"};

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
        Professor professores = (Professor) linhas.get(rowIndex);
        int cont = 0;
        switch (columnIndex) {
            case 0:
                return professores.getNome();
            case 1:
                return professores.getRg();
            case 2:
                return professores.getCpf();
            case 3:
                return professores.getCargaHoraria();
            case 4:
                return professores.getDataNascimento();
            case 5:
                return professores.getDisciplinas();
            case 6:
                return professores.getSalario();
            case 7:
                return professores.getValorHora();
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
