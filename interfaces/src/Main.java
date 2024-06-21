//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //CustomerManager customerManager=new CustomerManager(new EmailLogger());

        Logger[] loggers = {new EmailLogger(),new SmsLogger(),new FileLogger()};

        CustomerManager customerManager1 = new CustomerManager(loggers);

        Customer sumeyye = new Customer();
        sumeyye.setFirstName("Sümeyye");

       // customerManager.add(sumeyye);
        customerManager1.add(sumeyye);

    }
}