package oop.metodoverriding;

public class Test {
	
	public static void main(String[] args) {
		
//		BaseCtl[] baseCtl = new BaseCtl[2];
//		
//		baseCtl[0] = new LoginCtl();
//		baseCtl[1] = new UserCtl();
//		
//		for (int i = 0; i < baseCtl.length; i++) {
//			baseCtl[i].getView();
//			
//		}
		
		UserCtl userctl = new UserCtl();
		userctl.getView();
		
		
		LoginCtl loginctl = new LoginCtl();
		loginctl.getView();
		
		BaseCtl basectl = new LoginCtl();
		basectl.getView();
		
	}

}
