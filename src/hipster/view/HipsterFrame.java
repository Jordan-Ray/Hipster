package hipster.view;

import hipster.controller.HipsterController;

import javax.swing.JFrame;


/**
 * Creates a JFrame for the project.
 * @author jray1621
 *	@version 1.1 20/11/2013
 */
public class HipsterFrame extends JFrame
{
	private HipsterController baseController;
	private HipsterPanel basePanel;
	
	/**
	 * Sets up the new Frame.
	 * @param baseController
	 */
	public HipsterFrame(HipsterController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	
	/**
	 * Setups the size of the GUI Frame.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500,500);
		this.setVisible(true);
	}
}
