package logged;
import java.io.IOException;
import java.sql.SQLException;
import org.apache.log4j.Logger;

public class Main {
  /* Get actual class name to be printed on */
  static Logger log = Logger.getLogger(Main.class.getName());
  
  public static void main(String[] args)
                throws IOException,SQLException{
   
     log.debug("Hello this is an debug message");
     log.info("Hello this is an info message");
  }
}