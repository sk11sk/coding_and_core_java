package Arrays;


//sorted

public class Print_Missing_element_from_array {
    public static void main(String[] args) {


        int []  arr = {1,2,5,8,9};

        int j=0;

        for (int i = 1; i <= 10; i++) {


            if (  j <arr.length && i==arr[j]   ){

                j++;

            }else {

                System.out.println(i);


            }

        }
    }
}

//non sorted using while loop
  class MV {

      public static void main(String[] args) {
          int [] y = {100,200,300, 400, 500};

          int []  arr = {400,100};

          int j =0;
          int i=0;


          while (j<arr.length){

              if( i< y.length && y[i]==arr[j] ){
                  i++;
                  j=0;

              }else {

                  if (i< y.length &&  j== arr.length-1 && y[i]!=arr[arr.length-1]  ){

                      System.out.println(y[i]);
                      j= 0 ;
                      i++;
                  }else {
                      j++;
                  }



              }



          }


      }
      }

// using for loop

class MV1{

    public static void main(String[] args) {




        int [] y = {100, 200, 300, 400, 500};

      int []  arr = {100,300};

        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (y[i] == arr[j]) {
                    break;

                } else if (y[i] != arr[arr.length - 1] && j == arr.length - 1) {

                    System.out.println(y[i]);


                }

            }
        }


    }

        }

// using boolean array

        class MV2{
            public static void main(String[] args) {

                int [] arr= {1,2,3,6,5,8};

                boolean [] b = new boolean[11];

                for ( int num : arr){

                    b[num] =true;
                }

                for (int i=1; i<=10;i++){

                    if (!b[i]){
                        System.out.println(i);
                    }



                }



            }
        }
//===============================================================================


public class A {

public static void main (String [] args ){

int arr [] = {1,4,3,7}; 

     boolean [] b = new boolean[11];
     
     
     for (int i : arr){
         
         
         b[i]=true;
         
     }
     
     for (int i =0; i<=10; i++){
         
         if (b[i]!=true){
              System.out.println(i);
         }
        
         
     }

  }

}
//======================================



public class A {

public static void main (String [] args ) {



int[] baseArr = {4,6,7,3,2,8,9,10,1,5};

int arr [] = {7,4,8}; 


         
     for (int i  =0 ; i <baseArr.length;){
         
             for (int j  =0 ; j<arr.length;){
                 
        if (i<baseArr.length && baseArr[i]==arr[j]){
            
            
            i++;
            j=0;
        
             
        } else if (i<baseArr.length && baseArr[i]!= arr[j] && j == arr.length-1) {
            
            System.out.println(baseArr[i]);
            i++;
            j=0;
            
        }else {
            j++;
        }
        
     }

   }

 }
 
}
