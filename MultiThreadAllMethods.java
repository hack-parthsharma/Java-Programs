
public class MultiThreadinAllMethods {

	public static void main(String[] args) {
		Thread t1=Thread.currentThread();
		System.out.println("default Thread is "+t1);
        t1.setName("Omprakash");
		System.out.println("modified Thread is "+t1);
		Thread.State ts=t1.getState();
		System.out.println("defalut State "+ts);
		ThreadGroup tg=t1.getThreadGroup();
		System.out.println("ThreadGruop is "+tg);
		ThreadGroup tgp=tg.getParent();
		System.out.println("parent thread Group tg "+tgp);
		Thread t=new Thread();
		System.out.println("defaut name of prog created is "+t.getName());
	    System.out.println("State name of t1 "+t.getState());
	    System.out.println("value of max pri "+Thread.MAX_PRIORITY);
	    System.out.println("value of norm pri "+Thread.NORM_PRIORITY);
	    System.out.println("value of min pri "+Thread.MIN_PRIORITY);
	}

}

