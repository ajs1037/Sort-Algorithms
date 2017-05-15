class ArrayBub {
   private long[] a; 
   private int nElems; 

   public ArrayBub(int max) {
      a = new long[max];                
      nElems = 0;
   }

   public void insert(long value) {
      a[nElems] = value;
      nElems++;
   }

   public void display() {
      for(int j=0; j<nElems; j++) {
         System.out.print(a[j] + " ");
      }
      System.out.println("");
   }

   public void bubbleSort() {
      int out, in;

      for(out=nElems-1; out>1; out--) 
         for(in=0; in<out; in++)     
            if( a[in] > a[in+1] )     
               swap(in, in+1);
   }  
   
   private void swap(int one, int two) {
      long temp = a[one];
      a[one] = a[two];
      a[two] = temp;
   }
}
class BubbleSortApp {
   public static void main(String[] args) {
      int maxSize = 100;            
      ArrayBub arr;                 
      arr = new ArrayBub(maxSize); 

      arr.insert(10);
      arr.insert(90);
      arr.insert(20);
      arr.insert(30);
      arr.insert(40);
      arr.insert(50);
      arr.insert(65);
      arr.insert(87);
      arr.insert(43);
      arr.insert(99);

      arr.display();                

      arr.bubbleSort();             

      arr.display();               
   }  
}
