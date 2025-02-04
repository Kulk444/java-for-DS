public class Vowels {
    public static void main(String[] args) {
        
        String[] words = {"hello", "world", "apple", "banana", "grape", "tree"};


        for (String word : words) {
            
            char lastChar = word.charAt(word.length() - 1);

           
            if (isVowel(lastChar)) {
               
                System.out.println(word);
            }
        }
    }

   
    public static boolean isVowel(char c) {
       
        c = Character.toLowerCase(c);

       
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}
