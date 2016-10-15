package hangman;

class LLCharacterNode
{char c;
LLCharacterNode link;
public LLCharacterNode(char d)
{c=d;
}
public char getInfo()
{return c;

}
public void setLink(LLCharacterNode s)
{link=s;
}
public LLCharacterNode getLink()
{return link;
}}