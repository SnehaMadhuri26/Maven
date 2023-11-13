
public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		Intro t=new Intro();
		System.out.println(t.Sum(8, 3));
		System.out.println(t.Multiplication(4, 60));
		t.birthDayWishing("Sneha Madhuri");
		
t.birthDayWishing();
	}
	public int Sum(int a, int b) {
		int result;
		return a+b;
		
	}
	public int Multiplication(int a, int b) {
		int result=a*b;
		return result;
	}
public void birthDayWishing(String a)
{
System.out.printf(a+" Happy Birthday!, May god bless you, do your best."+" ");
}
public void birthDayWishing()
{
System.out.printf(" Happy Birthday!, May god bless you, do your best."+" ");
}
}
