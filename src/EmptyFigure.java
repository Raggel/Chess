public class EmptyFigure extends ChessFigure {
	public EmptyFigure(byte x, byte y) {
		this.setCoordinate_x(x);
		this.setCoordinate_y(y);
		this.setIsActive(false);
	}
	public EmptyFigure() {
		this.setIsActive(false);
	}
}
