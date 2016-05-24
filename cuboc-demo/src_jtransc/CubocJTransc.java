import com.badlogic.cubocy.Cubocy;
import com.badlogic.cubocy.screens.DebugGlMenu;
import com.badlogic.cubocy.screens.MainMenu;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.jtransc.media.limelibgdx.LimeApplication;

public class CubocJTransc {
	public static void main(String[] argv) {
		//new LimeApplication(new CubocyDebug(), "Cubocy", 480, 320);
		new LimeApplication(new Cubocy(), "Cubocy", 480, 320);
		// After creating the Application instance we can set the log level to
		// show the output of calls to Gdx.app.debug
		Gdx.app.setLogLevel(Application.LOG_DEBUG);
	}
}

class CubocyDebug extends Cubocy {
	@Override
	public void create () {
		setScreen(new DebugGlMenu(this));
	}
}
