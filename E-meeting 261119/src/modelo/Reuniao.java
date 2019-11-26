/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.util.ArrayList;



public class Reuniao {
    private String id;
    private String nome;
    private String data;
    private String pauta;
    private String publica;
    private String link;
    private String local;
    private String ata;
    
    private ArrayList convidados;
    private ArrayList confirmados;

    public Reuniao(String id, String nome, String data, String pauta, String publica, String link, String local, String ata, ArrayList convidados, ArrayList confirmados) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.pauta = pauta;
        this.publica = publica;
        this.link = link;
        this.local = local;
        this.ata = ata;
        this.convidados = convidados;
        this.confirmados = confirmados;
    }

    public Reuniao() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPauta() {
        return pauta;
    }

    public void setPauta(String pauta) {
        this.pauta = pauta;
    }

    public String getPublica() {
        return publica;
    }

    public void setPublica(String publica) {
        this.publica = publica;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getAta() {
        return ata;
    }

    public void setAta(String ata) {
        this.ata = ata;
    }

    public ArrayList getConvidados() {
        return convidados;
    }

    public void setConvidados(ArrayList convidados) {
        this.convidados = convidados;
    }

    public ArrayList getConfirmados() {
        return confirmados;
    }

    public void setConfirmados(ArrayList confirmados) {
        this.confirmados = confirmados;
    }

    @Override
    public String toString() {
        return "Reuniao{" + "id=" + id + ", nome=" + nome + ", data=" + data + ", pauta=" + pauta + ", publica=" + publica + ", link=" + link + ", local=" + local + ", ata=" + ata + ", convidados=" + convidados + ", confirmados=" + confirmados + '}';
    }

    
    
    
    
    
    

    
    
    
    
    
    
}
