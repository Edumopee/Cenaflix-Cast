

package com.mycompany.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 *essa classe conteu o atributo e irão mapear a tabela cadastro no bd
 * assim como seu getter e setters
 * @author Eduardo
 */

@Entity
@Table(name = "cadastro")
public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String produtor;

    // Use @Column para mapear o nome da coluna do banco de dados
    @Column(name = "nomeEpisodio")
    private String nomeEpisodio;

    @Column(name = "numeroEpisodio")
    private int numeroEpisodio;

    private String duracao;

    // Use @Column para mapear a coluna 'url'
    @Column(name = "url")
    private String urlRepositorio;

    // Construtores, getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getNomeEpisodio() {
        return nomeEpisodio;
    }

    public void setNomeEpisodio(String nomeEpisodio) {
        this.nomeEpisodio = nomeEpisodio;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getUrl() {
        return urlRepositorio;
    }

    public void setUrl(String urlRepositorio) {
        this.urlRepositorio = urlRepositorio;
    }

   

   
  
}
