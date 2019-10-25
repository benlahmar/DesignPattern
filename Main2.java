package tuto.strategy;

import tuto.t2.User;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IDataUser idataProvider=new IDataUser();
		ProcessingUser iProcessing=new ProcessingUser();
		Handler<User> em=new Handler<>(idataProvider, iProcessing);
		em.GetDataAndApplyProcessing();
	}

}
