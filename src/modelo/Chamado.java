/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Neto
 */
public class Chamado {
    private Integer id;
    private String assunto;
    private boolean situacao;
    private Tecnico tecnico;
    private Cliente cliente;
    private ArrayList<Tramite> tramites = new ArrayList<>();

    public Chamado(String assunto, boolean situacao, Tecnico tecnico, Cliente cliente) {
        this.assunto = assunto;
        this.situacao = situacao;
        this.tecnico = tecnico;
        this.cliente = cliente;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Tramite> getTramites() {
        return tramites;
    }

    public void setTramites(ArrayList<Tramite> tramites) {
        this.tramites = tramites;
    }

    @Override
    public String toString() {
        return "Chamado{" + "id=" + id + ", assunto=" + assunto + ", situacao=" + situacao + ", tecnico=" + tecnico + ", cliente=" + cliente + ", tramites=" + tramites + '}';
    }           
    
}
