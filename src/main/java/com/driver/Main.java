package com.driver;

public class Main {
  public static void main(String[] args) {
	  RWOnly rw = new RWOnly();
//	  rw.name
//	  name is not visible
	  rw.setName("vijay");
	  System.out.println(rw.getName());
  }
}