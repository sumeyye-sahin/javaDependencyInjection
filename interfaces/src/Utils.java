public class Utils { //utils: araç demek

    public static void runLoggers(Logger[] loggers, String message){
        for(Logger log : loggers){
            log.log(message);
        }
    }
}
