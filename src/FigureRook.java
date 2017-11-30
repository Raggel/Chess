
public class FigureRook extends ChessFigure {

	public FigureRook(byte x, byte y, boolean color) {
		this.coordinate_x = x;
		this.coordinate_y = y;
		this.isActive = true;
		this.color = color;
		if (color)
			this.setLabel('\u2656');
		else
			this.setLabel('\u265C');
	}
}
