/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Moldura {
    //atributos
    private float baseex;
    private float alturaex;
    private float espessura;
    private float areaex;
    private float areain;
    private float areaTot;
    
    
    //constructor
    public Moldura(float bex, float altex, float esp){
        this.baseex = bex;
        this.alturaex = altex;
        this.espessura = esp;
    }
    
    //Metodos
    public float areamoldura(){
        areaex = baseex * alturaex;
        areain = (baseex - (2*espessura))*(alturaex - (2*espessura));
        areaTot = areaex - areain;
        return(areaTot);
    }
    
    
}
