class index  {

public static void main (String[] args) {

    String str = "ITI develops people and ITI house of developers and ITI for people";
    int index=0; count=0;

    String substring = "ITI";

    while(str.indexof(index , substring) !=-1) {
        count ++;
        index ++;
    }

    System.out.println(str.split(substring).length -1);
    }







}