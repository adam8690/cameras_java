import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class PhotographerTest{
  Camera camera;
  Photographer photographer;
  ArrayList<Camera> cameras;


  @Before
  public void before(){
  photographer = new Photographer();
  cameras = new ArrayList<Camera>();
  }

  @Test
  public void cameraAdded(){
    photographer.addCamera(camera);
    assertEquals(1, photographer.cameraCount());
  }

}