package SMS;

import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Student extends Grade{
	/*
	//Basic info
		private String susn;
		private String sname;
		private String sdept;
		
		//10th Marks
		private int Lang1,Lang2,Lang3,Science,Social,Maths;
		//PUC Marks
		private int Lan1,Lan2,P,Ch,M,C,PhyLab,ChemLab,CLab;
		*/
	// create a script engine manager
    ScriptEngineManager factory = new ScriptEngineManager();
    
    // create JavaScript engine
    ScriptEngine engine = factory.getEngineByName("SMS");
    engine.eval("println ('Hello! JavaScript executed from a Java program.')");
    
		//BE variables
		//SEM 1
		 int Chem,M1,ELE,PC,CAED,PCLab,CheLab;
		//SEM 2
		 int Ph,M2,ELC,EME,Civil,PhLab,WorkshpLab;
		//SEM 3
		 int EleCkt,M3,LD,DMS,DS,OOPS,DSLab,EcLdlab;
		//SEM 4
		 int M4,GT,ADA,UNIX,MP,CO,ADALab,MPLab;
		//SEM 5
		 int SE,SS,OS,DBMS,CN1,FLAT,DBMSLab,SSLab;
		//SEM 6
		 int ME,USP,CD,CN2,CG,OR,CGLab,USPLab;
		//SEM 7
		 int OOMD,ECS,PW,ACA,JAVA,SAN,NetwrkLab,WebLab;
		//SEM 8
		 int SA,SMM,NetMgmt,ST,PRJT;
		
		Scanner in= new Scanner(System.in);
		public void getSEM1()
		{
			System.out.println("===Enter SEM 1 MARKS===");
			System.out.println("MATHS 1= ");
			M1=in.nextInt();
			System.out.println("CHEMISTRY= ");
			Chem=in.nextInt();
			System.out.println("ELECTRONIC= ");
			ELE=in.nextInt();
			System.out.println("PROGRAMMING IN C= ");
			PC=in.nextInt();
			System.out.println("CAED= ");
			CAED=in.nextInt();
			System.out.println("CHEMISTRY LAB= ");
			CheLab=in.nextInt();
			System.out.println("PROGRAMMING IN C LAB= ");
			PCLab=in.nextInt();
			
		}
		public void getSEM2()
		{   
			System.out.println("===Enter SEM 2 MARKS===");
			System.out.println("MATHS 2= ");
			M2=in.nextInt();
			System.out.println("PHYSICS= ");
			Ph=in.nextInt();
			System.out.println("ELECTRICAL= ");
			ELC=in.nextInt();
			System.out.println("Elements Of MECHANICAL= ");
			EME=in.nextInt();
			System.out.println("CIVIL= ");
			Civil=in.nextInt();
			System.out.println("PHYSICS LAB= ");
			PhLab=in.nextInt();
			System.out.println("WORKSHOP LAB= ");
			WorkshpLab=in.nextInt();
			
		}
		public void getSEM3()
		{	
			System.out.println("===Enter SEM 3 MARKS===");
			System.out.println("M3= ");
			M3=in.nextInt();
			System.out.println("ELECTRONIC CIRCUITS= ");
			EleCkt=in.nextInt();
			System.out.println("LOGIC DESIGN= ");
			LD=in.nextInt();
			System.out.println("DMS= ");
			DMS=in.nextInt();
			System.out.println("DATA STRUCTURES= ");
			DS=in.nextInt();
			System.out.println("OOPS= ");
			OOPS=in.nextInt();
			System.out.println("DS LAB= ");
			DSLab=in.nextInt();
			System.out.println("EC & LD LAB= ");
			EcLdlab=in.nextInt();
			
		}
		public void getSEM4()
		{	
			System.out.println("===Enter SEM 4 MARKS===");
			System.out.println("M4= ");
			M4=in.nextInt();
			System.out.println("GRAPH THEORY= ");
			GT=in.nextInt();
			System.out.println("ADA= ");
			ADA=in.nextInt();
			System.out.println("UNIX= ");
			UNIX=in.nextInt();
			System.out.println("MICRPROCESSOR= ");
			MP=in.nextInt();
			System.out.println("COMPUTER ORGANISATION= ");
			CO=in.nextInt();
			System.out.println("ADA LAB= ");
			DSLab=in.nextInt();
			System.out.println("MP LAB= ");
			MPLab=in.nextInt();
			
		}
		public void getSEM5()
		{	
			System.out.println("===Enter SEM 5 MARKS===");
			System.out.println("SOFTWARE ENGINEERING= ");
			SE=in.nextInt();
			System.out.println("SYSTEM SOFTWARE= ");
			SS=in.nextInt();
			System.out.println("OPERATING SYSTEM= ");
			OS=in.nextInt();
			System.out.println("DBMS= ");
			DBMS=in.nextInt();
			System.out.println("COMPUTER NETWORK 1= ");
			CN1=in.nextInt();
			System.out.println("FLAT= ");
			FLAT=in.nextInt();
			System.out.println("DBMS LAB= ");
			DBMSLab=in.nextInt();
			System.out.println("SS LAB= ");
			SSLab=in.nextInt();
			
		}
		public void getSEM6()
		{	
			System.out.println("===Enter SEM 6 MARKS===");
			System.out.println("ME= ");
			ME=in.nextInt();
			System.out.println("USP= ");
			USP=in.nextInt();
			System.out.println("COMPILER DESIGN= ");
			CD=in.nextInt();
			System.out.println("COMPUTER NETWORK 2= ");
			CN2=in.nextInt();
			System.out.println("COMPUTER GRAPHICS= ");
			CG=in.nextInt();
			System.out.println("OPERATIONAL RESERCH= ");
			OR=in.nextInt();
			System.out.println("CG LAB= ");
			CGLab=in.nextInt();
			System.out.println("USP LAB= ");
			USPLab=in.nextInt();
			
		}
		public void getSEM7()
		{	
			System.out.println("===Enter SEM 7 MARKS===");
			System.out.println("OOMD= ");
			OOMD=in.nextInt();
			System.out.println("Eembedded Computing System= ");
			ECS=in.nextInt();
			System.out.println("PROGRAMMING in WEB= ");
			PW=in.nextInt();
			System.out.println("ACA= ");
			ACA=in.nextInt();
			System.out.println("JAVA= ");
			JAVA=in.nextInt();
			System.out.println("SAN= ");
			SAN=in.nextInt();
			System.out.println("Networks LAB= ");
			NetwrkLab=in.nextInt();
			System.out.println("WEB LAB= ");
			WebLab=in.nextInt();
			
		}
		public void getSEM8()
		{	
			System.out.println("===Enter SEM 8 MARKS===");
			System.out.println("SOFTWARE ARCH= ");
			SA=in.nextInt();
			System.out.println("System Modeling and Design= ");
			SMM=in.nextInt();
			System.out.println("Network Manangement= ");
			NetMgmt=in.nextInt();
			System.out.println("SOFTWARE TESTING= ");
			ST=in.nextInt();
			System.out.println("PROJECT MARKS= ");
			PRJT=in.nextInt();
			
		}
		public void ShowGrades()
		{
			//calculating Grade
			System.out.println("SEM 1");
			total1(M1,Chem,ELE,PC,CAED,PCLab,CheLab);
			System.out.println("SEM 2");
			total1(M2,Ph,ELC,EME,Civil,PhLab,WorkshpLab);
			System.out.println("SEM 3");
			total2(M3,EleCkt,LD,DMS,DS,OOPS,DSLab,EcLdlab);
			System.out.println("SEM 4");
			total2(M4,GT,ADA,UNIX,MP,CO,ADALab,MPLab);
			System.out.println("SEM 5");
			total2(SE,SS,OS,DBMS,CN1,FLAT,DBMSLab,SSLab);
			System.out.println("SEM 6");
			total2(ME,USP,CD,CN2,CG,OR,CGLab,USPLab);
			System.out.println("SEM 7");
			total2(OOMD,ECS,PW,ACA,JAVA,SAN,NetwrkLab,WebLab);
			System.out.println("SEM 8");
			total3(SA,SMM,NetMgmt,ST,PRJT);
			
		}
		
		//for Suggesting groups
		public int Suggest1()
		{
			return PrgmngLang(PC,PCLab,OOPS,DSLab,ADA,UNIX,ADALab,DBMS,DBMSLab,USP,CD,CG,CGLab,USPLab,PW,JAVA,WebLab);
		}
		public int Suggest2()
		{
			return MathSub(M1,M2,M3,M4,DMS,GT,OR);
		}
		public int Suggest3()
		{
			return EE(ELE,ELC,EleCkt,LD,EcLdlab,CO,MP,MPLab,ECS,ACA);
		}
		public int Suggest4()
		{
			return Network(CN1,CN2,NetwrkLab);
		}
}
