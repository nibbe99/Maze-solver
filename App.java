package MazeSolver;

public class App {
	
	static int startX;
	static int startY;
	
	public static void main(String args[]) {
		
		int [][] map = {
		    {1,1,1,1,1,1},
		    {2,0,0,0,0,0},
		    {1,1,0,1,0,1},
		    {1,0,0,0,1,0},
		    {0,0,1,0,0,0},
		    {0,3,0,1,1,1}
		};
		
		int [][] map2 = {
			    {2,0,0,0,0,1},
			    {1,1,0,0,0,0},
			    {0,0,0,1,0,1},
			    {0,0,0,0,0,0},
			    {1,0,1,0,1,0},
			    {1,0,0,0,1,3}
			};
		
		int [][] map3 = {
			    {1,0,2,0,1,0},
			    {1,0,0,0,1,0},
			    {0,0,0,0,0,1},
			    {0,0,0,0,0,0},
			    {1,0,0,0,1,1},
			    {0,1,3,1,0,1}
			};
		
		int [][] map4 = {
			    {0,0,0,0,1,1},
			    {0,1,2,0,0,1},
			    {0,0,0,1,0,0},
			    {1,1,0,1,1,1},
			    {1,0,0,1,1,1},
			    {1,3,1,0,1,0}
			};
		
		
		
		showMaze(map4);

		
		MazeSolver mazeSolver = new MazeSolver(map4, startX, startY);
		
		mazeSolver.findWay();

		
		
	}
	
	static void showMaze(int [][] map) {
		
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
				if(map[i][j] == 2) {
					startX = i;
					startY = j;
				}
			}
			System.out.println();
		}
		
	}
	
	

}









