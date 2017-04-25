package day0425;
public class NewString {
static void TongString(){
	String ss = "gfjsgadjkgaskjgvhjshfhfhsddkddddfd";
	char[] str1 =ss.toCharArray();
       int max =0;
       int he=0;
     for(int i=0;i<str1.length;i++){
		 int sum=0;
    	 for(int j=0;j<str1.length;j++){
    		 if(str1[i] == str1[j]){
    			 sum++;
    			if(sum>max) {
    			max=sum;
    	    	he=i;
    			}
    		 }
    	 }
     }
     System.out.println(max);
     System.out.println(str1[he]);
}

static void char01(){
	char a = 'a';
	char b = 'a';
	if(a==b){
		System.out.println("xiangdeng");
	}
	else{
		System.out.println("budeng");
	}
}

public static void main(String args[]){
	TongString();
	//char01();
}
}
