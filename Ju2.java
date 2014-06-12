import java.util.*;
class Ju
{
	public void cj(int a){
		for(int j=1;j<=a;j++){
			for(int i=1;i<=9;i++){
		
				System.out.println(i+"*"+j+"="+(i*j));
			}
	    }
	}

}

public class Ju2{
	public static void main(String[] args){
         Ju p1=new Ju();
		 Scanner input = new Scanner(System.in);
		 System.out.println("ÇëÊäÈë³ËÊý£º");
		 int a = input.nextInt();
         p1.cj(a);
	 }

}