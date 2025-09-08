public class Main {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5};
        
        System.out.println(myArray[0]);  
        System.out.println(myArray[2]);  
        
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        
        System.out.println(myArray.length);  // Выведет: 5
    }
}
