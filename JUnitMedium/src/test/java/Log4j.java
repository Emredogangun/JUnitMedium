import org.apache.log4j.Logger;
import org.junit.Test;

public class Log4j {

    final static Logger Log = Logger.getLogger(Log4j.class);

    public static void startLog (String testClassName){
        Log.info("Test is Starting...");
    }


    public static void endLog (String testClassName){
        Log.info("Test is Ending...");
    }
    //Trace Level 
    public static void trace (String message) {
        Log.trace(message);
    }

    //Info Level 
    public static void info (String message) {
        Log.info(message);
    }

    //Warn Level 
    public static void warn (String message) {
        Log.warn(message);
    }

    //Error Level 
    public static void error (String message) {
        Log.error(message);
    }

    //Fatal Level 
    public static void fatal (String message) {
        Log.fatal(message);
    }

    //Debug Level 
    public static void debug (String message) {
        Log.debug(message);
    }
    @Test
    public void tTest() {
        trace("Bu bir TRACE mesaji");
        debug("Bu bir DEBUG mesaji");
        info("Bu bir INFO mesaji");
        warn("Bu bir WARN mesaji");
        error("Bu bir ERRROR mesajıi");
        fatal("Bu bir FATAL mesajİ");

    }
}
