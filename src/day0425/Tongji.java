package day0425;

public class Tongji {
 static void sum(){ 
	 for(int i=1;i<=9;i++){
		 for(int j=1;j<=i;j++){
			 System.out.print(j + "*" +i+"="+i*j+"\t");
		 }
	 System.out.println();
	} 
 }
 static void sum2(){
	 int i=1;
	 while(i<=9){
		 int j=1;
		 while(j<=i){  //j<=i 虽然j和i一起增长这么做只是保证j每次都是一个值
			 System.out.print(j + "*" +i+"="+j*i+"\t");
			 j++; 
		 }
		     i++;   
		     System.out.println();
	 }	  
 }
 public static void main(String args[]){
	 //sum();
	 sum2();
 }
}
