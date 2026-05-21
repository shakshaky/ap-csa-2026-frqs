/**
* Returns a shortened version of username with each hyphen ("-")
* and the character before it removed, as described in part (b)
* Preconditions: username does not start or end with a hyphen.
* username does not contain consecutive hyphens.
* username.length() >= 2
* Postcondition: username is unchanged.
*/

// SOLUTION BELOW

public String getShortenedName() {
  String newUser = username; // "Shak-Ganiev-Hello"

  int found = newUser.indexOf("-"); 

  while (found != -1) {
    newUser = newUser.substring(0, found - 1) + newUser.substring(found + 1); // "ShaGanieHello"
    
  }
  return newUser; // "ShaGanieHello"
  
}

// SOLUTION ABOVE

/* There may be instance variables, constructors, and methods
that are not shown. */
