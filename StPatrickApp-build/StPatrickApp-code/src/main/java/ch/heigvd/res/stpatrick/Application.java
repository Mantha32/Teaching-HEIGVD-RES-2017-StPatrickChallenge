package ch.heigvd.res.stpatrick;


/**
 * 
 * @author Olivier Liechti
 * @author Rafidimalala
 */
public class Application {

  IStreamProcessorsFactory processorsFactory = new StreamProcessorsFactory();
  
  public IStreamProcessorsFactory getStreamProcessorsFactory() {
    return processorsFactory;
  }

}
