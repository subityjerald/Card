import java.util.Random;
public class Card2{

	public static void main(String[] args) {
		Random myrandom=new Random();
int card,total=0;
System.out.println("card   total");
while(total<21) {
	card=myrandom.nextInt(10)+1;
	total+=card;
	System.out.print(card);
	System.out.print("\t ");
	System.out.println(total);
}
if(total==20) {
	System.out.print("you win");
}else {
	System.out.print("you lose");
}
	}

}

