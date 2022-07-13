public class Main {
	public static void main(String[] args) {
	    int r, heads=0, tails=0;
	    String s;
	    System.out.println("Who are you?");
		s=new java.util.Scanner(System.in).nextLine();
		System.out.println("Hello, "+s+"!");
		
		System.out.println("Tossing a coin...");
		for(int i=1; i<=3; i++){
		    r=new java.util.Random().nextInt(2);
		    if(r==0){
		        System.out.println("Round "+i+": Heads");
		        heads++;
		    }
		    else{
		        System.out.println("Round "+i+": Tails");
		        tails++;
		    }
		}
		System.out.println("Heads: "+heads+", Tails: "+tails);
		
		if(heads>tails) System.out.println("you won!");
		else System.out.println("you lost!");
	}
}
