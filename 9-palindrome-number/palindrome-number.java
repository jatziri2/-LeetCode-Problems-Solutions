class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || x != 0 && x % 10 == 0){
            return false;
        }
        int mitad = 0;

        while(x > mitad){
            mitad = mitad * 10 + x % 10;
            x = x / 10;
        }
        return(x == mitad || x == mitad / 10);
        
    }
}