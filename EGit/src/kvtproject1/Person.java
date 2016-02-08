package kvtproject1;
 
//Class that defines a generic person
public class Person {
      
       //Properties of a generic person
       private String firstName;
       private String lastName;
       private String address;
       private String city;
       private String state;
       private String zip;
       private String phone;
 
       //Constructor
       public Person(String aFirstName, String aLastName, String anAddress, String aCity, String aState, String aZip, String aPhone){
              //TODO
              //COPY VARIABLES INTO LOCAL CLASS VARIABLES
              firstName = aFirstName;
              lastName = aLastName;
              address = anAddress;
              city = aCity;
              state = aState;
              zip = aZip;
              phone = aPhone;
       }
      
       //Method to set the first name
       public void setFirstName(String firstName) {
              this.firstName = firstName;
       }
       //Method to return the first name
       public String getFirstName() {  
    	   return firstName;
       }
       //--------------------------------------------------------
       //Method to return the last name
       public String getLastName() {
              return lastName;
       }
       //Method to set the last name
       public void setLastName(String lastName) {
              this.lastName = lastName;
       }
       //--------------------------------------------------------
       //Method to return the address
       public String getAddress() {
              return address;
       }
       //Method to set the address
       public void setAddress(String address) {
              this.address = address;
       }
       //--------------------------------------------------------
       //Method to return the city
       public String getCity() {
              return city;
       }
       //Method to set the city
       public void setCity(String city) {
              this.city = city;
       }
       //--------------------------------------------------------
       //Method to return the state
       public String getState() {
              return state;
       }
       //Method to set the state
       public void setState(String state) {
              this.state = state;
       }
       //--------------------------------------------------------
       //Method to return the zip
       public String getZip() {
              return zip;
       }
       //Method to set the zip
       public void setZip(String zip) {
              this.zip = zip;
       }
       //--------------------------------------------------------
       //Method to return the phone
       public String getPhone() {
              return phone;
       }
       //Method to set the phone
       public void setPhone(String phone) {
              this.phone = phone;
       }
      
       //Method to return the summary of results
       public String toString(){
              String result="";
             
              result += "Name: " + firstName + " " + lastName + "\n";
              result += "Phone: " + phone + "\n\n";
              result += "ADDRESS INFORMATION\n" ;
              result += address + "\n";
              result += city + ", " + state + ", " + zip + "\n";
 
              return result;
       }
      
}//End of Person class