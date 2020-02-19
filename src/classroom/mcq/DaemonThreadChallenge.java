package classroom.mcq;

public class DaemonThreadChallenge implements Runnable {
    public static void main(String[] args) {

        Thread thread = new Thread(new DaemonThreadChallenge());

        // ## REPLACE ##
//a
     //   thread.setDaemon(true);
       // thread.start();

        //option B
     // thread.setDaemon(false);
     // thread.start();

       // option C
        //thread.setDaemon(true);
       // thread.run();

       // option D
      /*  thread.setDaemon(true);
        thread.start();
        thread.start();
*/
    }



    @Override

    public void run() {

        for (; ; ) {

            System.out.println("for ever");

        }

    }

}