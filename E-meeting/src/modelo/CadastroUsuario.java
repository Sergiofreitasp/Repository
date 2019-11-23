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
public final class CadastroUsuario {

    private static ArrayList<Usuario> cadastros = new ArrayList<>();
    
    private CadastroUsuario() {
        
    }
    
    public static void cadastrarUsuario(Usuario usuario){
        cadastros.add(usuario);
    }
    
    public static void deletarUsuario(Usuario usuario){
        for (int i=0; i<cadastros.size(); i++) {
            if(cadastros.get(i).getCpf().equals(usuario.getCpf())){
                cadastros.remove(i);
            }
        }
    }

    public static void atualizarUsuario(Usuario usuario){
        for(Usuario u: cadastros){
            if(u.getCpf().equals(usuario.getCpf())){
                u = usuario;//cadastros.remove(u);
            }
        }
    }
    
    
    public static Usuario logarUsuario(Usuario usuario){
        
        for(Usuario u: cadastros){
            if (u.getCpf().equals(usuario.getCpf()) && u.getSenha().equals(usuario.getSenha())){
                
                return u;
            }
        }
        return null;
        //for (i=0: i>cadastros.size())
        
            
        }
    
    public static String verFunçao(Usuario usuario){
        
        for(Usuario u: cadastros){
            if (u.getCpf().equals(usuario.getCpf()) && u.getSenha().equals(usuario.getSenha())){
                usuario = u;
                return usuario.getFunçao();
            }
        }
        return "nada";
        
        
            
        }
    
   
    }




