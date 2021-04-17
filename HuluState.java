/**
 * 
 * @author vishalkosaraju
 * HuluState which implements state interface
 */
public class HuluState implements State {
	private TV tv;
	
	public HuluState(TV tv) {
		this.tv=tv;
	}
	@Override
	public void pressHomeButton() {
		// TODO Auto-generated method stub
		System.out.println("Loading the Home Screen...");
		tv.setState(tv.getHomeState());
	}

	@Override
	public void pressNetflixButton() {
		// TODO Auto-generated method stub
		System.out.println("Loading Netflix... \n");
		tv.setState(tv.getNetflixState());
	}

	@Override
	public void pressHuluButton() {
		// TODO Auto-generated method stub
		System.out.println("We are already in Hulu...\n");
	}

	@Override
	public void pressMovieButton() {
		// TODO Auto-generated method stub
		System.out.println("Hulu Movies...");
		String movies[]= new String[] {"Fear", "Point Break","Devils Advocate","Chasing Amy","The Dancer Upstairs"};
		
		for(int i=0; i<movies.length; i++)
		{
			System.out.println("- " + movies[i]);
		}
		System.out.println("\n");
	}

	@Override
	public void pressTVButton() {
		// TODO Auto-generated method stub
		System.out.println("Hulu TV Shows...");

		String tvShows[]= new String[] {"Batman the animated series", "TeenTitans","DoraTheExplorer","Peppa The Pig","Blues Clues"};
		
		for(int i=0; i<tvShows.length; i++)
		{
			System.out.println("- " + tvShows[i]);
		}
		System.out.println("\n");
	}

}
