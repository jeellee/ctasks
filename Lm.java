public class Lm{
	public static void main(String[] args){   

		int lay=4;//层数

		for(int i=1;i<=lay*2-1;i++){
                if(i<=lay){
						for(int k=1;k<=lay-i;k++){//显示空格
			
							System.out.print(" ");

						}

						for(int j=1;j<=2*i-1;j++){//显示*

							 if(i==1||i==lay){//判断是否是第一层或最后一层

								System.out.print("*");

							 }else if(j==1||j==2*i-1){//判断是否是第一个或最后一个*

								System.out.print("*");

							 }else{  

								System.out.print(" ");

							 }
						}
				}else{//画下半部分的空格
						for(int k=1;k<=i-lay;k++){

							System.out.print(" ");

						}
						//画下半部分的* 2*(5-4+1)+1=5
						for(int j=1;j<=2*(i-lay)-1;j++){//显示*

								 if(j==1||j==3*lay-1-i){//判断是否是第一个或最后一个*

									System.out.print("*");

								 }else{  

									System.out.print(" ");

								 }
						}

				}

				System.out.println();//回车
		}
	
	}
}