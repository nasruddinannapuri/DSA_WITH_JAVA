package Strings;

public class StringCompression {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(compress(str));
    }
    public static StringBuilder compress(String str){
        StringBuilder newStr = new StringBuilder("");

        for(int i = 0; i< str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if(count > 1){
                newStr.append(count.toString());
            }
        }

        /* 
        for(int i = 0; i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }
        }

        */
        return newStr;
    }

}
