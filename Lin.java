public class Lin{
	public void draw(int size){
		size = 3;
		/**           3  2  1  0
		   3@@@*      1  3  5  7  5  3  1
		   2@@*@*
		   1@*@@@*
		   0*@@@@@*
		  -1@*@@@*
		  -2@@*@*
		  -3@@@*
		**/
		//ÿ��*������2*size+1
		int width = 2*size+1;
		for(int i = size;i >= -size;i--){
			//��ӡ@
			//ȡ����ֵ
			int i = Math.abs(i);
            for(int j=1;j<=i;j++){
				System.out.print("@");
			}
			//��ӡ*
			for(int j=1;j<=(width-2*i);j++){
				if(j==1||j==(width-2*i)){
                    System.out.print("*");
				}else{
					System.out.print("@");
				}
			}
			//����
			System.out.println();
		}

	}

	public void static main(String[] args){
		Lin l = new Lin();
		l.draw(3);
	}
}