public class SquirtleBoard extends Board {

	
	public SquirtleBoard() 
	{
		// Call the Board constructor to make an 8x4 Board
	 	super(8, 4);
	 	newGame(false);
	 	setTitle("PokemonCode Assignment 1");
	 	setInitialText("What will Squirtle do with Bulbasaur's flowers?");
	}
	

	
	@Override
	public void newGame(boolean repaint)
	{
		super.newGame(repaint);
		
		// Create a SquirtleThing at 0, 0
	 	SquirtleThing squirtle = new SquirtleThing();
	 	squirtle.setLocation(0, 1);
	 	add(squirtle);
	 	
	 	SquirtleThing squirtle1 = new SquirtleThing();
	 	squirtle1.setLocation(0, 2);
	 	add(squirtle1);
	 	
	 	SquirtleThing squirtle2 = new SquirtleThing();
	 	squirtle2.setLocation(0, 3);
	 	add(squirtle2);
	 	
	 	SquirtleThing squirtle3 = new SquirtleThing();
	 	squirtle3.setLocation(0, 4);
	 	add(squirtle3);
	 	
	 	SquirtleThing squirtle4 = new SquirtleThing();
	 	squirtle4.setLocation(1, 4);
	 	add(squirtle4);
	 	
	 	SquirtleThing squirtle5 = new SquirtleThing();
	 	squirtle5.setLocation(1, 3);
	 	add(squirtle5);
	 	
	 	// Create a BulbasaurThing at 0, 4
	 	BulbasaurThing bulbasaur = new BulbasaurThing();
	 	bulbasaur.setLocation(0, 0);
	 	add(bulbasaur);
	 	
	 	BulbasaurThing bulbasaur2 = new BulbasaurThing();
	 	bulbasaur2.setLocation(7, 0);
	 	add(bulbasaur2);
	 	
	}
} 
