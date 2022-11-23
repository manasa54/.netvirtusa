import java.util.*;
class Emp{
    public static ArrayList<Integer> eid=new ArrayList();
public static    ArrayList<String> ename=new ArrayList();
public static    ArrayList<Double> esal=new ArrayList();;
public static    ArrayList<Long> emobilenum=new ArrayList();
 public static   ArrayList<String> email=new ArrayList();
public static   ArrayList<String> egender=new ArrayList();
public static   ArrayList<String> eaddress=new ArrayList();
public static   ArrayList<String> edob=new ArrayList();
public static   ArrayList<String> edoj=new ArrayList();
public static   ArrayList<Integer> eexp=new ArrayList();
    Scanner sc=new Scanner(System.in);
    public void adempdetails(){
        System.out.println("Enter id");
        eid.add(sc.nextInt());
        System.out.println("Enter name");
        ename.add(sc.next());
        System.out.println("Enter salary");
        esal.add(sc.nextDouble());
        System.out.println("Enter moblie number");
        emobilenum.add(sc.nextLong());
        System.out.println("Enter email");
        email.add(sc.next());
        System.out.println("Enter gender");
        egender.add(sc.next());
        System.out.println("Enter address");
        eaddress.add(sc.next());
        System.out.println("Enter date of birth");
        edob.add(sc.next());
        System.out.println("Enter date of joining");
        edoj.add(sc.next());
        System.out.println("Enter experience");
        eexp.add(sc.nextInt());
    }
    public void viewsingle(){
        System.out.println("Enter the ID to get details");
        int x=-1;
        int n=sc.nextInt();
        for(int i=0;i<eid.size();i++){
            if(n==eid.get(i)){
                x=i;
                break;
            }
    }
    if(eid.size()>0 && x>=0){
    System.out.println(n+" "+"name is "+ename.get(x));
    System.out.println(n+" "+"salary is "+esal.get(x));
    System.out.println(n+" "+"mobile number is "+emobilenum.get(x));
    System.out.println(n+" "+"mail id is "+email.get(x));
    System.out.println(n+" "+"gender is "+egender.get(x));
    System.out.println(n+" "+"address is "+eaddress.get(x));
    System.out.println(n+" "+"date of birth: "+edob.get(x));
    System.out.println(n+" "+"date of join: "+edoj.get(x));
    System.out.println(n+" "+"has experience of "+eexp.get(x)+" years");
}
else{
    System.out.println("Empty data");
}
}
public void allview(){
    int c=0;
    while(c<eid.size()){
        int n=eid.get(c);
    System.out.println("id: "+n);
    System.out.println(n+" "+"name is "+ename.get(c));
    System.out.println(n+" "+"salary is "+esal.get(c));
    System.out.println(n+" "+"mobile number is "+emobilenum.get(c));
    System.out.println(n+" "+"mail id is "+email.get(c));
    System.out.println(n+" "+"gender is "+egender.get(c));
    System.out.println(n+" "+"address is "+eaddress.get(c));
    System.out.println(n+" "+"date of birth: "+edob.get(c));
    System.out.println(n+" "+"date of join: "+edoj.get(c));
    System.out.println(n+" "+"has experience of "+eexp.get(c)+" years");
    System.out.println("------------------------------------------------------------------------------------");
    System.out.println("------------------------------------------------------------------------------------");
    c=c+1;
    }
}
public void update(){
    System.out.println("Enter the index u want to update");
    int i=sc.nextInt();
    System.out.println("id, name, sal, mnum, mail, gender, adrs, dob, doj, exp");
    System.out.println("Enter the thing that u want to update: ");
    String u=sc.next();
    switch(u){
        case "id": eid.set(i,sc.nextInt());
        System.out.println(" ID updated successfully");
        break;
        case "name": ename.set(i,sc.next());
        System.out.println(" name updated successfully");
        break;
        case "sal": esal.set(i,sc.nextDouble());
        System.out.println(" salary updated successfully");
        break;
        case "mnum": emobilenum.set(i,sc.nextLong());
        System.out.println(" mobile number updated successfully");
        break;
        case "mail": email.set(i,sc.next());
        System.out.println(" mail updated successfully");
        break;
        case "gender": egender.set(i,sc.next());
        System.out.println(" gender updated successfully");
        break;
        case "adrs": eaddress.set(i,sc.next());
        System.out.println(" address updated successfully");
        break;
        case "dob": edob.set(i,sc.next());
        System.out.println(" date of birth updated successfully");
        break;
        case "doj": edoj.set(i,sc.next());
        System.out.println(" date of join updated successfully");
        break;
        case "exp":eexp.set(i,sc.nextInt());
        System.out.println(" experience updated successfully");
        break;
        default:System.out.println("enter valid index and item to be updated");
        break;
        }
}
public void delete(){
    System.out.println("Enter the ID to be deleted");
    int x=sc.nextInt();
    int y=0;
    for(int i=0;i<eid.size();i++){
        if(x==eid.get(i)){
            y=i;
        }
    }
    eid.remove(y);
    ename.remove(y);
    esal.remove(y);
    emobilenum.remove(y);
    email.remove(y);
    egender.remove(y);
    eaddress.remove(y);
    edob.remove(y);
    edoj.remove(y);
    eexp.remove(y);
}
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int choice=0;
	    Emp ob=new Emp();
	    System.out.println("please enter your choice");
	    choice=sc.nextInt();
	    while(choice<6){
	    if(choice==1){
	        ob.adempdetails();
	        System.out.println("Employee Details added successfully.");
	    }
	    else if(choice==2){
	        ob.viewsingle();
	    }
	    else if(choice==3){
	        ob.allview();
	    }
	    else if(choice==4){
	        ob.update();
	    }
	    else{
	        ob.delete();
	    }
	    System.out.println("Enter your choice: ");
	    choice=sc.nextInt();
	    }
	}
}