package com.revature.tasks;

public class Repository {
static String getCountryName(String countryCode) throws InvalidCodeException{
String country = null;
//70 to 99 -India
int cc=Integer.parseInt(countryCode);
if(cc>=70 && cc<=99)
country="India";
//908 = US
else if(cc==908)
country="US";
//011 -Dial somewhere outside of USA
else if(countryCode.equals("011"))
country="Dail somewhere outside of USA";
// No country with given code found
else
{
try{
throw new InvalidCodeException("Enter a validcode");
}catch(InvalidCodeException e){
country="No country with given code";
}

}
return country;
}
}
