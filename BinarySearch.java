
 
public class BinarySearch 
{
  public static void main(String args[])
  {
    int c, first, last, middle, search;
 
    int[] array = {1, 2, 3, 4, 5};
 
     
    System.out.println("Array is => ");
    for (c = 0; c < 5; c++)
 	 System.out.println("" + array[c] + "");

 
    
    search = 4;
    System.out.println("The value to be found is " + search + "");
 
    first  = 0;
    last   = 5 - 1;
    middle = (first + last)/2;
 
    while( first <= last )
    {
      if ( array[middle] < search )
        first = middle + 1;    
      else if ( array[middle] == search ) 
      {
        System.out.println(search + " found at location " + (middle) + ".");
        break;
      }
      else
         last = middle - 1;
 
      middle = (first + last)/2;
   }
   if ( first > last )
      System.out.println(search + " isn't present in the list.\n");
  }
}