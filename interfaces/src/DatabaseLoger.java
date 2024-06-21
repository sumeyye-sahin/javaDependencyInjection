public class DatabaseLoger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Database loglandı: "+message);
    }
}
