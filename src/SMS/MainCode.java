package SMS;

import java.util.Scanner;

public class MainCode{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student();
		Grade g=new Grade();
	//	Group gp= new Group();
		
		Scanner ch=new Scanner(System.in);
		int y,y1;
		System.out.println("ENTER BE MARKS");
		st.getSEM1();
		st.getSEM2();
		st.getSEM3();
		st.getSEM4();
		st.getSEM5();
		st.getSEM6();
		st.getSEM7();
		st.getSEM8();
		//GRADES
		System.out.println("To view your grades,PRESS 1");
		y=ch.nextInt();
		if(y==1)
		{
			st.ShowGrades();
		}	System.out.println();
		
		//Suggestion on bassis of Clusters
		System.out.println("=====SUGGESTION======");
		int avg1,avg2,avg3,avg4;
		avg1=st.Suggest1();
		avg2=st.Suggest2();
		avg3=st.Suggest3();
		avg4=st.Suggest4();
		if(avg1>avg2 && avg1>avg3 && avg1>avg4)
		{
			System.out.println("GOOD AT PROGRAMMING LANGUAGES");
		}
		else if(avg2>avg1 && avg2>avg3 && avg2>avg4)
		{
			System.out.println("GOOD AT MATHEMATICS");
		}
		else if(avg3>avg1 && avg3>avg2 && avg3>avg4)
		{
			System.out.println("GOOD AT ELECTRICAL/ELECTRONICS");
		}
		else
		{
			System.out.println("GOOD AT NETWORKS");
		}
	}
}
