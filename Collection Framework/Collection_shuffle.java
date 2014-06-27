/*This program is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Comparator;
class Card
{
	public static enum Face { Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King };
	public static enum Suit { Clubs, Diamonds, Hearts, Spades };
	private final Face face;
	private final Suit suit;
	public Card(Face face,Suit suit)
	{
		this.face=face;
		this.suit=suit;
	}
	public Face getFace()
	{
		return this.face;
	}
	public Suit getSuit()
	{
		return this.suit;
	}
	public String toString()
	{
		return String.format("%s of %s",this.face,this.suit);
	}
}
class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] deckOfCards=new String[52];
		List<Card> list=new ArrayList<Card>();
		int i=0;
		for(Card.Suit suit:Card.Suit.values())
		{
			for(Card.Face face:Card.Face.values())
			{
				list.add(new Card(face,suit));
			}
		}
		System.out.println("Deck of Cards:\n"+list);
		//Shuffling the cards
		Collections.shuffle(list);
		System.out.println("\n\nDeck of Cards:\n"+list);
	}
}