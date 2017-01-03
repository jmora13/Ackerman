
public class Ackerman {
	public static int Ackerman(int m, int n){
		if(m==0){
			return n+1;
		} else if(n == 0){
			return Ackerman(m-1,1);
		} else {
			return Ackerman(m-1,Ackerman(m,n-1));
		}
	}
	public static void main(String[] args){
		System.out.println(Ackerman(0,0));
		System.out.println(Ackerman(0,1));
		System.out.println(Ackerman(1,1));
		System.out.println(Ackerman(1,2));
		System.out.println(Ackerman(1,3));
		System.out.println(Ackerman(2,2));
		System.out.println(Ackerman(3,2));
		System.out.println(Ackerman(3,3));
		System.out.println(Ackerman(3,4));
	}

}
