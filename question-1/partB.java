/**
* Returns a shortened version of username with each hyphen ("-")
* and the character before it removed, as described in part (b)
* Preconditions: username does not start or end with a hyphen.
* username does not contain consecutive hyphens.
* username.length() >= 2
* Postcondition: username is unchanged.
*/
public String getShortenedName() {
  String newName = ""; // initialize new String that is "hyphen free"

  for (String letter : username) {
    if (!letter.equals("-") { // if this letter doesnt equal the hyphen... ("Shak-Ganiev-Shaky") 
      newName += letter; //add this letter to the new String ("ShakGanievShaky")
    }
  }

}
/* There may be instance variables, constructors, and methods
that are not shown. */
