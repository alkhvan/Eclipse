package Quiz.TeamWork;
public class Main {

    public static void main(String[] args) {
        Zahl zah1 = new Zahl();
        zah1.setNew_zahl('a');
        Zahl zah2 = new Zahl();
        zah2.setNew_zahl('a');
        if (zah1.equals(zah2)){
            System.out.println("Zeichen sind gleich");
        }
        else {
            System.out.println("Zeichen sind UNgleich" + zah1.getNew_zahl() + " "+ zah2.getNew_zahl());
        }
        System.out.println("Is c1`s hashCode is equal to c2`s hashCode? - "+ (zah1.hashCode() == zah2.hashCode()));
        System.out.println("hashCode zah1 - " + zah1.hashCode());
        System.out.println("hashCode zah2 - " + zah2.hashCode());
    }
    public int hashCode() {
        int hc = 17;
        int hashMultiplier = 59;
        hc = hc * hashMultiplier;
        return hc;
    }

}
