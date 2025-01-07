// Greenwich Mean Time to Indian Standard Time conversion : IST = GMT + 5:30:00
// in java, currentTimeMillis(); method from System class gives total milliseconds elapsed from 1970 1/1/1970 00:00:00 GMT
// that's called Unix epoch time, bcs 170 was the year, Unix OS was formally introduced.

public class ShowCurrentTime
{
    public static void main(String[] args)
    {
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;

        int currentSecond = (int) (totalSeconds % 60);
        int currentMinute = (int) (totalMinutes % 60);
        int currentHour = (int) (totalHours % 24);

        System.out.println("Current time is => " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");

        int currentHourIST = currentHour + 5;
        int currentMinuteIST = currentMinute + 30;

        if (currentMinuteIST >= 60)
        {
            currentMinuteIST -= 60;
            currentHourIST ++;
        }
        if (currentHourIST >= 24)
        {
            currentHourIST -= 24;
        }

        System.out.println("                => " + currentHourIST + ":" + currentMinuteIST + ":" + currentSecond + " IST");
    }
}
