package Project;

public class Test {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest_FD());
        System.out.println("ICICI Rate of Interest: "+i.getRateofInterest_FD());
        System.out.println("AXIS Rate of Interest: "+a.getRateofInterest_FD());
    }
}
