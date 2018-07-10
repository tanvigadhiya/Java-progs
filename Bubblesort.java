public class Bubblesort{

 public static void main(String args[]){


 int ar[]={5,44,81,22};

 
for(int i=0;i<ar.length;i++)

 {
 
  for(int j=1;j<(ar.length-i);j++)
 
  {
   
   if(ar[j-1]>ar[j])
   
    {
 int temp=ar[j-1];
     
      ar[j-1]=ar[j];
      
       ar[j]=temp;
   
    }

  }


 }

  for(int i=0;i<ar.length; i++)

  {
  
   System.out.println(ar[i]);

  }


 }


}