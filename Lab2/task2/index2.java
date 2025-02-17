

class index2 {


public static void main (String[] args) {

if (args.length > 0) {

  String[] str =  args[0].split("\\.");
      System.out.println(str);

     for (String st:str) {
    System.out.println(st);
}

}


else {
    System.out.println("you must enter ip");
}

}
}