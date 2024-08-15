public class Principal {
    public static void main(String[] args)  {
        try {
            Classe2 c2 = new Classe2(1);
            c2.m1(5);
            c2.exibe();
            Classe2 c1 = new Classe2();
            c1.exibe();
            Classe1 c3 = new Classe2();
            c3.exibe();
            System.out.println(c1.pts);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

// Classe1
public class Classe1 {
    protected int prim=0;
    private int pts=0;

    public Classe1(int n) {
        if(n == 2) {pts += 50; }
        else { pts += 30; } 
    }
    public Classe1() {
        if(prim == 1) {pts += 100; }
        else { pts += 200; }
    }    
    public void exibe() throws Exception
    { 
        if(prim == 2) {System.out.println("ERRO"); }
        System.out.println(pts+20);
    }
    protected int getPts() { return pts; }
    protected void setPts(int pts) { this.pts = pts;}
}    
}