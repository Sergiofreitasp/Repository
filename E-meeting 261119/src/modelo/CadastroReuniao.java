
package modelo;

import java.util.ArrayList;

public final class CadastroReuniao {
    private static final ArrayList<Reuniao> listaReuniao = new ArrayList<>();
    
    private CadastroReuniao(){
        
    }
    
    public static void addReuniao(Reuniao reuniao){
        listaReuniao.add(reuniao);
    }
}
