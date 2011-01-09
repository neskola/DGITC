package fi.nje.games;
import com.jme.app.SimpleGame;
import com.jme.bounding.BoundingBox;
import com.jme.math.Vector3f;
import com.jme.scene.shape.Sphere;
public class EngineMain extends SimpleGame {
	public static void main(String[] args) {
		EngineMain app = new EngineMain();
		app.setConfigShowMode(ConfigShowMode.AlwaysShow);
		app.start();
	}
	protected void simpleInitGame() {
		display.setTitle("Tutorial 1");
		Sphere s = new Sphere("Sphere", 30, 30, 25);
		s.setLocalTranslation(new Vector3f(0, 0, -40));
		s.setModelBound(new BoundingBox());
		s.updateModelBound();
		rootNode.attachChild(s);
	}
}