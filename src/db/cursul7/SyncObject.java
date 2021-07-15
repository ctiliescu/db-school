package db.cursul7;

public class SyncObject {
    Integer a = 12;
    Integer b = 15;

    public void met1(){
        synchronized (a) {
            processing("met1");
        }
    }

    public void met2(){
        synchronized (b){
            processing("met2");
        }
    }

    public void met3(){
        processing("met3");
    }

    public void met4(){
        synchronized (a) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (b) {
                processing("met4");
            }
        }
    }

    public void met5(){
        synchronized (b) {
            synchronized (a) {
                processing("met5");
            }
        }
    }

    private void processing(String met2) {
        System.out.println("Start" + met2);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finish" + met2);
    }
}
