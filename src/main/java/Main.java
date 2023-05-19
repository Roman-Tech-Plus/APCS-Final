import static com.raylib.Jaylib.BLACK;
import static com.raylib.Jaylib.RAYWHITE;
import static com.raylib.Jaylib.VIOLET;
import static com.raylib.Raylib.*;

import com.raylib.Raylib.Texture;

public class Main {
    public static void main(String args[]) {
    	float windowScale = 0.7f;
        int hight = (int) (900*windowScale);
        int width = (int) (900*windowScale);
        InitWindow(width, hight, "Demo");
        SetTargetFPS(60);
        Camera2D camera = new Camera2D();
        camera.offset(new Vector2().x(width/2.0f).y(hight/2.0f));
        Texture background = LoadTexture("resources/monopoly_board_background.png");
        
        while (!WindowShouldClose()) {
        	ClearBackground(RAYWHITE);
            BeginDrawing();
            DrawTextureEx(background, new Vector2(), 0.0f, windowScale, RAYWHITE);
            DrawText("world", width/18, hight/18, 0, VIOLET);
            DrawRectangle(width/17, (int)(hight * ) * 3, width/24, width/24, BLACK);
            DrawFPS(20, 20);
            EndDrawing();
        }
        CloseWindow();
    }
}