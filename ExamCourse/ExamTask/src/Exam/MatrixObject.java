package Exam;

public class MatrixObject {
	private int[][]matrix;
	private int side;
	
	public MatrixObject() {
		super();
	}
	public MatrixObject(int[][] matrix, int side) {
		super();
		this.matrix = matrix;
		this.side = side;
	}
	public int[][] getMatrix() {
		return matrix;
	}
	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}


	


	
	
	
}
