package Quiz.Group5;

public class VerwaltungsGruppe{
    Teilnehmer[] teilnehmers = new Teilnehmer[3];

    public boolean anmelden(Teilnehmer einTeilnehmer) {
     if (anzahlTeilnehmer()>teilnehmers.length ){
          return false;
      }
      teilnehmers [anzahlTeilnehmer()] = einTeilnehmer;
               return true;
    }

    public int anzahlTeilnehmer(){
        int i =0;

       while (teilnehmers[i]!=null && i<teilnehmers.length-1) {  //oder <= hier?
           i++;
       }
      return i;
    }
    public Teilnehmer getTeilnehmer (int i){
        System.out.println(teilnehmers[i-1]);
        return teilnehmers[i-1];
    }
    public boolean abmelden (Teilnehmer einTeilnehmer){
        int k =2;
        while (teilnehmers[k]!=null && k<teilnehmers.length-1) {
            k++;
            teilnehmers[k] = null;
        }
        return true;

//        int k=2;
//        for (int k = 2; k < teilnehmers.length-1; k++) {
//            teilnehmers[k-1] = teilnehmers[i];
//            teilnehmers[k] = null;
//        }
//        return false;

    }
}
