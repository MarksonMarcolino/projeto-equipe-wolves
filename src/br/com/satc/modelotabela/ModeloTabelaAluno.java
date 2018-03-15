/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.modelotabela;

import br.com.satc.objetos.Aluno;
import br.com.satc.objetos.Professor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vinic
 */
public class ModeloTabelaAluno extends AbstractTableModel {

    private List<Aluno> linhas;

    public List<Aluno> getLinhas() {
        return linhas;
    }

    public void setLinhas(List<Aluno> linhas) {
        this.linhas = linhas;
    }

    public ModeloTabelaAluno() {
        linhas = new ArrayList<Aluno>();
    }

    public ModeloTabelaAluno(List<Aluno> linhas) {
        this.linhas = linhas;
    }

    String[] colunas = new String[]{"Nome", "CPF", "RG", "Data Nascimento", "Data Matricula", "Disciplinas", "Matricula", "Idade"};

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
        Aluno professores = (Aluno) linhas.get(rowIndex);
        int cont = 0;
        switch (columnIndex) {
            case 0:
                return professores.getNome();
            case 1:
                return professores.getCpf();
            case 2:
                return professores.getRg();
            case 3:
                return professores.getDataNascimento();
            case 4:
                return professores.getDataMatricula();
            case 5:
                return professores.getDisciplinas();
            case 6:
                return professores.getMatricula();
            case 7:
                return professores.getIdade();
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
            case 4:
                return String.class;
            case 5:
                return String.class;
            case 6:
                return String.class;
            case 7:
                return String.class;
            default:
                throw new IndexOutOfBoundsException("");
        }

    }
}
