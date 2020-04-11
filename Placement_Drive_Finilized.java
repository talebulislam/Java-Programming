import java.util.ArrayList; 
import java.util.Scanner; 

/*
	Code by:- Talebul islam 
	Email :- talifanwarkhan@gmail.com
*/

class Placement_Drive 
{
	Scanner sc = new Scanner(System.in);
	
	//Please increse the n value According to Number of Student
	//if you want to put Number of Student = 5 than n = 5
	static int n = 5;
    class Data 
    {  
        String name;
		String course;
		long reg_no;
		float cgpa;
		boolean status;
		
        Data(String name,String course, long reg_no, float cgpa,boolean status) 
        { 
            this.name = name;
			this.course = course;
            this.reg_no = reg_no; 
			this.cgpa = cgpa;
			this.status = status;
        } 
    } 
  
    public static void main(String args[]) 
    { 
	   Scanner sc = new Scanner(System.in);

       String f_course;
	   float f_cgpa;
	   
	   //Input of Student Details..
	   
	   //Dynamic Input
	   
	   /*String name[] = new String[n];
	   String course[] = new String[n];
	   long reg_no[] = new long[n];
	   float cgpa[] = new float[n];
	   boolean status[] = new boolean[n];
	   
	   int no = 0;
	   for(int i = 0;i<n;i++)
	   {
		   no++;
		   System.out.println("\nEnter the Details of Student "+no);
		   System.out.println("Enter the Name ");
		   name[i] = sc.next();
		   System.out.println("Enter the Course Name ");
		   course [i] = sc.next();
		   System.out.println("Enter the Registration Number ");
		   reg_no[i] = sc.nextLong();
		   System.out.println("Enter the Cgpa ");
		   cgpa[i] = sc.nextFloat();
		   System.out.println("Enter the Placement Status True/False");
		   status[i] = sc.nextBoolean();
	   }*/
	   
	   //static input....
       String name[] = {"Ujjwal Kumar", "Rahat Khan", "Talib Khan", "Aszad Khan","Ram kumar"}; 
       String course[] = {"Btech", "Mtech", "Btech", "MBA","Btech"}; 
       long reg_no[] = {1190, 8999, 14499, 5000,18990}; 
       float cgpa[] = {7.45f, 6.56f, 7.55f,8.77f,6.89f};
	   boolean status[] = {true,false,true,true,true}; 
	   
  
       
        Placement_Drive custom = new Placement_Drive(); 
  
        ArrayList<Data> list=new ArrayList<>();
        custom.addValues(list,name, course, reg_no, cgpa,status);
		f_course = args[0];
		f_cgpa = Float.parseFloat(args[1]);
        custom.getMobiles(list,f_course,f_cgpa); 
    } 
  
	// For Adding the Value in ArrayList
  
    void addValues(ArrayList<Data> list,String name[], String course[], long reg_no[], float cgpa[],boolean status[]) 
    {
        for (int i = 0; i < n; i++) 
        {   
            list.add(new Data(name[i], course[i], reg_no[i], cgpa[i], status[i])); 
        } 
    } 
  
	// Display The Details of Student According to Conditions
  
    void getMobiles(ArrayList<Data> list,String f_course, float f_cgpa) 
    { 
		int count = 0,f = 0;
		String c[] = {"Btech","MBA","Mtech"};
		for (int j = 0; j < c.length; j++)
		{
			if(c[j].equals(f_course))
			{
				for (int i = 0; i < n; i++) 
				{
					Data data = list.get(i);
					if(data.cgpa>=f_cgpa && data.course.equals(f_course))
					{
						count++;
						System.out.println("\n"+count+". Name : "+data.name+" Course_Name : "+data.course+" Registration : "+data.reg_no+" CGPA : "+data.cgpa+" Placemant Status : "+data.status); 
						
						
					}
					else if(count <=0 && i == n-1)
					{
						System.out.println("\nThere is No one  Eligible For Placement_Drive ");
						f++;
						break;
					}
				}
				if(count > 0)
				{
					System.out.println("\nThe Total Number_of_Student Eligible for Placemant = > "+count);
					break;
				}
			}
			else if(j ==c.length-1 && count <=0 && f<1)
			{
				System.out.println("\nPlease Enter the Course_Name Btech/MBA/Mtech");
				break;
			}
		}
    } 
} 