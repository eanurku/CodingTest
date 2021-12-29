package com.anurag;

/*

/stack/push POST
request body{

}
/stack/pop GET
response body{
}
/stack/size
response{
}


1 1 2 3 5 8 13 21
1 2 3 4 5 6 7   8

input
n=3
output:
2


n=5
fun(4)+fun(3)




 */


public class App 
{
    public static void main( String[] args )
    {
        int n=8;
        System.out.println(getNthFiboonacciNumber(n));

    }

    private static int getNthFiboonacciNumber(int n) {
        if(n<=2){
            return 1;
        }
        return getNthFiboonacciNumber(n-1)+getNthFiboonacciNumber(n-2);
    }
}
