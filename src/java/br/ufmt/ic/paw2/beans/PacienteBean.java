/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.paw2.beans;

import br.ufmt.ic.paw2.entities.Paciente;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author DavidFrancisco
 */
@ManagedBean
@RequestScoped
public class PacienteBean {
    private Paciente pacienteSelecionado;
    private List<Paciente> listaPaciente;

    /**
     * Creates a new instance of PacienteBean
     */
    public PacienteBean() {
        pacienteSelecionado = new Paciente();
    }

    public Paciente getPacienteSelecionado() {
        return pacienteSelecionado;
    }
    public String selecionarPaciente(Paciente paciente){
        this.pacienteSelecionado = paciente;
        return "editaPaciente";
    }

    public void setPacienteSelecionado(Paciente pacienteSelecionado) {
        this.pacienteSelecionado = pacienteSelecionado;
    }

    public List<Paciente> getListaPaciente() {
        return listaPaciente;
    }

    public void setListaPaciente(List<Paciente> listaPaciente) {
        this.listaPaciente = listaPaciente;
    }
    
}