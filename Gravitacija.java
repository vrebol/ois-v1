public class Gravitacija{
    public static void main(String[] args){
        System.out.println("OIS je zakon!");
        
        double a = gravit(1);
        System.out.println(a);
        // Samo hiti not Scanner Sarah :)
    }
    
    private static double gravit(int vis){
        double C = 6.674*Math.pow(10,-11);
        double r = 6.371*Math.pow(10,6); 
        double M = 5.972*Math.pow(10,24);
        double a;
        a = (C*M) / ((r+vis)*(r+vis));
        return a;
    }



}