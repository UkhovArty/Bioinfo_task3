package task3;

public class PlaceFinder {

    public static void findPlace(String text, String pattern, Integer d) {
        final int initialCapacity = text.length() - pattern.length() + 1;
        Integer[] place = new Integer[initialCapacity];
        int insideCounter = 0;
        char charmahder;
        char charmillion;
        Integer insCount = 0;
        for (int i = 0; i < initialCapacity; i++) {
            String tmp = text.substring(i, pattern.length() + i);
            for (int j = 0; j < pattern.length(); j++) {
                charmahder = tmp.charAt(j);
                charmillion = pattern.charAt(j);
                if (charmahder != charmillion) {
                    insCount = insCount + 1;
                    //System.out.println(insCount);
                }
            }
            if (insCount <= d) {
                place[insideCounter] = i;
                insideCounter = insideCounter + 1;
            }
            insCount = 0;
        }
        String result = "";
        for (int i = 0; i < initialCapacity; i++) {
            if (place[i] != null) {
                result = result + place[i] + " ";
            }
        }
        System.out.println(result);
    }
}
