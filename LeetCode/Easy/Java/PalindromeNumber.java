class Solution {
    public boolean isPalindrome(int x) {
        //there are two ways to resolve this
        //1 is doing some mathematical calculations
        //2 is convert it to a string and comparing the string

        //I will go with option 2, because its easier. However, if 
        //create stringbuilder variable that converts x to string
        //use string reverse function
        //compare string variable with string reverse function to return if true or false

        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(); 
        sb.append(s);

        return s.equals((sb.reverse()).toString());
    }
}
