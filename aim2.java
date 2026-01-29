import java.util.ArrayList;
class Aim2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add (10);
        arr.add (20);
        arr.add (30);
        arr.add (40);
        arr.add (50);
        int n = arr.size();
        System.out.println("Array elements are: ");
            System.out.println(arr+" ");


            arr.add(5,60);
            System.out.println("Inserted new element: ");
            System.out.println(arr+" " );



            arr.remove(5);
            System.out.println("After removing element: ");
        System.out.println(arr+" " );
        }
    }
