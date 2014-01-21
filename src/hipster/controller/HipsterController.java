package hipster.controller;

import javax.swing.JOptionPane;

import hipster.model.Hipster;
import hipster.view.HipsterFrame;

/**
 * Controller for the Hipster project.
 * 
 * @author jray1621
 * @version 1.1 11/19/13 Added constructor information.
 */
public class HipsterController
{
	private HipsterFrame appFrame;
	private Hipster selfHipster;
	private Hipster[] classHipster;
	private int hipsterCount;
	
	/**
	 * This sets up the controller to create the other hipsters.
	 */
	public HipsterController()
	{
		selfHipster = new Hipster();
		classHipster = new Hipster[6];
		hipsterCount = 0;
	}

	/**
	 * Getter for the class Hipster.
	 * @return
	 */
	public Hipster[] getclassHipster()
	{
		return classHipster;
	}
	
	
	/**
	 * Gets the hipster.
	 * @return
	 */
	public Hipster getSelfHipster()
	{
		return selfHipster;
	}

	/**
	 * returns the hipster
	 * @param selfHipster
	 */
	public void setSelfHipster(Hipster selfHipster)
	{
		this.selfHipster = selfHipster;
	}

	/**
	 * this sets up the hipster frame.
	 */
	public void start()
	{
		appFrame = new HipsterFrame(this);
	}

	/**
	 * this make you specify the position of the hipster and what hipster you are calling
	 * @param position
	 * @return
	 */
	public Hipster getSpecifiedHipster(int position)
	{
		Hipster currentHipster = null;

		if (position < classHipster.length && position >= 0)
		{
			currentHipster = classHipster[position];
		}

		return currentHipster;
	}

	/**
	 * This sets it up so that it will receive a random hipster.
	 * @return
	 */
	public Hipster getRandomHipster()
	{
		Hipster currentHipster = null;

		int randomIndex = 0;
		double random = Math.random();
		randomIndex = (int) random * classHipster.length;
		currentHipster = classHipster[randomIndex];

		return currentHipster;
	}

	/**
	 * Creates and add a hipster to the array of class hipsters from the specified values
	 * @param books the array of books for the hippster
	 * @param name the name of the hipster
	 * @param type the array of the type of hipster
	 * @param phrase the phrase that the hipster says
	 */
	public void addHipster(String[] books, String name, String type,
			String phrase)
	{
		if (hipsterCount < classHipster.length)
		{
			Hipster tempHipster = new Hipster(name, type, phrase, books);
			classHipster[hipsterCount] = tempHipster;

			hipsterCount++;
		}
		else
		{
			JOptionPane.showMessageDialog(appFrame, "The class is complete");
		}

	}
}
