class Solution {
    public int romanToInt(String s) {
        //convert String to a charArray
        //create list of integers
        //check if index A and index B should be combined
            //if yes, then convert index A and index B to number and add to list of int
            //if no, then convert index A to number and add to list of int
        //sum up items in the list and return the sum 

        //create char arr to loop through each letter
        char[] ch = s.toCharArray();
        int total = 0;
        //create list to hold new list that will include int
        //List<Integer> list = new ArrayList<Integer>();

        //loop through array
        for(int i = 0; i < ch.length; i++) {
            //avoid out of index 
            int k = i+1;
            if (i+1 == ch.length) 
                k = i;

            //check if the first two characters are combined or not
            //then convert the character to number and add to the list
            if (isCharCombined(ch[i], ch[k])) {
                total += convertNumeral("" + ch[i] + ch[k]);
                //Collections.addAll(list, convertNumeral("" + ch[i] + ch[k]));
                i++;
            } else {
                total += convertNumeral("" + ch[i]);
                //Collections.addAll(list, convertNumeral("" + ch[i]));
            }
        }

        //use stream to sum integers
        /*return list.stream()
        .mapToInt(a -> a)
        .sum();*/
        return total;
    }
    
    public boolean isCharCombined(char a, char b) {
        String s = "" + a + b;
        return (s.equals("IV") || s.equals("IX") || s.equals("XL") || s.equals("XC") || s.equals("CD") || s.equals("CM"));
    }
    public int convertNumeral(String s) {
        switch (s) {
            case "I": return 1;
            case "IV": return 4;
            case "V": return 5;
            case "IX": return 9;
            case "X": return 10;
            case "XL": return 40;
            case "L": return 50;
            case "XC": return 90;
            case "C": return 100;
            case "CD": return 400;
            case "D": return 500;
            case "CM": return 900;
            case "M": return 1000;
            default: return 0;
        }
    }
}
