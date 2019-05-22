import java.util.Scanner;

public class solution {

	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        
         int cost=0, maxC=-1;
     
        for (int i=0;i<keyboards.length;i++)
        {
            for (int j=0; j<drives.length;j++)
            {
                cost =keyboards[i] + drives[j];
                if (cost <= b)
                {
                    if (maxC < cost)
                    {
                        maxC=cost;
                    }
                }
            }
        }

        return maxC;
    }
    private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Budget, # of keyboard's models, # of USB models: ");

        int amount = scanner.nextInt();
		System.out.print("Keyboard's prices: ");

        int keyboardCount = scanner.nextInt();

        int usbCount = scanner.nextInt();

        int[] keyboards = new int[keyboardCount];
        int[] usbs = new int[usbCount];
        for(int i = 0; i < keyboardCount; i++) {
            keyboards[i] = scanner.nextInt();
        }		System.out.print("USB prices: ");

        for(int i = 0; i < usbCount; i++) {
            usbs[i] = scanner.nextInt();
        }
        
		System.out.println(getMoneySpent(keyboards, usbs, amount));
	}

}
