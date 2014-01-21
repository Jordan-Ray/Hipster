package hipster.view;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PicturePanel extends JPanel
{
	private Image baseImage;
	private ImageIcon pictureSource;
	private int width;
	private int height;
	
	/**
	 * This defines the picture.
	 * @param imagePath Where we get the Picture
	 * @param width Where you define out the width of picture
	 * @param height Where you define the Height of the picture
	 */
	public PicturePanel(URL imagePath, int width, int height)
	{
		this.width = width;
		this.height = height;
		this.pictureSource = new ImageIcon(imagePath);
	}
	
	/**
	 * This will call the picture from the other classes.
	 */
	@Override
	protected void paintComponent(Graphics panelGraphics)
	{
		super.paintComponent(panelGraphics);
		baseImage = pictureSource.getImage();
		panelGraphics.drawImage(baseImage, 0, 0, width, height, null);
	}
	
	/**
	 * Calls the picture source and defines it.
	 * @param imagePath
	 */
	public void setPictureSource(URL imagePath)
	{
		this.pictureSource = new ImageIcon(imagePath);
	}
}
