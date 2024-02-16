package java_2;
import java.util.Scanner;
public class for_loop {
	
public static void main(String[] args) {
	
	    /*	
	        int rows = 5; // Number of rows in the pattern

	        // Outer loop for the number of rows
	        for (int i = 0; i < rows; i++) {

	            // Inner loop for spaces
	            for (int j = 0; j < rows - i - 1; j++) {
	                System.out.print(" ");
	            }

	            // Inner loop for printing stars
	            for (int k = 0; k < 2 * i + 1; k++) {
	                System.out.print("7");
	            }

	            // Move to the next line
	            System.out.println();
	        }
	    }
	}

/*
				int rows = 9;
				for (int i = rows; i >= 1; i--) {
				    for (int j = 1; j <= rows - i; j++) {
				        System.out.print(" ");
				    	}
				    for (int k = 1; k <= (2 * i) - 1; k++) {
				        System.out.print("*");
				    }
				    System.out.println();
				}
				}
				}
/*
	
	
	  Scanner obj=new Scanner(System.in);
	  System.out.println("enter a number:");
	  int n=obj.nextInt();
	 
	  for(int i=0;i<5;i++) {
	  for(int j=0;j<=i;j++) {
			  System.out.print(i+"\t");
		  }
	  
		  		System.out.println("\n");
	  }
	    }
}
	/* 	
	int i=1;
	while(i<=5) {
		System.out.println(i);
		i++;
	}
}
}
	    
/*
	//0dd even
	int n;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the value for n");
	n=obj.nextInt();
	for(int i=1;i<=n;i++) {
	// if(i%2==0) {
	//	System.out.println(i);
//	 }
		if(i%2!=0) {
			System.out.println(i);
	}
	}
}
}
	/*
	int n;
	int sum=0;
	
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the value for n");
	n=obj.nextInt();
	for(int i=0;i<=n;i++) {
		
		sum= sum+i;
	//System.out.println(sum);
	}
	System.out.println(sum);
	
}
}
/*
	int n;
	int sum=1;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the value for n");
	n=obj.nextInt();
	for(int i=n;i>0;i--) {
		sum*=i*1;
	}
	System.out.println(sum);
		
	}
}
/*

	int n;
	int sum=1;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the value for n");
	n=obj.nextInt();
	int i=n;
	while(i>0)
	{
	sum*=i*1;
	i--;
	}
	System.out.println(sum);
}
}
/*	
	int n;
	int j=1;
	
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the value for n");
	n=obj.nextInt();
	for(int i=1;i<=n;i++) {
		for(j=1;j<=i;j++) {
		System.out.print("*");
	}
	System.out.print("\n");
}
}
}
/*	
	int n;
	int j=1;
	
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the value for n");
	n=obj.nextInt();
	for(int i=1;i<=n;i++) {
		for(j=1;j<=n;j++) {
			if(i==1 ||i==n||j==1 ||j==n) {
			
		System.out.print("*");
	}
			else {
	System.out.print(" ");
}
		}
			System.out.print("\n");
}
	//return 0;
	}
}
/*
	int n;
	int j=1;
	
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the value for n");
	n=obj.nextInt();
	for(int i=1;i<=n;i++) {
		for(j=1;j<=n;j++) {
			if(i==1 ||i==n||j==1 ||j==n||i==j||j==(n-i+1)) {
			
		System.out.print("*");
	}
			else {
	System.out.print(" ");
}
		}
			System.out.print("\n");
}
	//return 0;
	}
}	
*/
	int n;
	int j = 1;

	Scanner obj = new Scanner(System.in);

	for (int i = 1; i <= n; i++) {
	    for (j = 1; j <= n - i; j++) {
	        System.out.print(" ");
	    }
	    for (j = 1; j <= n; j++) {
	        System.out.print("*");
	    }
	System.out.println("Enter the value for n");
	n = obj.nextInt();

	    System.out.print("\n");
	}
}
}
