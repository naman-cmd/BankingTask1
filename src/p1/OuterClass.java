package p1;

class OuterClass 
{
	int x=10;
	
	class InnerClass
	{
		int y=5;
	}
}

class MainClass1
{
	public static void main(String[] args) 
	{
		OuterClass out = new OuterClass();
		OuterClass.InnerClass in = out.new InnerClass();
		
		System.out.println(out.x);
		System.out.println(in.y);
		
	}
}