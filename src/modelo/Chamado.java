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
public class Chamado implements Comparable<Chamado>{
    private int id;
    private String assunto;
    private boolean situacao;
    private int id_tecnico;
    private int id_cliente;
    private String descricao;
    private ArrayList<Tramite> tramites = new ArrayList<>();

    public Chamado(String assunto, boolean situacao, int id_tecnico, int id_cliente) {
        this.assunto = assunto;
        this.situacao = situacao;
        this.id_tecnico = id_tecnico;
        this.id_cliente = id_cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public int getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(int id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public ArrayList<Tramite> getTramites() {
        return tramites;
    }

    public void setTramites(Tramite tramite) {
        this.tramites.add(tramite);
    }    

    @Override
    public String toString() {
        return "Chamado{" + "id=" + id + ", assunto=" + assunto + ", situacao=" + situacao + ", tramites=" + tramites + '}';
    }           

    @Override
    public int compareTo(Chamado o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
