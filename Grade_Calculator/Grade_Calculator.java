import java.util.Scanner;
public class Grade_Calculator{
    
	    public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
	        int n;
	        System.out.println("**Enter The Total No of Subject That Is To Be Calculated**");
            System.out.println("----------------------------------------------------------");
	        n=s.nextInt();
	        double arr[]=new double[n];
	        for(int i=0;i<n;i++){

	            System.out.println("||--Enter The Marks In "+(i+1)+" Subject Out of 100--||\n==>>");
	            arr[i]=s.nextDouble();
	        }
	    int len=arr.length;
	    System.out.println("-------------------------------------------------------------------");
	    System.out.println("\nStudent Total Marks Are In All "+len+" Subject Is \n ||==>> "+Sum_of(arr)+" Out of "+len*100) ;
	    System.out.println("\nAverage Percentage Of Student Is \n ||==>> "+Average(Sum_of(arr),len )+" %");
	    Grade(Average(Sum_of(arr),len ));
	    }
	    
	 public static double Sum_of( double[] arry) {
		 double sum=0;
		 for (double value:arry) {
		 sum+=value;
		 } 
		return sum; 
	 }	    
	 public static double Average(double Sum,int Len) {
		 double Aver=Sum/Len;
		 return Aver;
	 }
	 public static String Grade(double gav) {
		 String grade;
		 if(gav>80) {
			 grade="A";}
		 else if(gav>60 && gav<80) {
			 
			 grade="B";}
		 else if(gav>40 && gav<60) {
			 grade="c";}
		 else 
			 grade="D";
		 
	 System.out.println("\nStudent Grade According To Their Percantage Is \n ||==> "+grade);
	 return null;
	}		 
	 
 }




