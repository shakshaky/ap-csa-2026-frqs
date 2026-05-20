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
  String newName = ""; // initialize new String that is "hyphen free"

  for (int i = 0; i < username.length(); i++) {
    
    String letter = username.substring(i, i + 1);
    
    if (i > 0) {
      String previous = username.substring(i - 1, i);
    }
    
    if (!letter.equals("-") && !letter.equals(previous) {
      newName += letter;
    }
  }

}

// SOLUTION ABOVE

/* There may be instance variables, constructors, and methods
that are not shown. */
