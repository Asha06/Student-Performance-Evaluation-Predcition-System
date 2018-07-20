package SMS;

public class Group extends Student{
	
	int sum;
	int avg1,avg2,avg3,avg4;
	
	private void PrgmngLang(int pC2, int pCLab2, int oOPS2, int dSLab2, int aDA2, int uNIX2, int aDALab2, int dBMS2,
			int dBMSLab2, int uSP2, int cD2, int cG2, int cGLab2, int uSPLab2, int pW2, int jAVA2, int webLab2)
	{
		sum=PC+PCLab+OOPS+DSLab+ADA+UNIX+ADALab+DBMS+DBMSLab+USP+CD+CG+CGLab+USPLab+PW+JAVA+WebLab;
		avg=sum/17;
	}
	public int MathSub()
	{
		sum=M1+M2+M3+M4+DMS+GT+OR;
		return avg=sum/7;
	}
	public int EE()
	{
		sum=ELE+ELC+EleCkt+LD+EcLdlab+CO+MP+MPLab+ECS+ACA;
		return avg=sum/10;
	}
	public int Network()
	{
		sum=CN1+CN2+NetwrkLab;
		return avg=sum/3;
	}
/*	public void Suggest1()
	{
		avg1=PrgmngLang();
		avg2=MathSub();
		avg3=EE();
		avg4=Network();
		System.out.println("here it is"+avg1+avg2+avg3+avg4);
	}   */
}
