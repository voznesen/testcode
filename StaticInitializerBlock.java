//Write your code here
public static boolean flag;
public static int B;
public static int H;

static {
        staticMethod();
        //System.out.println("This is third static block");
    }

    public static void staticMethod() {
        //System.out.println("This is static method");
        
         flag  = true;

    // whatever code is needed for initialization goes here
    Scanner sc = new Scanner(System.in);
    B = sc.nextInt();
    H = sc.nextInt();
        
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
