package hangman;

public class LinkedListGameModel implements GameModel {
	LLCharacterNode head;
	public int nog;
	private int state;
	String word;
	String prg="";
	public LinkedListGameModel(String guessWord){
		word=guessWord;
		state    = STARTING_STATE;
		 head=new LLCharacterNode('_');
        LLCharacterNode temp=head;
        for(int i=1;i<=guessWord.length()-1;++i)
        {LLCharacterNode n=new LLCharacterNode('_');
                  temp.setLink(n);
                     temp=temp.getLink();
}}
	public boolean isPriorGuess(char guess) {
		// TODO (2)
		for(int j=0;j<prg.length();++j)
		{char ch=prg.charAt(j);
		if(ch==guess)
			return true;
		}
		return false;
		}
	public int numberOfGuesses() {
		// TODO (3)
		return prg.length();
	}
	public boolean isCorrectGuess(char guess) {
		// TODO (4)
		if(isPriorGuess(guess))
			return false;
		else
		{for(int i=0;i<word.length();++i)
		{char ch=word.charAt(i);
		if(ch==guess)
			return true;
		}
		return false;
	}}
	public boolean doMove(char guess) {
		// TODO (5)
		if(isPriorGuess(guess))
			return false;
		else if(isCorrectGuess(guess))
		{prg+=guess;
		for(int i=0;i<word.length();++i)
		{char ch=word.charAt(i);
		if(ch==guess)
		{add(ch,i+1);
		}
		}
		return true;
	}
		else
		{state+=1;
		prg+=guess;
		return false;
		}}
	public void add(char ch,int t)
	{LLCharacterNode temp=head;
	int x=1;
	while(temp!=null)
	{if(x==t)
	    temp.c=ch;
	temp=temp.getLink();++x;
	}
	}
	public boolean inWinningState() {
		LLCharacterNode temp=head;
		while(temp!=null)
		{if(temp.getInfo()=='_')
			return false;
		temp=temp.getLink();
		
		}
		return true;
	}
	
	public boolean inLosingState() {
		if(state==10)
			return true;
		return false;
	}
	
	public String toString() {
		String n="";
		LLCharacterNode temp=head;
		n+=temp.getInfo();
		temp=temp.getLink();
		while(temp!=null)
		{n+=" "+ temp.getInfo();
		temp=temp.getLink();
		}
			
	return n;}
	public String previousGuessString() {
		String k="";
        k=k+"["+prg.charAt(0);
        for(int i=1;i<prg.length();++i)
        {k=k+", "+prg.charAt(i);
        }k+="]";
        return k;
		
	
	}
	
	public int getState() {
		return state;
	}

	public String getWord() {

		// TODO (10)

		return word;
	}
  
}

	









