package Quiz.Group5;

public class Main {
    public static void main(String[] args){
        MyList interface1 = (MyList) new ParticipantGroup();

        ParticipantGroup interface2 =new ParticipantGroup();
        Participant participants1=new Participant();
        participants1.setName("Anna");
        Participant participants2=new Participant();
        participants2.setName("Maria");
        Participant participants3=new Participant();
        participants3.setName("Sussi");
       interface1.add(participants1);
        interface1.add(participants2);
        interface1.add(participants3);
        interface2.add(participants1);
        System.out.println("Teilnehmersanzahl: "+interface1.size());


        Animals animal = new Animals();
        animal.setSpecies("Cat");
        interface1.add(animal);
        System.out.println(interface1.get(0));
        System.out.println("Teilnehmersanzahl: "+interface1.size());

        interface1.remove(participants1);
        System.out.println("Teilnehmersanzahl after deletion: "+interface1.size());
        interface1.clear();

        participants1.setName("Alex");
        interface1.add(participants1);
        System.out.println("Teilnehmersanzahl: "+interface1.size());

//        VerwaltungsGruppe gruppe1 = new VerwaltungsGruppe();
//
//        gruppe1.teilnehmers[0] = new Teilnehmer();
//
//        Teilnehmer teilnehmer1 =new Teilnehmer();
//        teilnehmer1.setVorname("Adam");
//        Teilnehmer teilnehmer2 =new Teilnehmer();
//        teilnehmer2.setVorname("Ben");
//
//        gruppe1.anmelden(teilnehmer1);
//        gruppe1.anmelden(teilnehmer2);
//        System.out.println("Teilnehmersanzahl: "+gruppe1.anzahlTeilnehmer());
//
//        System.out.println("Erster Teilnehmer: "+ gruppe1.teilnehmers[0].getVorname());
//        System.out.println("Zweiter Teilnehmer: "+gruppe1.teilnehmers[1].getVorname());
//        System.out.println("Dritter Teilnehmer: "+gruppe1.teilnehmers[2].getVorname());
//        gruppe1.getTeilnehmer(1);
//
//        gruppe1.teilnehmers[2] = null;
//        gruppe1.teilnehmers[1] = null;
//        System.out.println(gruppe1.abmelden(teilnehmer1));
//        System.out.println(gruppe1.abmelden(teilnehmer2));
//        System.out.println("Teilnehmersanzahl: "+gruppe1.anzahlTeilnehmer());


    }

}
