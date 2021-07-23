package com.revature.tasks;

public class RepositoryImplementation {
public static void main(String[] args)throws InvalidCodeException {
Repository r=new Repository();
System.out.println("country code between 70 to 99"+" "+r.getCountryName("78"));
System.out.println("country code of 908" +" "+r.getCountryName("908"));
System.out.println(r.getCountryName("011"));
System.out.println(r.getCountryName("123"));

}
}
