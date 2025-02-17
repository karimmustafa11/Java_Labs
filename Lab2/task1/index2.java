
class index2 {

public static void main (String[] args) {
    int arr[] = new int [1000];
    for (int i =0;i<1000;i++) {
        arr[i] = i+1;
    }

    if (args.length > 0){
        int num = Integer.parseInt(args[0]);

        // linear search    
        long start1 =  System.nanoTime();
        int index = -1;
        for (int i =0;i<arr.length;) {
            if(num == arr[i]) {
                index = i;
                break;
            }
            else {
                i++;
            }
        }
        long end1 = System.nanoTime();
        long linearTime = end1 - start1;

         if (index != -1) {
                System.out.println("Your value is found at index " + index);
            } else {
                System.out.println("Value not found.");
            }
        System.out.println("linear time search " + linearTime);


        // binary search
        int left = 0, right = arr.length - 1;
        int index2 = -1;
        long start2 = System.nanoTime();
        while (left <= right) {
            int mid = left + (right - left) / 2; 
            
            if (arr[mid] == num) {
                index2 = mid; 
                break;
            } else if (arr[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        long end2 = System.nanoTime();
        long binarttime = end2 - start2;

         if (index2 != -1) {
                System.out.println("Your value is found at index " + index2);
            } else {
                System.out.println("Value not found.");
            }
        System.out.println("binary time search " + binarttime);

        
    }
    else {
    System.out.println("yon must enter a value to search");
    
        }
    }


    }   
