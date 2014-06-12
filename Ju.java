import java.util.*;
class Ju
{
	public void cj(){
		for(int j=1;j<=9;j++){
            
			for(int i=1;i<=j;i++){
		
				System.out.print(i+"*"+j+"="+(i*j));
				System.out.print("\t");
			}
			System.out.println();
	    }
	}

	public static void main(String[] args){
         Ju p1=new Ju();
		 
         p1.cj();
	 }

}
