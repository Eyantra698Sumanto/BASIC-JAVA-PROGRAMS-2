class Fibo extends Thread
{
private int x;
public int answer;

public Fibo(int x)
{
this.x=x;
}
public void run()
{
if (x<=2)
answer=1;
else
{
try
{
        Fibo f1=new Fibo(x-1);
        Fibo f2=new Fibo(x-2);
        f1.start();
        f2.start();
        f1.join();
        f2.join();
        answer=f1.answer+f2.answer;
}
        

catch(Exception e){}
}
}
}
