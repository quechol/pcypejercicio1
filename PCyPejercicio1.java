/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcypejercicio1;

/**
 *
 * @author Gerardo Miguel Quechol Zarate
 */
public class PCyPejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                int i=0;
                while(i<50){
                    System.out.println("Hola");
                    i++;
                }
            }
        });
        
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                int i=0;
                while(i<50){
                    System.out.println("Mundo");
                    i++;
                }
            }
        });
        
        Thread t3 = new Thread(new Runnable(){
            public void run(){
                    System.out.println("Aqui estoy");                
            }
        });
        
        t1.start();
        t2.start();
        t3.start();
    }
    
}
