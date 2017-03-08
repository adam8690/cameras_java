import java.util.*;

public class Photographer{
  private ArrayList<Camera> cameras;

  public Photographer(){
    this.cameras = new ArrayList<Camera>();
  }

  public void addCamera(Camera camera){
    cameras.add(camera);
  }
  
  public void removeCamera(Camera camera){
    cameras.remove(camera);
  }

  public int cameraCount(){
    return cameras.size();
  }

}