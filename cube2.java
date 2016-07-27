import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Frame;

import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;

import com.sun.j3d.utils.applet.MainFrame;
import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.universe.SimpleUniverse;


public class HelloJava3Db extends Applet {
    public BranchGroup createSceneGraph() {
  
  BranchGroup objRoot = new BranchGroup();

  
  Transform3D rotate = new Transform3D();
  Transform3D tempRotate = new Transform3D();

        rotate.rotX(Math.PI/4.0d);
  tempRotate.rotY(Math.PI/5.0d);
        rotate.mul(tempRotate);

  TransformGroup objRotate = new TransformGroup(rotate);

  objRoot.addChild(objRotate);
  objRotate.addChild(new ColorCube(0.4));
  
        objRoot.compile();

  return objRoot;
    } 
    public HelloJava3Db() {
        setLayout(new BorderLayout());
        Canvas3D canvas3D = new Canvas3D(null);
        add("Center", canvas3D);

        BranchGroup scene = createSceneGraph();

        SimpleUniverse simpleU = new SimpleUniverse(canvas3D);

 
        simpleU.getViewingPlatform().setNominalViewingTransform();

        simpleU.addBranchGraph(scene);
    } 

    public static void main(String[] args) {
  Frame frame = new MainFrame(new HelloJava3Db(), 256, 256);
    } 

}
