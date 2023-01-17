import java.util.Scanner;

public class Main {

    public static int[] Test1 = {1, 1, 1, 1, 1};
    public static int[] Test2 = {2, 2, 5, 5, 5};
    public static int[] Test3 = {9, 1, 1, 1, 10};
    public static int[] Test4 = {-10, 1, 5, 6, 23, 44, 14};
    public static int[] Test5 = {1};
    public static int[] Test6 = {1, 2, 3, 4, 5};
    public static int[] Test7 = null;
    public static int[] Test8 = {};
    public static int[] Test9 = {1, 1, 1, 1, 2};
    public static int[] Test10 = {5, 5, 5, 4, 4};

    public static final Test T1 = new Test(5, Test1, 0);
    public static final Test T2 = new Test(5, Test2, 10);
    public static final Test T3 = new Test(5, Test3, 0);
    public static final Test T4 = new Test(7, Test4, 44);
    public static final Test T5 = new Test(1, Test5, 0);
    public static final Test T6 = new Test(5, Test6, 0);
    public static final Test T7 = new Test(0, Test7, 0);
    public static final Test T8 = new Test(0, Test8, 0);
    public static final Test T9 = new Test(5, Test9, 0);
    public static final Test T10 = new Test(5, Test10, 4);

    public static final String PRINT_MESSAGE = "Введите целое положительное число элементов массива: ";

    public static int scanInt() {
        int N = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(PRINT_MESSAGE);
            while (!scanner.hasNextInt()) {
                System.out.println(PRINT_MESSAGE);
                scanner.next();
            }
            N = scanner.nextInt();
        } while (N <= 0);
        return N;
    }

    public static int scanArr(int i) {
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите " + (i+1) + " элемент массива:");
        while (!scanner.hasNextDouble()) {
            System.out.println("Введите " + (i+1) + " элемент массива:");
            scanner.next();
        }
        a = scanner.nextInt();
        return a;
    }

    public static int[] arr(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = scanArr(i);
        }
       return array;
    }

    public static int solution(int n, int[] array){
        int sum = 0;
        int lastChet = 0;
        int lastNeChet = 0;
        for (int i = 0; i < n; i++){

            if (array[i] % 2 == 0){
                lastChet = i;
            }else{
                lastNeChet = i;
            }
        }
        for (int i = (Math.min(lastChet, lastNeChet) + 1); i < Math.max(lastChet, lastNeChet); i++){
            if ((array[lastChet] % 2 == 0) && (array[lastNeChet] % 2 == 1)){
                sum = sum + array[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        T1.isCor();
        T2.isCor();
        T3.isCor();
        T4.isCor();
        T5.isCor();
        T6.isCor();
        T7.isCor();
        T8.isCor();
        T9.isCor();
        T10.isCor();

        int n = scanInt();
        int[] arr = arr(n);
        System.out.println(solution(n, arr));
    }
}