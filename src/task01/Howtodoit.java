package task01;

public class Howtodoit {
	public static void main(String[] args) {
		Thread t1 = new Thread()	
		{
			public void run()
			{
				while(true){
					System.out.println("z");
					try{
						Thread.sleep(500);
					}catch (Exception e)
					{
						e.printStackTrace();
					}
				}
			}
	};
	t1.start();
	}
}
