/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Reuniao {
    private Date data;
    private ArrayList participantes;
    private boolean publica;
    private String link;
    private String local;
    private String ata;

    public Reuniao(String data, ArrayList participantes, boolean publica, String link, String local, String ata) {
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Reuniao.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.participantes = participantes;
        this.publica = publica;
        this.link = link;
        this.local = local;
        this.ata = ata;
    }

    public Reuniao() {
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ArrayList getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList participantes) {
        this.participantes = participantes;
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
        return "Reuniao{" + "data=" + data + ", participantes=" + participantes + ", publica=" + publica + ", link=" + link + ", local=" + local + '}';
    }
    
    
    
    
    
}
