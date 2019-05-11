public class TimerTest {
    public static void main(String[] args) {
        Timer timer = new Timer();

        timer.step(); //0:0:1
        System.out.println(timer.getTime());

        timer.step(); //0:0:2
        System.out.println(timer.getTime());

        timer.step(); //0:0:3
        System.out.println(timer.getTime());

        timer.addSeconds(12); //0:0:15
        System.out.println(timer.getTime());

        timer.addMinutes(3); //0:3:15
        System.out.println(timer.getTime());

        String time = timer.getTime();
        System.out.println("Zmierzony czas: " + time); //Zmierzony czas 0h:3m:15s
    }
}
