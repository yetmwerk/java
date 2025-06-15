import java.util.Scanner;
public class Studentinfo{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
System.out.println("Enter detail information for student 1: ");
System.out.println("Enter the name: ");
String name1= Sc.next();
System.out.println("Enter the id: ");
String id1= Sc.next();
System.out.println("Enter the mark_score: ");
int mark1= Sc.nextInt();

System.out.println("Enter detail information for student 2: ");
System.out.println("Enter the name: ");
String name2= Sc.next();
System.out.println("Enter the id: ");
String id2= Sc.next();
System.out.println("Enter the mark_score: ");
int mark2= Sc.nextInt();

if (mark1 > mark2){
System.out.println("the student information:");
System.out.println("the highest score is :" + name1);
System.out.println("the lowest  score is :" + name2);}

if (mark2 > mark1){
System.out.println("the student information:");
System.out.println("the highest score is :" + name2);
System.out.println("the lowest  score is :" + name1);}

if(mark1 == mark2){
System.out.println("the student information:");
System.out.println("the two student are equally  score" );}
}}
