public class Lm{
	public static void main(String[] args){   

		int lay=4;//����

		for(int i=1;i<=lay*2-1;i++){
                if(i<=lay){
						for(int k=1;k<=lay-i;k++){//��ʾ�ո�
			
							System.out.print(" ");

						}

						for(int j=1;j<=2*i-1;j++){//��ʾ*

							 if(i==1||i==lay){//�ж��Ƿ��ǵ�һ������һ��

								System.out.print("*");

							 }else if(j==1||j==2*i-1){//�ж��Ƿ��ǵ�һ�������һ��*

								System.out.print("*");

							 }else{  

								System.out.print(" ");

							 }
						}
				}else{//���°벿�ֵĿո�
						for(int k=1;k<=i-lay;k++){

							System.out.print(" ");

						}
						//���°벿�ֵ�* 2*(5-4+1)+1=5
						for(int j=1;j<=2*(i-lay)-1;j++){//��ʾ*

								 if(j==1||j==3*lay-1-i){//�ж��Ƿ��ǵ�һ�������һ��*

									System.out.print("*");

								 }else{  

									System.out.print(" ");

								 }
						}

				}

				System.out.println();//�س�
		}
	
	}
}