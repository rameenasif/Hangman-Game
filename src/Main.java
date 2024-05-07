import java.util.*;
import java.util.List;
import java.util.HashSet;
import java.util.Set;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        System.out.println(movies.size());
        movies.add(new Movie("Jurrasic Park", "fiction", 2003, 4));
        movies.add(new Movie("Friends","Comedy",1990,5));
        movies.add(new Movie("Alien","fiction",2024,3));
        System.out.println(movies.isEmpty());
        System.out.println(movies.size());


            for (Movie temp : movies) {
                System.out.println(temp);
            }


        movies.remove(new Movie("Jurrasic Park", "fiction", 2003, 4));
        System.out.println("Removed!");

        for (Movie temp : movies) {
            System.out.println(temp);
        }

        //updating
        movies.set(0,new Movie("Interstellar","Space",2023,5));
        System.out.println("Updated!");
        for (Movie temp:movies)
        {
            temp.setRating(temp.getRating()+1);

        }

        for (Movie temp : movies) {
            System.out.println(temp);
        }

        String text="Hi.\n" +"I am Rameen.\n" +"I am studying in COMSATS.\n";
        ArrayList<String> lines=new ArrayList<>();
        String sentences[]=text.split("\\. ");
        System.out.println(sentences.length);
        System.out.println(sentences[0]);

       lines.addAll(List.of(text.split(" ")));

        ArrayList<String> line1=new ArrayList<>();
        line1.addAll(List.of(text.split("\\.")));

       Set<String> set= new HashSet<>();
       set.addAll(lines);


        for(String s:sentences)
        {
            lines.add(s);
            System.out.println(s);

        }
            System.out.println("Total words:"+lines.size());
        System.out.println("Total sentences:"+line1.size());
        System.out.println("Unique Words:"+ set.size());

        char words[]=text.toCharArray();
        System.out.println("Total Characters:"+ words.length);

        char charArr[]=text.toCharArray();
        HashSet<Character> uniqueCharacter=new HashSet<>();
        for(Character b:charArr)
        {
            uniqueCharacter.add(b);
        }

        System.out.println("Unique Characters:"+uniqueCharacter.size());


        text = text.toLowerCase();
        String[] wordsf = text.split("\\s+");

        // Initialize arrays to store unique words and their frequencies
        String[] uniqueWords = new String[wordsf.length];
        int[] frequencies = new int[wordsf.length];

        // Count frequency of each word
        int uniqueIndex = 0;
        for (String w : wordsf) {
            boolean found = false;
            for (int i = 0; i < uniqueIndex; i++) {
                if (uniqueWords[i].equals(w)) {
                    frequencies[i]++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                uniqueWords[uniqueIndex] = w;
                frequencies[uniqueIndex] = 1;
                uniqueIndex++;
            }
        }


        System.out.println("Word Frequencies:");
        for (int i = 0; i < uniqueIndex; i++) {
            System.out.println(uniqueWords[i] + ": " + frequencies[i]);
        }
    }





}