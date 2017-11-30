
public class FigureKing extends ChessFigure {

	public FigureKing(byte x, byte y, boolean color) {
		this.coordinate_x = x;
		this.coordinate_y = y;
		this.isActive = true;
		this.color = color;
		if (color)
			this.setLabel('\u2654');
		else
			this.setLabel('\u265A');
	}
}
