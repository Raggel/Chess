
public class FigureKnight extends ChessFigure {

	public FigureKnight(byte x, byte y, boolean color) {
		this.coordinate_x = x;
		this.coordinate_y = y;
		this.isActive = true;
		this.color = color;
		if (color)
			this.setLabel('\u2658');
		else
			this.setLabel('\u265E');
	}
}

