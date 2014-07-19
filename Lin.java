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
		//每行*个数：2*size+1
		int width = 2*size+1;
		for(int i = size;i >= -size;i--){
			//打印@
			//取绝对值
			int i = Math.abs(i);
            for(int j=1;j<=i;j++){
				System.out.print("@");
			}
			//打印*
			for(int j=1;j<=(width-2*i);j++){
				if(j==1||j==(width-2*i)){
                    System.out.print("*");
				}else{
					System.out.print("@");
				}
			}
			//换行
			System.out.println();
		}

	}

	public void static main(String[] args){
		Lin l = new Lin();
		l.draw(3);
	}
}