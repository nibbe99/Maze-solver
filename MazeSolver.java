package MazeSolver;

public class MazeSolver {
	
	private int startRow;
	private int startCol;
	private int [][] maze;
	private boolean [][] visited;
	
	public MazeSolver(int [][] maze, int startRow, int startCol) {
		this.maze = maze;
		this.visited = new boolean[maze.length][maze.length];
		this.startRow = startRow;
		this.startCol = startCol;
		//this.visited[startRow][startCol] = true;
		
	}
	
	public void findWay() {
		if(dfs(startRow, startCol)) {
			System.out.println("Solution does exists");
			showMaze();
		}
		else {
			System.out.println("NO SOLUTION");
			showMaze();
		}
		
	}
	
	private boolean isFeasible(int x, int y) {
		// ||

		if(x < 0 || x > maze.length-1) {	// x is out of bounds vertical 
			return false;
		}
		if(y < 0 || y > maze.length-1 ) {	// y is out of bounds horizontal
			return false;
		}
		
		if(visited[x][y]) {	//must be unique, cant visit twice (EXCEPT BACKTRACKING) recursio
			return false;
		}
		
		if(maze[x][y] == 1) {		//1 is a wall. An obstacle
			return false;
		}
		return true;
	}
	
	private boolean dfs(int x, int y) {		
		//base-case
		

		/*
		if(x == maze.length-1 && y == maze.length -1) {	//destination is last row, last column. SOLUTION FOUND!
			visited[x][y] = true;
				return true;
		}
	*/
		try {
			
		if(isFeasible(x, y)) {	// if returns true, then we have visited
			
			if(maze[x][y] == 3) {
				visited[x][y] = true;
				return true;
			}
			
			visited[x][y] = true;
			
			
				//Thread.sleep(1000);
			//	showMaze();
			
				
			//visit next cells (can go UP, LEFT, DOWN, RIGHT)
			
			if(dfs(x+1,y)) {	//going down, 

				return true;
			}
			
			 if(dfs(x-1, y)) {	//going up

				return true;
			}
			
				if(dfs(x, y+1)) {	//going right

				return true;
			}
			
				if(dfs(x, y-1)) {	//going left

				return true;
			}
			
		
			//BACKTRACK. IF EVERYTHING FALSE
		
				/*
			Thread.sleep(1000);
			showMaze();
			System.out.println("Going back!");
			*/
			visited[x][y] = false;

			
	
			return false;
			
		}
		
	}
		
catch(Exception e) {
			
		}
		
		return false;
	}
	
	private void showMaze() {
		char c [][] = new char[maze.length][maze.length];
		for(int i = 0; i < visited.length; i++) {
			for(int j = 0; j < visited[i].length; j++) {
				if(visited[i][j]) {
					c[i][j] = '-';

				}
			
			}
		}
		

		for(int i = 0; i < visited.length; i++) {
			for(int j = 0; j < visited[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			
			System.out.println();
		}
		
	}

}






























