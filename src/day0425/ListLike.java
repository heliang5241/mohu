package day0425;

import java.util.ArrayList;
import java.util.List;

public class ListLike {

	//����Ա����
	public class Employee {
	private String name;
	private int age;
	public int getAge() {
	return age;
	}
	public void setAge(int age) {
	this.age = age;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	}

	public List list=new ArrayList();

	//����Ա��
	public List addList(String name,int age){
	Employee employee1 = new Employee();
	employee1.setName(name);
	employee1.setAge(age);
	list.add(employee1);
	return list;
	}

	//��ʾ����Ա��
	public void ShowList(){
	for(int i=0;i<list.size();i++){
	System.out.println(((Employee)(list.get(i))).getName()+" "+((Employee)(list.get(i))).getAge());
	}
	}

	//ģ����ѯ
	public List likeString(String likename){
	for(int i=0;i<list.size();i++){
	if(((Employee)(list.get(i))).getName().indexOf(likename)<=-1)
	list.remove(i);
	}
	return list;

	}

	public static void main(String arg[]){
	ListLike ll=new ListLike();
	ll.addList("wuxiao",13);
	ll.addList("wangwang",11);
	ll.addList("wanghua",12);
	ll.addList("xiaowang",13);
	ll.addList("xiaoxiao",13);

	ll.likeString("wang");
	ll.ShowList();


	}

	}