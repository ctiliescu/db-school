package db.cursul7;

public class SyncObject {
    Integer a = 12;
    Integer b = 15;

    public void met1(){
        synchronized (a) {
            System.out.println("Start met1");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finish met1");
        }
    }

    public void met2(){
        synchronized (b){
            System.out.println("Start met2");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finish met2");
        }
    }

    public void met3(){
        System.out.println("Start met3");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finish met3");
    }
}
