package marsrover;

public class MarsRover {
	
	final boolean stopInFirstObstacle = false;
	
	public int sizeX;
	public int sizeY;
	
	public int x;
	public int y;
	
	public int xPrev;//x anterior
	public int yPrev;//y anterior
	
	
	public int facing ; // 1: North; 2: South;  3: West;  4: East
	public int facingPrev; //Preview facing
	
	String facingChar;
	
	String obstacles;
	
	String strObstaculo; //cadena para la salida
	
	
	
	public MarsRover(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: ?(o1_x,o1_y)(o2_x,o2_y)...(on_x,on_y)? with no white spaces. 
	 *  
		Example use:
		MarsRover rover = new MarsRover(100,100,?(5,5)(7,8)?)  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		 
	 */		
		
		this.x=0;
		this.y=0;
		
		facing=1;// 1: North; 2: South;  3: West;  4: East
		facingChar= convierteFacing(facing);
		
		strObstaculo="";
		
		sizeX=x;
		sizeY=y;
		

		
		this.obstacles=obstacles;
				
	
		
		//if (obstacles.length()>0) // si contiene obst�culos
		//{
			//this.obstacles=obstacles.substring(1,obstacles.length()-1 ); //elimina los signos de interrogaci�n
		//}
				
	}
	
/*	public void goToStart(int start_x, int start_y,String start_facing){
		
		this.x=start_x;
		this.y=start_y;
		if (start_facing.compareTo("N")==0)
			facing=1;
		else if (start_facing.compareTo("S")==0)
			facing=2;
		else if (start_facing.compareTo("W")==0)
			facing=3;
		else if (start_facing.compareTo("E")==0)
			facing=4;
		
		//facing=1;// 1: North; 2: South;  3: West;  4: East		
		//facingChar= convierteFacing(facing);
		
	}*/
	
	
	public boolean contains( String haystack, String needle ) {
		  haystack = haystack == null ? "" : haystack;
		  needle = needle == null ? "" : needle;

		
		  return haystack.toLowerCase().contains( needle.toLowerCase() );
		}
	
	
	public int encuentraObstaculo(int posX,int posY)
	{
		int valor;
		
		valor=0; // no encuentra
		
		String buscado;
		buscado = "("+ Integer.toString(posX).trim()+ "," + Integer.toString(posY).trim()+ ")" ;
		
		//System.out.println( "Buscando... " + buscado + " within " +  this.obstacles   );
		if( contains( this.obstacles, buscado ) ) {
			  //System.out.println( "Found " + buscado + " within " +  this.obstacles   );
			
			  valor=1; // encuentra
			}
		
		return valor;
		
	}
	
