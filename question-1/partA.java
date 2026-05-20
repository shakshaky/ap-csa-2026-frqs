private String username; // To be initialized in part (a)
/**
* Creates a username based on the parameter requestedName. If the
* username is unavailable, appends successive integers, beginning
* with 1, to requestedName until an available username is found,
* as described in part (a).
*/
public Account(String requestedName) { 
  
  username = requestedName;
  int version = 1;

  while (!isAvailable(username)) {
    username = requestedName + version;
    i++;
  }

}
/**
* Returns true if the parameter str is an available username;
* returns false otherwise.
*/
public static boolean isAvailable(String str)
{ /* implementation not shown */ }
