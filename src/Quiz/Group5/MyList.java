package Quiz.Group5;

public interface MyList  {
    /*
participant:reference to Participant (null is not allowed)
     */
    boolean add(Object object) ;
    int size();
    void clear();
    Object get (int i);
    boolean remove(Object object);
//    boolean remove(int i);
}
