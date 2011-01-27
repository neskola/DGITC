package fi.game.engine;

import com.jme3.app.SimpleApplication;
import com.jme3.font.BitmapText;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;

/**
 * test
 * 
 * @author viirus
 */
public class Main extends SimpleApplication {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	@Override
	public void simpleInitApp() {
		super.flyCam.setMoveSpeed(5f);
		super.flyCam.setDragToRotate(true);

		Node dungeonScene = new Node("DungeonScene");
		/** A simple textured cube. Uses Texture from jme3-test-data library! */
		Box boxshape1 = new Box(Vector3f.ZERO, 1, 1, 1);
		Geometry cube = new Geometry("1 Textured Box", boxshape1);
		cube.setLocalTranslation(Vector3f.ZERO);
		Material mat_stl = new Material(assetManager,
				"Common/MatDefs/Misc/SimpleTextured.j3md");
		mat_stl.setTexture("m_ColorMap",
				assetManager.loadTexture("Textures/goswall2.jpg"));
		cube.setMaterial(mat_stl);
		dungeonScene.attachChild(cube);

		Box boxshape2 = new Box(Vector3f.ZERO, 1, 1, 1);
		Geometry cube2 = new Geometry("2 Textured Box", boxshape2);
		cube2.setLocalTranslation(new Vector3f(4, 0, 0));
		Material mat_stl2 = new Material(assetManager,
				"Common/MatDefs/Misc/SimpleTextured.j3md");
		mat_stl2.setTexture("m_ColorMap",
				assetManager.loadTexture("Textures/goswall1.jpg"));
		cube2.setMaterial(mat_stl2);

		dungeonScene.attachChild(cube2);

		Box boxshape3 = new Box(Vector3f.ZERO, 1, 1, 1);
		Geometry cube3 = new Geometry("3 Textured Box", boxshape3);
		cube3.setLocalTranslation(new Vector3f(2, 0, 0));
		Material mat_stl3 = new Material(assetManager,
				"Common/MatDefs/Misc/SimpleTextured.j3md");
		mat_stl3.setTexture("m_ColorMap",
				assetManager.loadTexture("Textures/goswall.jpg"));
		cube3.setMaterial(mat_stl3);
		dungeonScene.attachChild(cube3);

		Box boxshape4 = new Box(Vector3f.ZERO, 1, 1, 1);
		Geometry cube4 = new Geometry("4 Textured Box", boxshape4);
		cube4.setLocalTranslation(new Vector3f(0, 0, 4));
		Material mat_stl4 = new Material(assetManager,
				"Common/MatDefs/Misc/SimpleTextured.j3md");
		mat_stl4.setTexture("m_ColorMap",
				assetManager.loadTexture("Textures/goswall2.jpg"));
		cube4.setMaterial(mat_stl4);
		dungeonScene.attachChild(cube4);

		Box boxshape5 = new Box(Vector3f.ZERO, 1, 1, 1);
		Geometry cube5 = new Geometry("5 Textured Box", boxshape5);
		cube5.setLocalTranslation(new Vector3f(4, 0, 4));
		Material mat_stl5 = new Material(assetManager,
				"Common/MatDefs/Misc/SimpleTextured.j3md");
		mat_stl5.setTexture("m_ColorMap",
				assetManager.loadTexture("Textures/goswall1.jpg"));
		cube5.setMaterial(mat_stl5);

		dungeonScene.attachChild(cube5);

		Box boxshape6 = new Box(Vector3f.ZERO, 1, 1, 1);
		Geometry cube6 = new Geometry("6 Textured Box", boxshape6);
		cube6.setLocalTranslation(new Vector3f(2, 0, 4));

		Material mat_stl6 = new Material(assetManager,
				"Common/MatDefs/Misc/SimpleTextured.j3md");
		mat_stl6.setTexture("m_ColorMap",
				assetManager.loadTexture("Textures/goswall.jpg"));
		cube6.setMaterial(mat_stl6);
		dungeonScene.attachChild(cube6);

		Box boxshape7 = new Box(Vector3f.ZERO, 1, 0.05f, 1);
		Geometry cube7 = new Geometry("7 Textured Box", boxshape7);
		cube7.setLocalTranslation(new Vector3f(0, -0.95f, 2));

		Material mat_stl7 = new Material(assetManager,
				"Common/MatDefs/Misc/SimpleTextured.j3md");
		mat_stl7.setTexture("m_ColorMap",
				assetManager.loadTexture("Textures/gsfloor.jpg"));
		cube7.setMaterial(mat_stl7);
		dungeonScene.attachChild(cube7);

		Geometry cube8 = new Geometry("8 Textured Box", boxshape7);
		cube8.setLocalTranslation(new Vector3f(2, -0.95f, 2));
		cube8.setMaterial(mat_stl7);
		dungeonScene.attachChild(cube8);

		Geometry cube9 = new Geometry("9 Textured Box", boxshape7);
		cube9.setLocalTranslation(new Vector3f(4, -0.95f, 2));
		cube9.setMaterial(mat_stl7);
		dungeonScene.attachChild(cube9);

		Geometry cube10 = new Geometry("10 Textured Box", boxshape7);
		cube10.setLocalTranslation(new Vector3f(0, 0.95f, 2));

		Material mat_stl11 = new Material(assetManager,
				"Common/MatDefs/Misc/SimpleTextured.j3md");
		mat_stl11.setTexture("m_ColorMap",
				assetManager.loadTexture("Textures/nkbrick.jpg"));
		cube10.setMaterial(mat_stl11);
		dungeonScene.attachChild(cube10);

		Geometry cube11 = new Geometry("11 Textured Box", boxshape7);
		cube11.setLocalTranslation(new Vector3f(2, 0.95f, 2));
		cube11.setMaterial(mat_stl11);
		dungeonScene.attachChild(cube11);

		Geometry cube12 = new Geometry("12 Textured Box", boxshape7);
		cube12.setLocalTranslation(new Vector3f(4, 0.95f, 2));
		cube12.setMaterial(mat_stl11);
		dungeonScene.attachChild(cube12);

		Box boxshape13 = new Box(Vector3f.ZERO, 1, 1, 1);

		Geometry cube13 = new Geometry("13 Textured Box", boxshape13);
		cube13.setLocalTranslation(new Vector3f(6, 0, 2));

		Material mat_stl13 = new Material(assetManager,
				"Common/MatDefs/Misc/SimpleTextured.j3md");
		mat_stl13.setTexture("m_ColorMap",
				assetManager.loadTexture("Textures/nkdoor.jpg"));
		cube13.setMaterial(mat_stl13);
		dungeonScene.attachChild(cube13);

		rootNode.attachChild(dungeonScene);

        // Display a line of text with a default font
        //guiNode.detachAllChildren();
        guiFont = assetManager.loadFont("Interface/Fonts/Default.fnt");
        BitmapText helloText = new BitmapText(guiFont, false);
        helloText.setSize(guiFont.getCharSet().getRenderedSize());
        helloText.setText("Don't Go Into The Cellar");
        helloText.setLocalTranslation(320, helloText.getLineHeight(), 0);
        guiNode.attachChild(helloText);
        
        // Load a model from test_data (OgreXML + material + texture)
        Spatial ninja = assetManager.loadModel("Models/Ninja/Ninja.mesh.xml");
        ninja.setName("ninja");
        ninja.scale(0.01f, 0.009f, 0.01f);
        ninja.rotate(0.0f, 1.5f, 0.0f);
        ninja.setLocalTranslation(4.5f, -0.9f, 2.0f);
        rootNode.attachChild(ninja);
        // You must add a light to make the model visible
        DirectionalLight sun = new DirectionalLight();
        sun.setDirection(new Vector3f(5.0f, 0.0f, 2.0f));
        rootNode.addLight(sun);


	}

	@Override
	public void simpleUpdate(float tpf) {
		Spatial ninja = rootNode.getChild("ninja");
		
		ninja.move(-0.001f, 0.0f, 0.0f);
	}

	@Override
	public void simpleRender(RenderManager rm) {
		// TODO: add render code
	}
}
