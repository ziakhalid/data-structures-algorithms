package ProgramCreek.Array_String.HashMap;

import java.util.HashMap;

public class ValidAnagram {

    public static void main(String[] args) {

        System.out.println("Is Valid Anagram : " + isAnagram("butter", "rubtte"));
    }

    private static boolean isAnagram(String one, String two) {

        if (one.length() != two.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < one.length(); i++) {
            if (map.containsKey(one.charAt(i))) {
                map.put(one.charAt(i), map.get(one.charAt(i)) + 1);
            } else {
                map.put(one.charAt(i), 1);
            }
        }

        for (int i = 0; i < two.length(); i++) {
            if (map.containsKey(two.charAt(i))) {
                if (map.get(two.charAt(i)) == 1) {
                    map.remove(two.charAt(i));
                } else {
                    map.put(two.charAt(i), map.get(two.charAt(i)) - 1);
                }
            } else {
                return false;
            }
        }

        if (map.size() > 0) return false;

        return true;
    }

}
