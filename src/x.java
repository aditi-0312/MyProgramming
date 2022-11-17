
public class x {

	public static void main(String[] args) {
		int N=22;
		
		if(N%2!=0){
            System.out.println("weird");
        }else if(N%2==0 && N>=2&&N<=5){
            System.out.println("not weird");
        }else if(N%2==0 && N>=6&&N<=20) {
        	System.out.println("weird");
        }else{
        	System.out.println("not weird");
        }
		
	}

}
