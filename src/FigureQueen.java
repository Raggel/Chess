
public class FigureQueen extends ChessFigure {

	public FigureQueen(byte x, byte y, boolean color) {
		this.coordinate_x = x;
		this.coordinate_y = y;
		this.isActive = true;
		this.color = color;
		if (color)
			this.setLabel('\u2655');
		else
			this.setLabel('\u265B');
	}
}
