package Head_first;

import java.util.Calendar;
import static java.lang.System.out;

public class PelniaKsiezyca {

    static int DAY_IM =1000*60*60*24; // długość dnia w milisekundach

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2019,0,17,12,15);
        long day1 = c.getTimeInMillis();

        for (int x = 0; x<10; x++){
            day1 += (DAY_IM * 29.52);
            c.setTimeInMillis(day1);

            out.println(String.format("Pełnia wypada %tc", c));
        }
    }
}
