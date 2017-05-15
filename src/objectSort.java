class Person {
   private String lastName;
   private String firstName;
   private int age;
   
   public Person(String last, String first, int a) {                      
      lastName = last;
      firstName = first;
      age = a;
   }
   
   public void displayPerson() {
      System.out.print("   Last name: " + lastName);
      System.out.print(", First name: " + firstName);
      System.out.println(", Age: " + age);
   }
   
   public String getLast() { 
	   return lastName;
   }
} 

class ArrayInOb {
	
   private Person[] a;              
   private int nElems;               

   public ArrayInOb(int max) {
      a = new Person[max];              
      nElems = 0;                        
   }
   
   public void insert(String last, String first, int age) {
      a[nElems] = new Person(last, first, age);
      nElems++;                      
   }

   public void display() {
      for(int j=0; j<nElems; j++)       
         a[j].displayPerson();
   }

   public void insertionSort() {
      int in, out;

      for(out=1; out<nElems; out++) {
         Person temp = a[out];       
         in = out;                   

         while(in>0 && a[in-1].getLast().compareTo(temp.getLast())>0) {
            a[in] = a[in-1];         
            in--;
         }
         a[in] = temp;
      }  
   }  
}

class ObjectSortApp {
   public static void main(String[] args) {
      int maxSize = 100;             
      ArrayInOb arr;
      arr = new ArrayInOb(maxSize);

      arr.insert("aj", "Messi", 24);
      arr.insert("Sack", "Stone", 59);
      arr.insert("Black", "Emma", 37);
      arr.insert("Jellow", "Serena", 37);
      arr.insert("Meep", "Amanda", 43);
      arr.insert("Phone", "Andy", 21);
      arr.insert("Tony", "Dwight", 29);
      arr.insert("Rodriguez", "Kevin", 72);
      arr.insert("Buxton", "Mindy", 22);
      arr.insert("Crosby", "Brock", 18);

      System.out.println("Before sorting:");
      arr.display();                 

      arr.insertionSort(); 

      System.out.println("After sorting:");
      arr.display();
   } 
}
