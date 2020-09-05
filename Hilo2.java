/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcypejercicio1;

/**
 *
 * @author Gerardo Miguel Quechol Zarate
 * 
 */

import javax.swing.*;
public class Hilo2 extends Thread{
    private JTextArea area;
    
    public Hilo2 (JTextArea area){
        this.area=area;
    }
    public void run(){
        int i=0;
        while(true){
            area.append(i+"\n");
            i++;
        }
    }
}
