import java.util.Scanner;

public class Worker {
	
	static ChessFigure[][] field;
	static Scanner scanner = new Scanner(System.in);
	static byte[] coord = new byte[4];

	public static void main(String[] args) {
		
		MakeField();
		ShowField();
		while (true) {
		if (readInputData())
			if ( field[ coord[0]][ coord[1]].CanMove( coord[2], coord[3])) {
				field[coord[2]][coord[3]] = field[coord[0]][coord[1]];
				field[coord[0]][coord[1]] = new EmptyFigure();
				ShowField();
			}
		}
	}

	static boolean readInputData() {
		
		String input = scanner.nextLine().toLowerCase();
		
		coord[0] = (byte)(input.charAt(0) - 'a');
		coord[1] = (byte)(input.charAt(1) - '1');
		coord[2] = (byte)(input.charAt(3) - 'a');
		coord[3] = (byte)(input.charAt(4) - '1');
		
		boolean flag = true;
		for (int i = 0; i < coord.length; i++)
			if (coord[i] < 0 || coord[i] > 7)
				flag = false;
		
		return flag;
	}
	
	static void MakeField() {
		
		field = new ChessFigure[8][8];
		
		for (byte i = 0; i < 8; i++)
			for (byte j = 0; j < 8; j++)
				field[i][j] = new EmptyFigure(i, j);
		
		for (byte i = 0; i < 8; i++) {
			field[i][6] = (ChessFigure)new FigurePawn((byte) i, (byte)6, false);
			field[i][1] = (ChessFigure)new FigurePawn((byte) i, (byte)1, true);
		}
		
		/*
		// Rook
		Field[0][0] = new FigureRook((byte) 0, (byte) 0, true);
		Field[0][7] = new FigureRook((byte) 0, (byte) 7, true);
		Field[7][0] = new FigureRook((byte) 7, (byte) 0, false);
		Field[7][7] = new FigureRook((byte) 7, (byte) 7, false);
		// Knight
		Field[0][1] = new FigureKnight((byte) 0, (byte) 1, true);
		Field[0][6] = new FigureKnight((byte) 0, (byte) 6, true);
		Field[7][1] = new FigureKnight((byte) 7, (byte) 1, false);
		Field[7][6] = new FigureKnight((byte) 7, (byte) 6, false);
		// Bishop
		Field[0][2] = new FigureBishop((byte) 0, (byte) 2, true);
		Field[0][5] = new FigureBishop((byte) 0, (byte) 5, true);
		Field[7][2] = new FigureBishop((byte) 7, (byte) 2, false);
		Field[7][5] = new FigureBishop((byte) 7, (byte) 5, false);
		// King && Queen
		Field[0][4] = new FigureKing((byte) 0, (byte) 4, true);
		Field[0][3] = new FigureQueen((byte) 0, (byte) 3, true);
		Field[7][4] = new FigureKing((byte) 7, (byte) 4, false);
		Field[7][3] = new FigureQueen((byte) 7, (byte) 3, false);
		*/
	}

	static void ShowField() {
		
		for (byte i = 7; i > -1; i--) {
			System.out.print((i+1) + " ");
			for (byte j = 0; j < 8; j++)
				System.out.print(field[j][i].toString());
			System.out.println();
		}
	}

}
