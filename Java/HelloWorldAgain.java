package helloworldagain;
/*
Gary A. Newsome
 */

// public class HelloWorldAgain {
   // public static void main(String[] args) {
       // System.out.println("Hello H.A.L., do you read me?");
       // System.out.println("Hello Dave, you're looking well today.");
        
public class HelloWorldAgain {
    public static void main(String[] args) throws InterruptedException {
        String daveMessage = "Hello H.A.L., do you read me?";
        String halMessage = "Hello Dave, you're looking well today.";
        
        for(int i = 0; i < daveMessage.length(); i++){
            System.out.print(daveMessage.charAt(i));
            Thread.sleep(100);
        }
        Thread.sleep(400);
        System.out.println();
        for(int i = 0; i < halMessage.length(); i++){
            System.out.print(halMessage.charAt(i));
            Thread.sleep(100);
        }
        System.out.println();
    }    
}
