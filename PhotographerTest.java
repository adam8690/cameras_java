import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class PhotographerTest{
  Camera camera;
  Photographer photographer;
  ArrayList<Camera> cameras;
  DigitalCamera digitalcamera;
  AnalogCamera analogcamera;


  @Before
  public void before(){
  photographer = new Photographer();
  cameras = new ArrayList<Camera>();
  digitalcamera = new DigitalCamera();
  analogcamera = new AnalogCamera();
  }

  @Test
  public void cameraAdded(){
    photographer.addCamera(camera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void cameraRemoved(){
    photographer.addCamera(camera);
    photographer.removeCamera(camera);
    assertEquals(0, photographer.cameraCount());
  }

  @Test 
  public void digitalCameraAdded(){
    photographer.addCamera(digitalcamera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void analogCameraDetails(){
    photographer.addCamera(analogcamera);
    assertEquals("Analog camera", analogcamera.getDetails());
  }

}