public class Board {

	private int[][] board;

	public int[][] fill() {
		while(column < 9) {
			while(row < 9) {
				//we will actually need two while loops, one to iterate through each row and one to iterate through all columns
				int row = 0;
				int column = 0;

				int[row][column] = (int)(Math.random()*9)+1; //random math int?

				checkHorizontal(row);
				checkVertical(column);
				checkBox(row, column);

				row++;
			}
		column++;
		row = 0;
	}

		return board;

	}

	public static checkHorizontal(int i) {

	}

	public static checkVertical(int i) {

	}

	public static checkBox(int i, int j) {
		whichBox(i, j);

	}

	public int whichBox(int i, int j) {
		int x = (i-(i%3))/3;
		int y = (j-(j%3))/3;

		if (x == 1 && y == 1) { return 1 }
		else if (x == 1 && y == 2) { return 2 }
		else if (x == 1 && y == 3) { return 3 }
		else if  (x == 2 && y == 1) { return 4 }
		else if  (x == 2 && y == 2) { return 5 }
		else if  (x == 2 && y == 3) { return 6 }
		else if  (x == 3 && y == 1) { return 7 }
		else if  (x == 3 && y == 2) { return 8 }
		else if  (x == 3 && y == 3) { return 9 }

	}

}
