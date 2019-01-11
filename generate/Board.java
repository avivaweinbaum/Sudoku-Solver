public class Board {

	private int[][] board;

	public int[][] fill() {
		while(column < 9){
			while(row < 9{
				//we will actually need two while loops, one to iterate through each row and one to iterate through all columns
				int row = 0;
				int column = 0;

				int[row][column] = //random math int?

				checkHorizontal(row);
				checkvertical(column);
				checkbox();

				row++;
				column;
			}
		column++;
		row = 0;
	}

		//return board

	}

	public Boolean checkHorizontal(int i) {
		//check a specific row value
		int values[] = {0,1,2,3,4,5,6,7,8,9};
		int j = 0;
		while(j < 9){
			int value = board[i][j];
			j++;
			if(values[value] == value){
				values[value] = 0;
			}
			else{
				return False;
			}
		}
		return True;
	}

	public static checkVertical(int i) {
		//check a specific column value
		int values[] = {0,1,2,3,4,5,6,7,8,9};
		int j = 0;
		while(j < 9){
			int value = board[j][i];
			j++;
			if(values[value] == value){
				values[value] = 0;
			}
			else{
				return False;
			}
		}
		return True;

	}

	public static checkBox() {

	}
}
