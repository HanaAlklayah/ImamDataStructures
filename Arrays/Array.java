
   class Array{
    
    private int[] data;
    private int counter;
    
    public Array(){

    data = new int[10];
    counter=0;

}//end of const
    


 public boolean  isEmpty(){

	    return counter==0;
}//end of isEmpty


public int size(){

return counter;

}//end if size method

//append the passed element to the array
  public void add(int element)  {

   if(counter==data.length){
   System.out.println("Array is Full !");
 

}
    else
    data[counter++]=element;

}//end of add 
	

  public  void add(int element , int index){

       
    
     for(int i = data.length-2 ; i>=index; i--){

     data[i+1] =data[i];
}//end for


data[index]=element;
counter++;
}//end of add  

public  int search(int key){

     for(int i=0;   i<data.length; i++){

    if(key == data[i])
     return i;

 }//end for

  return -1;
}  


public int remove(int element){

     int index= search(element);
      
     if(index==-1)
     return -1;
     
    //the item is found !  
    for(int  i = index;  i<counter-1 ; i++){
      data[i] = data[i+1];

}//end for


//update the counter
counter--;

return element;


}//end of remove method

 
@Override
public String toString(){

  String str = "[";

   for(int i =0; i<counter; i++){
       
       int item = data[i];

          if(i==counter-1) {
             str+=item;
            str+="]";
}
         else
          str+=item+",";
}//end for 



return str;
}//end of toString method



public void  printDetails(){

for(int i=0; i<data.length;i++){

System.out.println(i +" : "+data[i]);
}

}

}//end class























