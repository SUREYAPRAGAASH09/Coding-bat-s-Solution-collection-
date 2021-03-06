Problem Statemnt :
-----------------
      Given 2 int values, return true if one is negative and one is positive. 
      Except if the parameter "negative" is true, then return true only if both are negative.

Test cases :
------------
posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true

My Solution :
-------------
public boolean posNeg(int a, int b, boolean negative) {
  int temp = 0;
    if(((a<0) && (b>0)) || ((a>0) && (b<0)) )
    {
        temp = 1;
    }
    
    if ( (b>0)   &&  (a>0)  )
    {
      negative = false;
    }

    if ( (  (temp == 0) &&  (negative) )   ||   (  (temp == 1) &&  !(negative) ) )
    {
        return true;
    }
    else
    {
      return false;
    } 
}

My Solution 2:
-------------
public boolean posNeg(int a, int b, boolean negative) 
{
  boolean flag =true;
  
  if ( (a<0) && (b<0) )
  {
    if (negative)
      flag = true;
    else
      flag = false;
  }
  else if ( (a<0) || (b<0) )
  {
    if (!(negative))
     flag = true;
    else
     flag = false;
  }
  else
    flag = false;
    
  return flag;
}

