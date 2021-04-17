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
	/**
	 * Calls press home button on the state variable
	 */
	public void pressHomeButton() {
		state.pressHomeButton();
	}
	/**
	 * Calls press netflix button on the state variable
	 */
	public void pressNetflixButton() {
		state.pressNetflixButton();
	}
	/**
	 * Calls press hulu button on the state variable
	 */
	public void pressHuluButton() {
		state.pressHuluButton();
	}
	/**
	 * Calls press movie button on the state variable
	 */
	public void pressMovieButton() {
		state.pressMovieButton();
	}
	/**
	 * Calls press TV button on the state variable
	 */
	public void pressTVButton() {
		state.pressTVButton();
	}
	/**
	 * Sets the state
	 */
	public State setState(State state) {
		return this.state=state;
	}
	/**
	 * Gets the home state
	 */
	public State getHomeState() {
		return HomeState;
	}
	/**
	 * Gets the netflix state
	 */
	public State getNetflixState() {
		return NetflixState;
		
	}
	/**
	 * Gets the hulu state
	 */
	public State getHuluState() {
		return HuluState;	
	}

}
