/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Neto
 */
public class Tecnico {
    private Integer id;
    private String nome;
    private String email;

    public Tecnico(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    
    public Integer getId(){
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Tecnicos{" + "nome=" + nome + '}';
    }        
    
}
