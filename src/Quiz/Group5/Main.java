package Quiz.Group5;

public class Main {
    public static void main(String[] args){
        VerwaltungsGruppe gruppe1 = new VerwaltungsGruppe();
    //    System.out.println(gruppe1.teilnehmers);
        gruppe1.teilnehmers[0] = new Teilnehmer();
    //    System.out.println(gruppe1.anzahlTeilnehmer());
    //    System.out.println(gruppe1.teilnehmers.length);
        Teilnehmer teilnehmer1 =new Teilnehmer();
        teilnehmer1.setVorname("Adam");
        Teilnehmer teilnehmer2 =new Teilnehmer();
        teilnehmer2.setVorname("Ben");

        gruppe1.anmelden(teilnehmer1);
        gruppe1.anmelden(teilnehmer2);
        System.out.println("Teilnehmersanzahl: "+gruppe1.anzahlTeilnehmer());
 //       System.out.println(gruppe1.teilnehmers[1]);

        System.out.println("Erster Teilnehmer: "+ gruppe1.teilnehmers[0].getVorname());
        System.out.println("Zweiter Teilnehmer: "+gruppe1.teilnehmers[1].getVorname());
        System.out.println("Dritter Teilnehmer: "+gruppe1.teilnehmers[2].getVorname());
        gruppe1.getTeilnehmer(1);
//        System.out.println("Teilnehmersanzahl: "+gruppe1.anzahlTeilnehmer());
//        System.out.println(gruppe1.teilnehmers[0]);
        gruppe1.teilnehmers[2] = null;
        gruppe1.teilnehmers[1] = null;
        System.out.println(gruppe1.abmelden(teilnehmer1));
        System.out.println(gruppe1.abmelden(teilnehmer2));
        System.out.println("Teilnehmersanzahl: "+gruppe1.anzahlTeilnehmer());


    }

}
