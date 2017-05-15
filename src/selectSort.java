class ArraySel {
	
   private long[] a;                 
   private int nElems;

   public ArraySel(int max) {
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

   public void selectionSort() {
      int out, in, min;

      for(out=0; out<nElems-1; out++) {
         min = out;                     
         for(in=out+1; in<nElems; in++) {
            if(a[in] < a[min]) {         
                min = in;
            }
           swap(out, min);
         }
      }  
    } 

   private void swap(int one, int two) {
      long temp = a[one];
      a[one] = a[two];
      a[two] = temp;
   }
}

class SelectSortApp {
   public static void main(String[] args) {
      int maxSize = 100;            
      ArraySel arr;                
      arr = new ArraySel(maxSize);  

      arr.insert(22);               
      arr.insert(41);
      arr.insert(54);
      arr.insert(60);
      arr.insert(23);
      arr.insert(84);
      arr.insert(16);
      arr.insert(04);
      arr.insert(98);
      arr.insert(97);

      arr.display();               

      arr.selectionSort();         

      arr.display();               
   }  
}
