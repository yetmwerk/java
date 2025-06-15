/*Abush Bayelign id 1601488 
  Yetmwerk Muluneh id 1601743*/


class Course{
String cid;
String coursename;
int credit;
String pid;
}
public void getCourse(String cid,String coursename,int credit,String pid){
    System.out.println("id"+cid,"cname"+coursename,"credit"+credit,"pid"+pid);

}
public void SetCourse("cl","java",5,"p1"){
 this.cid = cl;
 this.courseName = java;
 this.credit = 5;
 this.pid = p1;

} 
class Student{
String sid;
String name;
String degree;
String year;
}
public void getStudent(String a,String b,String c,String d){
    sid = a;
    name = b;
    degree = c;
    year = d;
public void SetStudent(String sid,String name,String degree,String year){
this.sid=sid;
this.name=name;
this.degree=degree;
this.year=year;
}public class SetStudent{
public static void main(String[] args) {
  getStudent ob1=new getStudent(); 
 ob1.getStudent("dbu123","java",5,"p1") ; 
System.out.println("sid:"+ob1.sid,"name:"+ob1.name,"degree:"+ob1.degree,"year:"+ob1.year);
ob1.SetStudent();
System.out.println("after update");
SetStudent ob2=new SetStudent();
System.out.println("sid:"+ob2.sid,"name:"+ob2.name,"degree:"+ob2.degree,"year:"+ob2.year);
}}