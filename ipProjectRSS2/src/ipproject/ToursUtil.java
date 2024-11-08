package ipproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rishika
 */
public class ToursUtil {
    
    public static int UserId = 0;
    private static String Username = "NULL";
    
    public static void setUsername(String _username){
        Username = _username;        
    }
    
     public static void setUsernameNull(){
        Username = "NULL";        
    }
     
     public static String getUsername(){
         return Username;
     }
    
}
