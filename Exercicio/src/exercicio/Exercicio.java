package exercicio;

import javax.swing.JOptionPane;

public class Exercicio {

    public static void main(String[] args) {
     //   System.out.print("Ola Mundo");
        //JOptionPane.showMessageDialog(null,"Ola mundo");
        //String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        //JOptionPane.showMessageDialog(null, "O nome digitado é " +nome); 
        
        /*String Idade = JOptionPane.showInputDialog("Informe sua idade");
        int resultado = Integer.parseInt(Idade);
        
        JOptionPane.showMessageDialog(null, "A idade é : " + Idade);
        
        
        if(resultado >= 18){
           JOptionPane.showMessageDialog(null,"E de maior");
        }else {
            JOptionPane.showMessageDialog(null, "E de menor");
        }*/
        Rota r = new Rota();
        r.planejarDia();    
         
    }
   
}
