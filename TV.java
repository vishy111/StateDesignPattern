/**
 * 
 * @author vishalkosaraju
 * TV class
 */
public class TV {
	private State HomeState;
	private State NetflixState;
	private State HuluState;
	
	private State state;
	/**
	 * Constructors
	 */
	public TV() {
		HomeState = new HomeState(this);
		NetflixState = new NetflixState(this);
		HuluState = new HuluState(this);
		state = HomeState;
	}
	
	public void pressHomeButton() {
		state.pressHomeButton();
	}
	public void pressNetflixButton() {
		state.pressNetflixButton();
	}
	public void pressHuluButton() {
		state.pressHuluButton();
	}
	public void pressMovieButton() {
		state.pressMovieButton();
	}
	public void pressTVButton() {
		state.pressTVButton();
	}
	public State setState(State state) {
		return this.state=state;
		
	}
	public State getHomeState() {
		return HomeState;
	
	}
	public State getNetflixState() {
		return NetflixState;
		
	}
	public State getHuluState() {
		return HuluState;	
	}

}
