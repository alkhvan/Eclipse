package Quiz.TeamWork;

public class Zahl {
    private char new_zahl;
    public void setNew_zahl (char new_zahl) {this.new_zahl = new_zahl;}
    public char getNew_zahl () {return this.new_zahl;}

    boolean equals (Zahl z){
        if(this.getNew_zahl()==z.getNew_zahl()){

            return true;
        } else {

            return false;
        }
    }
}
