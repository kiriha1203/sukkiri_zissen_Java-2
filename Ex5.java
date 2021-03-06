import java.time.*;
import java.time.format.*;

public class Ex5 {
  public static void main(String[] args) {
    LocalDate d1 = LocalDate.of(2012,1,1);
    LocalDate d2 = LocalDate.of(2012,1,4);

    Period p1 = Period.ofDays(3);
    Period p2 = Period.between(d1, d2);

    LocalDate d3 = d2.plus(p2);
  }
}