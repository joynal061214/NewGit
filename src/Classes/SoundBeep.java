
package Classes;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Toolkit;

class SoundBeep {
  
    public static void MakeBeepSound(long delay){
        
//  
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter a delay in seconds: ");
//        delay = scan.nextInt()*1000;

        final Timer timer = new Timer();

        final TimerTask task = new TimerTask() {
            @Override
            public void run() {
                try
                {
                    for (int i = 10; i >=0; i--)
                    {
                    Toolkit.getDefaultToolkit().beep();
                    Thread.sleep(2000);
                   timer.cancel();
                    timer.purge(); 
                    }
             
                }
                catch (InterruptedException ex)
                {
                    ex.printStackTrace();
                }
            }
        };
        timer.schedule(task, delay);
        
    }
public static void main(String[] args) {
       MakeBeepSound(2000);
    }
}