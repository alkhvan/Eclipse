package Quiz.quiz_856;

public class Movies {
    public static void main(String[] args) {
       System.out.println(result1st()+result2st()+result3st()+result4st());


    }

    private static class Array {
        String[] titles = {"Raiders of the Lost Ark", "Indiana Jones and the Temple of Doom", "Indiana Jones and the Last Crusade", "Indiana Jones and the Kingdom of the Crystal Skull"};
        String[] actors_Lost_Ark = {"Indiana Jones (Harrison Ford)", "René Belloq (Paul Freeman)", "Marion Ravenwood (Karen Allen)", "Sallah (John Rhys-Davies)"};
        String[] actors_Temple_of_Doom = {"Indiana Jones (Harrison Ford)", "Willie Scott (Kate Capshaw) ", "Short Round (Jonathan Ke Quan)", "Mola Ram (Amrish Puri) "};
        String[] actors_Last_Crusade = {"Indiana Jones (Harrison Ford)", "Marcus Brody (Denholm Elliott)", "Walter Donovan (Julian Glover)", "Elsa Schneider (Alison Doody)"};
        String[] actors_Kingdom = {"Indiana Jones (Harrison Ford)", "Irina Spalko (Cate Blanchett)"};
        String[][] movies = {
                //        titles,
                actors_Lost_Ark,
                actors_Temple_of_Doom,
                actors_Last_Crusade,
                actors_Kingdom
        };
    }

    private static int result1st() {
        Array array = new Array();
        int k = 0;
        System.out.println("In the movie: " + array.titles[0] + " the main actors are: ");
        while (array.actors_Lost_Ark != null && k < array.actors_Lost_Ark.length) {  //oder <= hier?
            System.out.println(array.actors_Lost_Ark[k]);
            k++;
        }
        return k;
    }

    private static int result2st() {
        Array array = new Array();
        int i = 0;
        System.out.println("In the movie: " + array.titles[3] + " the main actors are: ");
        while (array.actors_Kingdom != null && i < array.actors_Kingdom.length) {  //oder <= hier?
            System.out.println(array.actors_Kingdom[i]);
            i++;
        }
        return i;
    }

    private static int result3st() {
        Array array = new Array();
        int i = 0;
        System.out.println("In the movie: " + array.titles[2] + " the main actors are: ");
        while (array.actors_Last_Crusade != null && i < array.actors_Last_Crusade.length) {  //oder <= hier?
            System.out.println(array.actors_Last_Crusade[i]);
            i++;
        }
        return i;
    }

    private static int result4st() {
        Array array = new Array();
        int i = 0;
        System.out.println("In the movie: " + array.titles[1] + " the main actors are: ");
        while (array.actors_Temple_of_Doom != null && i < array.actors_Temple_of_Doom.length) {  //oder <= hier?
            System.out.println(array.actors_Temple_of_Doom[i]);
            i++;
        }
        return i;
    }

}







