package br.com.satc.objetos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Professor extends Pessoa {

    private int cargaHoraria;
    private float valorHora;
    private float salario;

    List<Disciplina> disciplinas = new ArrayList();

    public Professor(String nome, String rg, String cpf, Date dataNascimento) {
        super(nome, rg, cpf, dataNascimento);
    }

    public Professor(int cargaHoraria, float valorHora, String nome, String rg, String cpf, Date dataNascimento) {
        super(nome, rg, cpf, dataNascimento);
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
        salario= calcularSalario();
    }
    
    
    
    public float calcularSalario() {

        salario = valorHora * cargaHoraria;

        return salario;

    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Professor{" + "cargaHoraria=" + cargaHoraria + ", valorHora=" + valorHora + ", salario=" + salario + ", disciplinas=" + disciplinas + '}';
    }

    
}
