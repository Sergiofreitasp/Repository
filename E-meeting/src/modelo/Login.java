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
public class Login {

    public Login() {}
    
    ArrayList<String> todosLogin = new ArrayList<>();
    
    public void guardarLogin(String cpf, String senha, String funçao){
        todosLogin.add(cpf);
        todosLogin.add(senha);
        todosLogin.add(funçao);
    }
    //é muita gambiarra mds
    
    public void logar(String cpf, String senha){
        if (todosLogin.contains(cpf)== true){
            int pos = todosLogin.indexOf(cpf)+1;
            if (todosLogin.get(pos)== senha){
                //ok
            }else{
                System.out.println("Senha invalida!");
            }
        
        }else{
            System.out.println("Usuario Nao cadastrado!");
            }
    
    }
    
    public void descobrirFunçao(){
        
    }
    
}
