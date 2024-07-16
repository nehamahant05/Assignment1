package Assign;

public class ArrayExample
{
    public static void arrayExample()
    {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] arr={10,20,30,40,50};
        int sum=0;
        for(int s:arr)
        {
            sum+=s;
        }
        System.out.println("sum of arrray is ="+sum);

        System.out.println("First array value=="+cars[0]);
        for(int i=0;i<cars.length;i++){
            System.out.println("Array element " + i +"="+ cars[i]);
        }

        //for each loop

        for(String s:cars)
        {
            System.out.println("for each==="+s);
        }

    }
}

