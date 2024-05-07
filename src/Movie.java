public class Movie {

    String title;
    String genre;
    int releaseYear;
    int rating;
    int i=0;
    int j=0;


    Movie(String title,String genre,int releaseYear,int rating)
    {
        this.title=title;
        this.genre=genre;
        this.releaseYear=releaseYear;
        this.rating=rating;

    }

    Movie()
    {

    }

    public int getRating()
    {
        return rating;
    }
    public void setRating(int rating)
    {
        this.rating=rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString()
    {
        return String.format("Title=%s Genre=%s\n Release Year=%d Rating=%d",title,genre,releaseYear,rating);
    }

    @Override
    public boolean equals(Object obj)
    {
        Movie other =(Movie)obj;
        return title.equals(other.title)&& genre.equals(other.genre)&&this.releaseYear== other.releaseYear && this.rating==other.rating;

    }



}
