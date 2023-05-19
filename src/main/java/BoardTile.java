
public abstract class BoardTile {
	public enum BoardTileSection {
		BOTTOM(),
		LEFT,
		RIGHT,
		TOP
		private int nextTileDeltaX, nextTileDeltaY;
		private BoardTileSection(int nextTileDeltaX, int nextTileDeltaY) {
			this.nextTileDeltaX = nextTileDeltaX;
			this.nextTileDeltaY = nextTileDeltaY;
		}
	}
	public BoardTile(String name, int posX, int posY, ) {
		
	}
	public abstract 
}
