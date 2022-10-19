public class StackHeap {

    public static void main(String[] args) {

        int number1 = 50;
        int number2 = 55;
        number1 = number2;
        number2 = 60;
        System.out.println(number1); //çıktı --> 55

        int[] numbers = {1,2,3};
        int[] numbers2 = {4,5,6};
        numbers = numbers2;
        numbers2[0] = 10;
        System.out.println(numbers[0]); //çıktı --> 10
    }
}
