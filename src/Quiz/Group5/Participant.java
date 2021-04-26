package Quiz.Group5;

public class Participant {
    private String surname;
    private String name;

    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Participant part) {
        Participant p =new Participant();
        if (part == null) // null check
        {
            return false;
        } else if (this == part) // self check
        {
            return true;
        }
        if (getClass() != part.getClass()) {
            return false;
        }
        //    if ((this.getVorname())!= (p.getVorname())) {
        //        return false;
        //    }
        //    if ((this.getName())!= (p.getName())) {
        //        return false;
        //    }
        else if (this.name.equals(p.surname)&& this.surname.equals(p.surname)) // type check
        {
            return false;
        }
        else {
            return false;
        }
    }
}
