package day0425;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MoHu {
  static ArrayList<String> a1 = new ArrayList<String>();

static void add(){
	a1.add("���");
	a1.add("h����");
	a1.add("���ú�");
	a1.add("��˭");
	a1.add("���˭");
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
  add(); //����
  //select(a1); //��ͨ��ѯ������һ�����ϼ���
  
  ArrayList<String> res =search(a1, "˭");  //ģ����ѯ������li����ƥ��
  select(res);
  
// set(a1,0,"haha");         //�޸�
// select(a1);
  
//  delete(a1,0);            //ɾ��
//  select(a1);
  
}
}