import java.util.*;

public class MovieRecommender {

    static Map<String, List<String>> movieDatabase = new HashMap<>();

    public static void loadMovies() {
        movieDatabase.put("action", Arrays.asList("Mad Max: Fury Road", "John Wick", "Die Hard"));
        movieDatabase.put("comedy", Arrays.asList("The Hangover", "Superbad", "Step Brothers"));
        movieDatabase.put("romance", Arrays.asList("The Notebook", "Titanic", "P.S. I Love You"));
        movieDatabase.put("sci-fi", Arrays.asList("Inception", "The Matrix", "Interstellar"));
        movieDatabase.put("horror", Arrays.asList("The Conjuring", "Get Out", "A Quiet Place"));
        movieDatabase.put("drama", Arrays.asList("Forrest Gump", "The Shawshank Redemption", "Fight Club"));
    }

    public static List<String> recommendMovies(String preference) {
        preference = preference.toLowerCase();
        if (movieDatabase.containsKey(preference)) {
            return movieDatabase.get(preference);
        } else {
            return Arrays.asList("Sorry, I don't have recommendations for that genre.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        loadMovies();

        System.out.println("🎥 Welcome to Movie Recommender AI!");
        System.out.println("Tell me your favorite genre (e.g., action, comedy, romance, sci-fi, horror, drama):");

        String userInput = scanner.nextLine();
        List<String> recommendations = recommendMovies(userInput);

        System.out.println("\n🎯 Recommended Movies for You:");
        for (String movie : recommendations) {
            System.out.println("- " + movie);
        }

        scanner.close();
    }
}
