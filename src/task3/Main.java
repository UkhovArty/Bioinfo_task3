package task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        String pattern = scanner.nextLine();
        Integer d = scanner.nextInt();
        FileReader stream = new FileReader(filename);
        BufferedReader input = new BufferedReader(stream);
        String text = input.readLine();
        PlaceFinder.findPlace(text, pattern, d);

    }
}

       /* List<String> set = new ArrayList<>();
        set = (List<String>) FrequentWords.frequentPatterns(text, k);
        for (int i = 0 ; i< set.size(); i++) {
            System.out.println(set.get(i));
        }

    //String compliment = "";
    //compliment = ReverseCompliment.doTheReverse(ReverseCompliment.findCompliments(pattern));
    //PlaceFinder.findPlace(text, compliment);


        /*String tmp;
        tmp = ReverseCompliment.findCompliments(pattern);
        System.out.println(ReverseCompliment.doTheReverse(tmp));*/