	public String convierteFacing(int direccion)
	{
		
		String cadena="";
		
		switch (direccion)
		{		
		case 1://North
			cadena="N";						
			break;
			
		case 2://South
			cadena="S";
			break;
			
		case 3://West
			cadena="W";
			break;
			
		case 4: //4: East
			cadena="E";				
			break;						
		}// switch	
		
		return cadena;
	}
	
	
	
		
	public int getSizeX() {
		return sizeX;
	}

	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}

	public int getSizeY() {
		return sizeY;
	}

	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getFacing() {
		return facing;
	}

	public void setFacing(int facing) {
		this.facing = facing;
	}

	public String getObstacles() {
		return obstacles;
	}

	public void setObstacles(String obstacles) {
		this.obstacles = obstacles;
	}

	

	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The rover is on a 100x100 grid at location (0, 0) and facing NORTH. The rover is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: ?(x,y,facing)(o1_x,o1_y)(o2_x,o2_y)?..(on_x,on_y)?  
		 * Where x and y are the final coordinates, facing is the current direction the rover is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
						
		//this.x=0;
		//this.y=0;
		
		//facing=1;// 1: North; 2: South;  3: West;  4: East
		//strObstaculo="";
		
		//facingChar= convierteFacing(facing);
		
		
		String auxObstaculo="";
		String auxResultado="";
		
		String comando="";
		//System.out.println( "Comando:" + command);
			for (int i=0;(i<command.length());i++)
			{			
				comando=command.substring(i, i+1).trim().toLowerCase();	
				
					//almacena la posici�n anterior al movimiento
				xPrev=x; 
				yPrev=y;
				facingPrev=facing;
				
				
				
				if (comando.compareTo("f") == 0) //forward
				{
					switch (facing)
					{	
					
						case 1: //North
							
								y++;					
								break;
						case 2: //South
								y--;
								break;				
						case 3: //West
								x--;
								break;
					
						case 4: //4: East
					
								x++;
								break;
					}// switch
					
				}//if
				else if (comando.compareTo("r") == 0) //right
				{
					switch (facing)
					{		
						case 1://North
				
							facing=4;					
							break;
						case 2://South
							facing=3;	
							break;				
				
						case 3://West
							facing=1;	
							break;
				
						case 4://4: East					
							facing=2;
							break;
							
						}// switch
				
				}//elseif
			
				else if (comando.compareTo("b") == 0) //backward
				{
					switch (facing)
					{		
						case 1://North
				
							y--;		
							break;
						case 2://South
							
							y++;
							break;				
				
						case 3://West
							x++;
							break;
				
						case 4: //4: East
							
							x--;
							break;
							
					}// switch
			
							
				}//elseif

				else if (comando.compareTo("l") == 0) //Left
				{
					switch (facing)
					{		
					case 1://North
						facing=3;						
						break;
						
					case 2://South
						facing=4;
						break;
						
					case 3://West
						facing=2;
						break;
						
					case 4: //4: East
						facing=1;
					
						break;
							
					}// switch
						
				}//elseif
			
			
				
				// cases where is out of grid
				
				if (y<0) y=(sizeY - 1);
				
				if (y>(sizeY -1)) y=0;
				
				if (x<0) x=(sizeX-1);
				
				if (x>(sizeX-1)) x=0;
				
				
				
				auxObstaculo="";
				if ((encuentraObstaculo(x,y))==1) //si encuentra obst�culo graba y vuelve a la �ltima posici�n
				{
					auxObstaculo="("+ Integer.toString(x).trim()+ "," + Integer.toString(y).trim()+ ")" ;
					
					//System.out.println( "Buscando: " + auxObstaculo + " within " +  this.strObstaculo   );
					
					if( ! contains( this.strObstaculo, auxObstaculo) ) {
						this.strObstaculo = this.strObstaculo + auxObstaculo ;
					}				
					
					
					
					
					x=xPrev;
					y=yPrev;
					facing=facingPrev;
					
					if(stopInFirstObstacle) {
						String Resultado = "("+ Integer.toString(x).trim()+ "," + Integer.toString(y).trim()+","+facingChar +")"+strObstaculo;
						return(Resultado);
					}
					
				}
				
				facingChar= convierteFacing(facing);
				
				
				//System.out.println( "Original x:"+ Integer.toString(xPrev)  + " y:" + Integer.toString(yPrev) + " Facing:"+ convierteFacing(facingPrev) + "  COMANDO:" + comando + " Posicion Nueva  x:"+ Integer.toString(x)  + " y:" + Integer.toString(y) + " Facing:"+ facingChar + " Obst�culo:"+ auxObstaculo);
				
				auxResultado = "("+ Integer.toString(x).trim()+ "," + Integer.toString(y).trim()+","+facingChar +")"+strObstaculo;
				//System.out.println(auxResultado);
				
			}//for	
			
			//System.out.println( " ");
			String Resultado = "("+ Integer.toString(x).trim()+ "," + Integer.toString(y).trim()+","+facingChar +")"+strObstaculo;
			
			//System.out.println( " ");
			
			return Resultado;

		
		
		
		//return null;
	}
}
