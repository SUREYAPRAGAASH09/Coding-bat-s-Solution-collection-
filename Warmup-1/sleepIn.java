PROEBLEM STATEMENT : 
---------------------
    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
    We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

Sample Test case :
-----------------
    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true

My Solution :
-------------
    public boolean sleepIn(boolean weekday, boolean vacation) 
    {
        boolean SleepIn = false;
  
        if ( !(weekday) || (vacation) )
            SleepIn = true;
        
        return SleepIn;
    }
