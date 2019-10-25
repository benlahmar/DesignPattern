package tuto.strategy;



public class AppContext<T> {

	T data;
	
	
	public void apply(Strategy<T> strategy)
	{		
		strategy.processing(data);
	}
}
