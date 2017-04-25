package day0425;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MoHu {
  static ArrayList<String> a1 = new ArrayList<String>();

static void add(){
	a1.add("你好");
	a1.add("h好人");
	a1.add("不好好");
	a1.add("是谁");
	a1.add("你和谁");
	a1.add("hehe");
}
static void select(ArrayList<String> list){
for(int i=0;i<list.size();i++){
	System.out.println(list.get(i));
}	
}

public static ArrayList<String> search(ArrayList<String> list,String name){
	ArrayList<String> results = new ArrayList<String>();
	  Pattern pattern = Pattern.compile(name);
	  for(int i=0; i < a1.size(); i++){
	  Matcher matcher = pattern.matcher((a1.get(i)));
	     if(matcher.find()){   
	         results.add(list.get(i));
	     }
	  }
	     return results;
}
public static void set(ArrayList<String> list,int a,String name){
	list.set(a, name);
}
public static void delete(ArrayList<String> list,int a){
	list.remove(a);
}


public static void main(String args[]){
  add(); //增加
  //select(a1); //普通查询，放入一个集合即可
  
  ArrayList<String> res =search(a1, "谁");  //模糊查询，输入li进行匹配
  select(res);
  
// set(a1,0,"haha");         //修改
// select(a1);
  
//  delete(a1,0);            //删除
//  select(a1);
  
}
}