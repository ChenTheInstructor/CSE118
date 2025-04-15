package p9;

public class Movie {
	private String title;
	private String genre;
	private int durationInMinutes;
	
	public Movie(String title, String genre, int duration) {
		this.title = title;
		this.genre = genre;
		this.durationInMinutes = duration;
	}

	public Movie(String title) {
		this.title = title;
	}

	public Movie(String title, int durationInMinutes) {
		this.title = title;
		this.durationInMinutes = durationInMinutes;
	}
	
	public boolean isLongMovie() {
		return durationInMinutes > 150;
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

	public int getDurationInMinutes() {
		return durationInMinutes;
	}

	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", genre=" + genre + ", durationInMinutes=" + durationInMinutes + "]";
	}
	
	
	
}
