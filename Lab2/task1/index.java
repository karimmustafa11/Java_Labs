import java.util.Random;

class index {

public static void main (String[] args) {
    int arr[] = new int [1000];
    Random rand = new Random();
    for (int i =0;i<1000;i++) {
        arr[i] = rand.nextInt(1000) +1;
    }

   for (int i =0;i<1000;i++) {
System.out.println(arr[i]);
  }
    int min , max ;
    min = max = arr[0];
    for (int i =1; i<1000;i++) {
        if(arr[i] > max) 
        {max = arr[i];}
        if (arr[i] < min) 
        {min = arr[i];}
}
        System.out.println("min value is " + min);
        System.out.println("max value is " + max);

}

}