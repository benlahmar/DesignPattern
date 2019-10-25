/**
 * 
 */
package tuto.strategy;

import tuto.dp.Commande;
import tuto.t2.User;

/**
 * @author moi
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AppContext<User> appuser=new AppContext<>();
		Strategy<User> strategy=new ProcessingUser();
		appuser.apply(strategy);
		
		AppContext<Commande> appcmd=new AppContext<>();
		appcmd.apply(new ProcessingCommande());

	}

}
