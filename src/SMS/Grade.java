package SMS;

public class Grade {
	
	int sum,avg;
	
	public void total1(int s1,int s2,int s3,int s4,int s5,int s6,int s7)
	{
		sum=s1+s2+s3+s4+s5+s6+s7;
		avg=sum/7;
		System.out.print("Your Grade is ");
        if(avg>80)
        {
            System.out.println("A i.e Above80");
        }
        else if(avg>60 && avg<=80)
        {
            System.out.println("B i.e Between 60-80");
        }
        else if(avg>40 && avg<=60)
        {
            System.out.println("C i.e Between 40-60");
        }
        else
        {
            System.out.println("D i.e Below 40");
        }
	}
	public void total2(int s1,int s2,int s3,int s4,int s5,int s6,int s7,int s8)
	{
		sum=s1+s2+s3+s4+s5+s6+s7+s8;
		avg=sum/8;
		System.out.print("Your Grade is ");
        if(avg>80)
        {
            System.out.println("A i.e Above80");
        }
        else if(avg>60 && avg<=80)
        {
            System.out.println("B i.e Between 60-80");
        }
        else if(avg>40 && avg<=60)
        {
            System.out.println("C i.e Between 40-60");
        }
        else
        {
            System.out.println("D i.e Below 40");
        }
	}	
	public void total3(int s1,int s2,int s3,int s4,int s5)
	{
		sum=s1+s2+s3+s4+s5;
		avg=sum/5;
		System.out.print("Your Grade is ");
        if(avg>80)
        {
            System.out.println("A i.e Above80");
        }
        else if(avg>60 && avg<=80)
        {
            System.out.println("B i.e Between 60-80");
        }
        else if(avg>40 && avg<=60)
        {
            System.out.println("C i.e Between 40-60");
        }
        else
        {
            System.out.println("D i.e Below 40");
        }
	}
	
	//Groups formed for suggestion
	public int PrgmngLang(int s1, int s2, int s3, int s4, int s5, int s6, int s7, int s8,
			int s9, int s10, int s11, int s12, int s13, int s14, int s15, int s16, int s17)
	{
		sum=s1+s2+s3+s4+s5+s6+s7+s8+s9+s10+s11+s12+s13+s14+s15+s16+s17;
		return avg=sum/17;
	}
	public int MathSub(int s1,int s2,int s3,int s4,int s5,int s6,int s7)
	{
		sum=s1+s2+s3+s4+s5+s6+s7;
		return avg=sum/7;
	}
	public int EE(int s1,int s2,int s3,int s4,int s5,int s6,int s7,int s8,int s9,int s10)
	{
		sum=s1+s2+s3+s4+s5+s6+s7+s8+s9+s10;
		return avg=sum/10;
	}
	public int Network(int s1,int s2,int s3)
	{
		sum=s1+s2+s3;
		return avg=sum/3;
	}
}
