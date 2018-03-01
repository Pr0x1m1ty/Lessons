package lesson13;

public class Movie implements Comparable<Movie> {

    public double score;
    public String title;

    public Movie(double score, String title) {
        this.score = score;
        this.title = title;
    }

    public int compareTo(Movie m) {
        return (score < m.score) ? -1 : ((score == m.score) ? 0 : 1);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", score=" + score +
                '}';
    }
}
