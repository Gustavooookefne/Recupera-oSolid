package org.example.Model;

import java.util.List;

public class OrdemServico {
    private int id;
    private String equipamento;
    private String defeitoRelatado;
    private String status;
    private String materiaisUsados;
    private String conclusaoTecnica;
    private Professor professorResponsavel;
    private List<Aluno> alunosEscalados;

    public OrdemServico(int id, String equipamento, String defeitoRelatado, String status, String materiaisUsados, String conclusaoTecnica, Professor professorResponsavel, List<Aluno> alunosEscalados) {
        this.id = id;
        this.equipamento = equipamento;
        this.defeitoRelatado = defeitoRelatado;
        this.status = status;
        this.materiaisUsados = materiaisUsados;
        this.conclusaoTecnica = conclusaoTecnica;
        this.professorResponsavel = professorResponsavel;
        this.alunosEscalados = alunosEscalados;
    }

    public OrdemServico(int id, String equipamento, String defeitoRelatado) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getDefeitoRelatado() {
        return defeitoRelatado;
    }

    public void setDefeitoRelatado(String defeitoRelatado) {
        this.defeitoRelatado = defeitoRelatado;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMateriaisUsados() {
        return materiaisUsados;
    }

    public void setMateriaisUsados(String materiaisUsados) {
        this.materiaisUsados = materiaisUsados;
    }

    public String getConclusaoTecnica() {
        return conclusaoTecnica;
    }

    public void setConclusaoTecnica(String conclusaoTecnica) {
        this.conclusaoTecnica = conclusaoTecnica;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public List<Aluno> getAlunosEscalados() {
        return alunosEscalados;
    }

    public void setAlunosEscalados(List<Aluno> alunosEscalados) {
        this.alunosEscalados = alunosEscalados;
    }
}
