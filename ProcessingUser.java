/**
 * 
 */
package tuto.strategy;

import tuto.t2.User;

/**
 * @author moi
 *
 */
public class ProcessingUser implements Strategy<User> {

	@Override
	public User processing(User data) {
		System.out.println("traitement des users");
		return data;
	}

}
