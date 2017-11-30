
public class FigureBishop extends ChessFigure {

	public FigureBishop(byte x, byte y, boolean color) {
		this.coordinate_x = x;
		this.coordinate_y = y;
		this.isActive = true;
		this.color = color;
		if (color)
			this.setLabel('\u2657');
		else
			this.setLabel('\u265D');
	}
}

