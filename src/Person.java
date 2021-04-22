public class Person extends Object {

    public String name;
    public String vorname;
    public int age;
    public void setName (String name) {this.name = name;}
    public String getName () {return this.name;}
    public void setVorname (String vorname) {this.vorname = vorname;}
    public String getVorname () {return this.vorname;}
    public void setAge (int age) {this.age = age;}
    public int getAge () {return this.age;}

    public int hashCode() {
        int nameLaenge = name == null ? 0 : name.hashCode();
        nameLaenge = nameLaenge * nameLaenge + age;
        return nameLaenge;
    }

    public static void main(String[] args) {

        Person empty = new Person();
        empty =null;
        Person person1 = new Person();
        person1.setVorname ("Albert");
        person1.setName ("Brown");
        person1.setAge(2);
        Person person2 = new Person();
        person2.setVorname ("Mike");
        person2.setAge(3);
        person2.setName ("Jagger");
        Person person3 = new Person();
        person3.setVorname ("Albert");
        person3.setName ("Brown");
        person3.setAge(2);
        person1=person3;
        if (person1==person2){
            System.out.println("person1 and person2 are equal");
        } else
        {System.out.println("person1 and person2 are NOT equal");}
        if (person1==person3){
            System.out.println("person1 and person3 are equal");
        } else
        {System.out.println("person1 and person3 are NOT equal");}

        if (person2==person3){
            System.out.println("person2 and person3 are equal");
        } else
        {System.out.println("person2 and person3 are NOT equal");}

        person1.getName();
        person1.getVorname();
        person2.getVorname();
        person2.getName();
        person1.equals(person2);
        person1.equals(empty);
        person2.equals(empty);
        person1.equals(person3);
        person2.equals(person3);
        person3.equals(empty);
        System.out.println("Is person1 is equal to person2? - "+ (person1 == person2));
        System.out.println("Is person1 hashCode is equal to person2 hashCode? - "+ (person1.hashCode() == person2.hashCode()));
        System.out.println("hashCode person1 - " + person1.hashCode());
        System.out.println("hashCode person2 - " + person2.hashCode());
        System.out.println(person1.name +" "+person1.vorname);
        System.out.println(person2.name +" "+person2.vorname);

    }



    public boolean equals(Person p) {
        if (p == null) // null check
        {
            return false;
        } else if (this == p) // self check
        {
            return true;
        }
        if (getClass() != p.getClass()) {
            return false;
        }
        //    if ((this.getVorname())!= (p.getVorname())) {
        //        return false;
        //    }
        //    if ((this.getName())!= (p.getName())) {
        //        return false;
        //    }
        else if (this.name.equals(p.name)&& this.name.equals(p.name)) // type check
        {
            return false;
        }
        else {
            return false;
        }
    }

    public class Objects {

        public  boolean equals(Object a, Object b)
        {
            return (a == b) || (a != null && a.equals(b));
        }
    }


}