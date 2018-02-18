
public class MovieThang {








public static void main(String[] args) {
Movie BP = new Movie("BlackPanther", 5);
Movie J = new Movie("Jumanji", 3);
Movie T = new Movie("Twilight", 0);
Movie N2 = new Movie("NowYouSeeMe2", 4);
Movie Z = new Movie("Zombies", 1);
N2.getTicketPrice();
T.getTicketPrice();

NetflixQueue R = new NetflixQueue();
R.addMovie(BP);
R.addMovie(J);
R.addMovie(T);
R.addMovie(N2);
R.addMovie(Z);

R.printMovies();
R.sortMoviesByRating();

}








}
