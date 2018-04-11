/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligamx;

import javax.swing.JProgressBar;

/**
 *
 * @author Aide Piez
 */
public class barra extends Thread{
    JProgressBar progreso;
    public barra(JProgressBar progreso){
        super();
        this.progreso=progreso;
    }
    @Override
    public void run(){
         for(int i=1;i<=100;i++){
             progreso.setValue(i);
             pausa(20);
        }
    }
    public void pausa(int tiempo){
        try{
            Thread.sleep(tiempo);
        }   
        catch(Exception e){
        
        }
    }
    
}
