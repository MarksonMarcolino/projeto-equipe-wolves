/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objetos;

/**
 *
 * @author Vinicius Milanez
 */
public class Disciplina {
    private String  nome,departamento;
    private char status;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Disciplina(String nome, String departamento, char status) {
        this.nome = nome;
        this.departamento = departamento;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nome=" + nome + ", departamento=" + departamento + ", status=" + status + '}';
    }
    
    
    
}
