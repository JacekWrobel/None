public class Timer {
    int time;
    int addSeconds(int sec) {
        return time = time + sec;
    } //– która dodaje do aktualnie odmierzonego czasu wskazaną liczbę sekund,

    int addMinutes(int minutes) {
        return time = time + (minutes * 60);
    }//– która dodaje do aktualnie odmierzonego czasu wskazaną liczbę minut,

    int addHours(int hours) {
        return time = time + (hours * 60 * 60);
    }// – która dodaje do aktualnie odmierzonego czasu wskazaną liczbę godzin,

    int step() {
        return time = time + 1;
    }// – która dodaje do aktualnie odmierzonego czasu jedną sekundę.

    String getTime(){
        return (int) time/3600 +":" + (int) ((time % 3600 - time%60)/60) +":" + (int) time % 60;

    }// która zwraca czas w formacie HH:mm:ss, gdzie HH to godziny, mm to minuty, a ss to sekundy,

    long getSeconds() {
        return time;
    }// – która zwracałączną liczb sekund, którą zmierzyłdany stoper
}

