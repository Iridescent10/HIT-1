public class Demo {   
    private static int Fibonacci.of(int i) {  
        if (i == 1 || i == 2)  
            return 1;  
        else  
            return  Fibonacci.of(i - 1) +  Fibonacci.of(i - 2);  
    }  
   
    public static void main(String[] args) {  
        System.out.println("斐波那契数列1到200以内为：");  
        for (int j = 1; Fibonacci.of(j)<= 200; j++) {  
            System.out.print( Fibonacci.of(j) + "\t");  
            if (j % 5 == 0)  
                System.out.println();  
        }  
    }  
   
}