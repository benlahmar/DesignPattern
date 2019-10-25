/**
 * 
 */
package tuto.strategy;

import tuto.t2.User;

/**
 * @author moi
 *
 */
public class IDataUser implements IData<User>{

	@Override
	public User getData() {
		
		System.out.println("data de type user");
		return new User();
	}

}
