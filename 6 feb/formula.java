public class formula {
    public static void main(String[] args) {
        double m=12.4;
        double v=10;
        double h=100;
        double g=9.8;
        double KE=0.5*m*v*v;
        double PE=m*g*h;
        double ME =KE + PE;
        System.out.println("Total Energy (ME)=" + ME + " Joules");

    }
    
}
