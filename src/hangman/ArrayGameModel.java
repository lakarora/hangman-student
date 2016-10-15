package hangman;

/**
 * The Array implementation of the GameModel interface.
 */
public class ArrayGameModel implements GameModel {
	/** The number of characters (lower/upper). */
	private static final int ALPHABET_COUNT = 26*2;
	public int nog;
	/** hung state */
	private int		state;
	String word;
	String gam[];
	String prg="";
	/**
	 * Creates a new ArrayGameModel object.
	 * 
	 *  guessWord the word to guess
	 */
	public ArrayGameModel(String guessWord) {
		// TODO (1)
		state    = STARTING_STATE;
		word=guessWord;
		gam=new String[guessWord.length()];
		for(int i=0;i<gam.length;++i)
		gam[i]="_";
		}
		
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
		{gam[i]=""+ch;
		}
		}
		return true;
	}
		else
		{state+=1;
		prg+=guess;
		return false;
		}
		
		}
	public boolean inWinningState() {
		for(int j=0;j<gam.length;++j)
		{if(gam[j].equals("_"))
			return false;
		}
		return true;
	}

	public boolean inLosingState() {
		if(state==10)
			return true;
		return false;
	}
	
	public String toString() {
		String n=gam[0];
		for(int j=1;j<gam.length;++j)
		{n+=" "+gam[j];
	
	}return n;}

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
