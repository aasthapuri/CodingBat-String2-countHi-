package com.company;

class doubleChar {

    //Given a string, return a string where for every char in the original, there are two chars.
    // doubleChar("The") → "TThhee"
    //doubleChar("AAbb") → "AAAAbbbb"
    //doubleChar("Hi-There") → "HHii--TThheerree"
    public String doubleChar(String str) {
        String pinku ="";
        for(int i=0;i<str.length();i++){
            pinku=pinku+str.charAt(i)+str.charAt(i);
        }
        return pinku;
    }
    //Return the number of times that the string "hi" appears anywhere in the given string.
    //countHi("abc hi ho") → 1
    //countHi("ABChi hi") → 2
    //countHi("hihi") → 2
    public int countHi(String str) {
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.substring(i,i+2).equals("hi")){
                count++;
            }
        }
        return count;
    }



}