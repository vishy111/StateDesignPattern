/**
 * 
 * @author vishalkosaraju
 * HomeState which implements state interface
 */
public class HomeState implements State{
	private TV tv;
	
	public HomeState(TV tv) {
		// TODO Auto-generated constructor stub
		this.tv=tv;
	}
	@Override
	public void pressHomeButton() {
		// TODO Auto-generated method stub
		System.out.println("TV is already on the home screen \n");
		
	}

	@Override
	public void pressNetflixButton() {
		// TODO Auto-generated method stub
		System.out.println("Loading Netflix...\n ");
		tv.setState(tv.getNetflixState());
	}

	@Override
	public void pressHuluButton() {
		// TODO Auto-generated method stub
		System.out.println("Loading Hulu... ");
		tv.setState(tv.getHuluState());
	}

	@Override
	public void pressMovieButton() {
		// TODO Auto-generated method stub
		System.out.println("Home: You must pick an app to show movies.");
	}

	@Override
	public void pressTVButton() {
		// TODO Auto-generated method stub
		System.out.println("Home: You mut pick an app to show tv shows.");
	}

}
