
package visao;
import javax.swing.JOptionPane;
import modelo.Moldura;
public class MolduraV {
    public static void main(String[] args){
        float baseex, alturaex, espessura;
        String baseexS, alturaexS, espessuraS;
        
        baseexS = JOptionPane.showInputDialog("Digite a base externa da moldura: ");
        alturaexS = JOptionPane.showInputDialog("Digite a altura externa: ");
        espessuraS = JOptionPane.showInputDialog("Digite a espessura: ");
        
        baseex = Float.parseFloat(baseexS);
        alturaex = Float.parseFloat(alturaexS);
        espessura = Float.parseFloat(espessuraS);
        
        Moldura mold1 = new Moldura(baseex, alturaex, espessura);
        //mold1.areamoldura();
        //mold1 = areamoldura(baseex, alturaex, espessura);
        JOptionPane.showMessageDialog(null,"A area da moldura é: "+ mold1.areamoldura());
        
        
                
                
                
                
                
    }
}
