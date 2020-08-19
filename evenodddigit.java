import java.util.Scanner;

public class evenodddigit {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int num=s.nextInt();
		int r,q,even,odd;
		if(num<0)
			q=-(num);
		else
			q=num;
		even=odd=r=0;
		
		while(q>0)
		{r=q%10;
		q=q/10;
		
		if(r%2==0)
			even=even+1;
		else
			odd=odd+1;
		}
		
		
	System.out.println("NUMBER IS:"+num);
	System.out.println("NUMBER OF EVEN DIGITS ARE:"+even);
	System.out.println("NUMBER OF ODD DIGITS ARE:"+odd);
	}

}
