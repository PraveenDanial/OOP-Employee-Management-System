
package ClassPackage;

import java.io.BufferedReader;
import java.io.IOException;

public class UserClass {
    
      FileManagement fs = new FileManagement("User_Info.txt");
     
    private String UserID;//U001
    private String Password;//11111
    private String UserType;//Admin
    private int UserCount;

public UserClass(){}
    public UserClass(String UserId, String Password) //U001 11111
    {
        this.UserID = UserId;//U001
        this.Password = Password;//11111
    }
    public UserClass(String UserId, String Password, String UserType) {
        this.UserID = UserId;
        this.Password = Password;
        this.UserType = UserType;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public int getUserCount() {
        return UserCount;
    }

    public void setUserCount(int UserCount) {
        this.UserCount = UserCount;
    }
    public boolean addNewUser() {
        if(!fs.createANewFile()){
            
            String record = UserID + " " + Password+ " " + UserType ;
            System.err.println(UserID + " " + Password+ " " + UserType);
            return fs.writeDataToFile(record);
        }
        return false;
}
    public boolean validateLogin() {
        try {
            String[] words = null;            
            BufferedReader UserbufferedReader  = fs.readAFile();
            String user;

            while ((user = UserbufferedReader.readLine()) != null)//U001 11111 Admin
            {              
                words = user.split(" ");//[0]=U001 [1]=11111 [2]=Admin
                    //U001==U001 T   &&        11111==11111 T -->T
                if (words[0].equals(UserID) && words[1].equals(Password)) {
                    this.setUserID(words[0]);//U001
                    this.setPassword(words[1]);//11111
                    this.setUserType(words[2]+" "+words[3]);//Admin
                    return true;
                }
            }
        } catch (IOException ex) {
            System.out.println("Error Validating Login"+ex);
        }
       
        return false;
    }
    public String viewAllUsers () {
        String user, allUsers = " ";
        String[] words = null;
        int count = 0;
        BufferedReader bufferedReader = fs.readAFile();
        try {
            while ((user = bufferedReader.readLine()) != null) {    
                words = user.split(" ");
                allUsers = allUsers + words[0] +  "\t" +  words[2] + " " + words[3] + "\n";
                count++;
            }
        } catch (IOException ex) {
              System.out.println("Error view All Users"+ex);
        }       
        setUserCount(count);
        return allUsers;
    }
  }