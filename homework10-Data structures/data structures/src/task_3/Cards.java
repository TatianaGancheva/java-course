package task_3;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class Cards {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.print("Enter 5 cards: ");
		String[]cards=new String[5];
		for(int i=0;i<cards.length;i++){
			cards[i]=input.nextLine();
			if(!((cards[i].equals("2"))||(cards[i].equals("3"))||(cards[i].equals("4"))
					||(cards[i].equals("5"))
					||(cards[i].equals("6"))||(cards[i].equals("7"))||
					(cards[i].equals("8"))||(cards[i].equals("9"))||(cards[i].equals("10"))||
					(cards[i].equals("J"))||(cards[i].equals("K"))||(cards[i].equals("Q"))||
					(cards[i].equals("A")))){
				System.out.println("Inavlid card there.Try again please :)");
				return;
				
			}
			input.close();
		}
		checkCombination(cards);
		
	}
	public static void checkCombination(String[] cards){
		HashMap<String,Integer> card=new HashMap<String,Integer>();
		for(String typeCard:cards){
			Integer count=card.get(typeCard);
			if(count==null){
				count=0;
			}
			card.put(typeCard, count+1);
		}
		
		Set<String>CardKind=card.keySet();
		int pairs=0;
		for(String cardss: CardKind){
			int count=card.get(cardss);
			
			if(count==2){
				if(pairs==0){
					
					System.out.println("a pair!");
					pairs++;
				}else if(pairs==1){
					System.out.println("a two pair!");
					pairs++;
				
				}
			}else if(count==3){
				System.out.println("this is a set!");
			}else if(count==4){
				System.out.println("four of a kind!");
			}
		}
	}

}
