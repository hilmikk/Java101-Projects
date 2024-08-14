public class PalindromeChecker {
    static boolean isPalindrome(int n){
        int temp = n , reverse=0 , lastDigit;
        while( temp!=0 ){
            lastDigit = n % 10 ;
            reverse= lastDigit + reverse*10;
            temp/=10;

        }
        if(reverse==n){


        return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(576));
        
    }
    
}
