package com.je.lambda;

public interface Sim {
     int serialNbr=123;
     void call(double number);
     void sms(String msg);
	
     public void m1();
     default void FourgSupport() {
    	 System.out.println("4g supporting in gio");
     }
     default void videoCalling() {
    	 System.out.println("vidoe acalling");
     }
     default void fastInterSupport() {
    	 System.out.println("fastInterSupport calling");
     }
}
