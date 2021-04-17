/**
 * 
 * @author vishalkosaraju
 * NetflixState which implements state interface
 */
public class NetflixState implements State{
	private TV tv;
	/**
	 * Constructor for Netflixstate
	 * @param tv through the constructor
	 */
	public NetflixState(TV tv) {
		this.tv=tv;
	}
	/**
	 * Loads and changes State
	 */
	@Override
	public void pressHomeButton() {
		// TODO Auto-generated method stub
		System.out.println("Loading the Home Screen...");
		tv.setState(tv.getHomeState());
		
	}
	/**
	 * Loads State
	 */
	@Override
	public void pressNetflixButton() {
		// TODO Auto-generated method stub
		System.out.println("We are already in Netflix");
	}
	/**
	 * Loads and changes State
	 */
	@Override
	public void pressHuluButton() {
		// TODO Auto-generated method stub
		System.out.println("Loading Hulu...\n");
		tv.setState(tv.getHuluState());
	}
	/**
	 * Loops through and displays movies
	 */
	@Override
	public void pressMovieButton() {
		// TODO Auto-generated method stub
		System.out.println("Netflix Movies...");
		
		String movies[]= new String[] {"Titanic", "Pledge","Justice League Snyder cut","The one who flew over the cuckoo nest","Joker"};
		
		for(int i=0; i<movies.length; i++)
		{
			System.out.println("- " + movies[i]);
		}
		System.out.println("\n");
	}
	/**
	 * Loops through and displays tv shows
	 */
	@Override
	public void pressTVButton() {
		// TODO Auto-generated method stub
		System.out.println("Netflix TV Shows...");
		
		String tvShows[]= new String[] {"Breaking Bad", "Game of thrones","Southpark","Family Guy","Simpsons"};
		
		for(int i=0; i<tvShows.length; i++)
		{
			System.out.println("- " + tvShows[i]);
		}
		System.out.println("\n");
	}

}
