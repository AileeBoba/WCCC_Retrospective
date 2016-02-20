/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldalloveragain;

/**
 *
 * @author Gary
 */
public class Helloworldalloveragain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        String isThereMessage = "Is there anybody...";
        String outThereMessage = "out there?";
        
        for(int i = 0; i < isThereMessage.length(); i++){
            System.out.print(isThereMessage.charAt(i));
            Thread.sleep(100);
        }
        Thread.sleep(400);
        System.out.println();
        for(int i = 0; i < outThereMessage.length(); i++){
            System.out.print(outThereMessage.charAt(i));
            Thread.sleep(100);
        }
        System.out.println("NOPE");
        System.out.println();
    }    
    
}
