
package exercicio;

import javax.swing.JOptionPane;

public class Rota {   
    public static void planejarDia() {    
        // Variaveis usadas como identificação : Quantidade_Rotas, Km_Onibus, Valor_Total, Valor_Litro
        // TIPO DE DADOS PRIMITIVO USADO: double
        
        
      double Quantidade_Rotas = Double.parseDouble(JOptionPane.showInputDialog(null, "São quantas rotas do dia? ", "ROTAS DIARIA", 3));
      double Km_Onibus=0, Valor_Total=0, Valor_Litro=0;
     
      //laço de repetição:  contar quantas rotas foram feitas
        for(int i = 1; i <= Quantidade_Rotas; i++ )
        {
            //Conversão de dados e apresentação na tela
            double Km = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantos KM a "+ (i)+" rota faz? " , "KM", 3));
           
            // o valor 2.5 para identificar a media do consumo do combustivel 2.5
            double Litros = Km/2.5;

            Km_Onibus += Km;
            Valor_Litro += Litros;

        }

     double Valor_Oleo_Diesel = Double.parseDouble(JOptionPane.showInputDialog(null,"Valor do Litro R$: "));
     // o valor_total recebendo o calculo
     Valor_Total =  Valor_Litro * Valor_Oleo_Diesel;
     
       //apresentação na tela o resultado
     JOptionPane.showMessageDialog(null, " O Total de Km percorrido foi :  (" + Km_Onibus + ") \n Litros de combustível necessários : (" + Valor_Litro + ") \n Valor desembolsado pela empresa: R$ (" + Valor_Total+")", "RESULTADO", 1);
        
    }
}
