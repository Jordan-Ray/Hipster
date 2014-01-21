package hipster.model;

/**
 * Creates the Hipster object.
 * @author jray1621
 * @version 1.2 11/20/13 Added getter/setters, overloaded constructor ofr additional hipster.
 */
public class Hipster
{

	private String name;
	private String hipsterType;
	private String hipsterPhrase;
	private String [] hipsterBooks;
	
	/**
	 * Defines the variables of books name type and phrase
	 */
	public Hipster()
	{
		hipsterBooks = new String[5];
		name = "Jordan";
		hipsterType = "Afro Hipster";
		hipsterPhrase = "It's simple math";
		
		
		fillTheBooks();
	}
	
	/**
	 * defines the name, books, phrase, and type of the hipster.
	 * @param name - Your name
	 * @param hipsterType - The type of hipster
	 * @param hipsterPhrase - Your phrase
	 * @param hipsterBooks - books you read
	 */
	public Hipster(String name, String hipsterType, String hipsterPhrase, String [] hipsterBooks)
	{
		this.name = name;
		this.hipsterBooks = hipsterBooks;
		this.hipsterPhrase = hipsterPhrase;
		this.hipsterType = hipsterType;
		
	}
	
	/**
	 * The getter for the Name. It will receive the name.
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Setter for the Name. It will define the Name.
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * The getter for the Type.
	 * @return
	 */
	public String getHipsterType()
	{
		return hipsterType;
	}

	/**
	 * This is the setter for the Type.
	 * @param hipsterType
	 */
	public void setHipsterType(String hipsterType)
	{
		this.hipsterType = hipsterType;
	}

	/**
	 * This is the getter for the HipsterPhrase.
	 * @return
	 */
	public String getHipsterPhrase()
	{
		return hipsterPhrase;
	}

	/**
	 * This is the setter for the Phrase.
	 * @param hipsterPhrase
	 */
	public void setHipsterPhrase(String hipsterPhrase)
	{
		this.hipsterPhrase = hipsterPhrase;
	}

	/**
	 * this is the getter for the books.
	 * @return
	 */
	public String[] getHipsterBooks()
	{
		return hipsterBooks;
	}
	
	/**
	 * This is the setter for the books. 
	 * @param hipsterBooks
	 */
	public void setHipsterBooks(String[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}

	/**
	 * This sets up the books array of books.
	 */
	private void fillTheBooks()
	{
		hipsterBooks[0] = "Harry Potter";
		hipsterBooks[1] = "Grey Griffins";
		hipsterBooks[2] = "The Seven Realms";
		hipsterBooks[3] = "The Warrior Heir";
		hipsterBooks[4] = "The Fault in Our Stars";
		
	}
	
}
