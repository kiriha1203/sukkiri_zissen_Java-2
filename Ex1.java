import java.util.Date;

public class Ex1 {
  public static void main(String[] args) {
    var now = new Date();
    System.out.println(now);
    System.out.println(now.getTime());
    var past = new Date(1316622225935L);
    System.out.println(past);
  }
  
}