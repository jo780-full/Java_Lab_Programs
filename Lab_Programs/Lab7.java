public class Lab7 {
    public static void main(String args[]) {
        Solid s;
        Cylinder cy = new Cylinder();
        s = cy;
        s.input();
        s.SArea();
        s.Vol();
        Cone co = new Cone();
        s = co;
        s.input();
        s.SArea();
        s.Vol();
        Sphere sp = new Sphere();
        s = sp;
        s.input();
        s.SArea();
        s.Vol();

    }
}