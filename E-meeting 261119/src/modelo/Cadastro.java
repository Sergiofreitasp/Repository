/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Cadastro {

    public Cadastro() {}
    
    
    ArrayList<Usuario> cadastro = new ArrayList<>();
    
    public void cadastrarUsuario(Usuario usuario){
        cadastro.add(usuario);
        
        
    }
}
