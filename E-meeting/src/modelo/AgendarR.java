/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class AgendarR {
    private Date data;
    private Usuario usuario;
    private boolean publica;
    private String link;
    private String local;

    public AgendarR(String data, Usuario usuario, boolean publica, String link, String local) {
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(AgendarR.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.usuario = usuario;
        this.publica = publica;
        this.link = link;
        this.local = local;
    }

    public AgendarR() {
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean isPublica() {
        return publica;
    }

    public void setPublica(boolean publica) {
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

    @Override
    public String toString() {
        return "AgendarR{" + "data=" + data + ", usuario=" + usuario + ", publica=" + publica + ", link=" + link + ", local=" + local + '}';
    }
    
    
    
    
}
