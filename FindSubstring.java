public class FindSubstring {
    public static int findFirstOccurrence(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "but";
        System.out.println(findFirstOccurrence(haystack, needle));
    }
}