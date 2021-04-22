package Quiz.quiz_856;

public class Movies {
    public static void main(String[] args){
        Array array1 = new Array();
        System.out.println(array1.getResult1());
        System.out.println(array1.getResult2());
        System.out.println(array1.getResult3());
        System.out.println(array1.getResult4());

    }
 private static class Array{
     String[] titles = {"Raiders of the Lost Ark", "Indiana Jones and the Temple of Doom", "Indiana Jones and the Last Crusade","Indiana Jones and the Kingdom of the Crystal Skull"};
     String[] actors_Lost_Ark = {"Indiana Jones (Harrison Ford)","René Belloq (Paul Freeman)","Marion Ravenwood (Karen Allen)","Sallah (John Rhys-Davies)"};
     String[] actors_Temple_of_Doom = {"Indiana Jones (Harrison Ford)","Willie Scott (Kate Capshaw) ","Short Round (Jonathan Ke Quan)","Mola Ram (Amrish Puri) "};
     String[] actors_Last_Crusade = {"Indiana Jones (Harrison Ford)","Marcus Brody (Denholm Elliott)", "Walter Donovan (Julian Glover)","Elsa Schneider (Alison Doody)"};
     String[] actors_Kingdom = {"Indiana Jones (Harrison Ford)","Irina Spalko (Cate Blanchett)"};
     String[][] movies = {
         titles,
         actors_Lost_Ark,
         actors_Temple_of_Doom,
         actors_Last_Crusade,
         actors_Kingdom
     };
     String a ="In the movie ";
     String result1 =a + movies[0][0]+" the main actors are:  " +movies[1][0] + "; "+movies[1][1] + "; "+movies[1][2] + "; "+movies[1][3] ;
     String result2 =a+ movies[0][1]+" the main actors are:  " +movies[2][0] + "; "+movies[2][1] + "; "+movies[2][2] + "; "+movies[2][3] ;
     String result3 =a+movies[0][2]+" the main actors are:  " +movies[3][0] + "; "+movies[3][1] + "; "+movies[3][2] + "; "+movies[3][3] ;
     String result4 =a+ movies[0][3]+" the main actors are:  " +movies[4][0] + "; "+movies[4][1] ;
     public String getResult1() {
         return result1;
     }
     public String getResult2() {
         return result2;
     }
     public String getResult3() {
         return result3;
     }
     public String getResult4() {
         return result4;
     }
 }
}
