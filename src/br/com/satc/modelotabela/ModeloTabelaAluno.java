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
 * @author SATC
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
        Aluno alunos = (Aluno) linhas.get(rowIndex);
        int cont = 0;
        switch (columnIndex) {
            case 0:
                return alunos.getNome();
            case 1:
                return alunos.getRg();
            case 2:
                return alunos.getMatricula();
            case 3:
                return alunos.getIdade();
            case 4:
                return alunos.getDisciplinas();
            case 5: 
                return alunos.getDataNascimento();
            case 6:
                return alunos.getDataMatricula();
            case 7:
                return alunos.getCpf();         
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
