Problem Statement : 
--------------------
      Given a non-empty string and an int n, return a new string where the char at index n has been removed. 
      The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

Test Cases :
-------------
      missingChar("kitten", 1) → "ktten"
      missingChar("kitten", 0) → "itten"
      missingChar("kitten", 4) → "kittn"

My Solution :
-------------
    public String missingChar(String str, int n) {
              String FinalStr = "";
  
              for (int itr = 0;itr <= str.length()-1; itr++)
              {
                if (itr != n)
                  FinalStr = FinalStr + str.charAt(itr);
              }

              return FinalStr;
    }
