package graphs;

public class Graph<T> {
	protected int[][] matrix;
	protected int vertexCount;
	
	public Graph(int vertexCount) {
		matrix(vertexCount);
	}
	
	public int[][] getMatrix() {
		return matrix;
	}
	    
	public void matrix(int vertexCount) {
		if (vertexCount >= 0) {
			this.vertexCount = vertexCount;
			matrix = new int[vertexCount][vertexCount];
			for (int i = 0; i < vertexCount; i++) {
				for (int j = 0; j < vertexCount; j++) {
					matrix[i][j] = 0;
				}
			}
			System.out.println("Graph created!");
		}
	}
	
	public boolean areConnected(int edge, int edge1) {
		if (matrix[edge - 1][edge1 - 1] == 1 && matrix[edge1 - 1][edge - 1] == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public void connectEdges(int edge, int edge1) {
		if (areConnected(edge, edge1)) {
			System.out.println("There is already a connection! ");
		} else {
			matrix[edge - 1][edge1 - 1] = 1;
			matrix[edge1 - 1][edge - 1] = 1;
		}
	}
    
    public boolean path(int edge, int edge1) {
    	if (matrix[edge - 1][edge1 - 1] == 1 && matrix[edge1 - 1][edge - 1] == 1) {
			return true;
		}
    	for (int i = 0; i < vertexCount; i++) {
    		if (matrix[i][edge1 - 1] == 1) {
    			return path(i + 1, edge1);
    		}
    	}
    	return false;
    }
}
