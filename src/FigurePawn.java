
public class FigurePawn extends ChessFigure {
	boolean isFirst = true;

	public FigurePawn(byte x, byte y, boolean color) {
		this.setCoordinate_x(x);
		this.setCoordinate_y(y);
		this.setIsActive(true);
		this.setColor(color);
		if (color)
			this.setLabel('\u2659');
		else
			this.setLabel('\u265F');
	}

	@Override
	boolean CanMove(byte to_x, byte to_y) {
		byte x = this.getCoordinate_x();
		byte y = this.getCoordinate_y();
		if (this.getColor())
			// white
			if (this.isFirst) {
				if ((x - to_x) == 0)
					if ((to_y - y) == 1 || (to_y - y) == 2)
						return true;
					else
						return false;
			} else {
				if ((x - to_x) == 0)
					if ((to_y - y) == 1)
						return true;
					else
						return false;

			}
		else
		// black
		if (this.isFirst) {
			if ((x - to_x) == 0)
				if ((y - to_y) == 1 || (y - to_y) == 2)
					return true;
				else
					return false;
		} else {
			if ((x - to_x) == 0)
				if ((y - to_y) == 1)
					return true;
				else
					return false;
		}
		return false;
	}

}
