package ydtak.grapeguice.juice;

import javax.inject.Inject;

public class Juicy {

  @Inject
  public Juicy() {
  }

  public String get() {
    return "juicy";
  }
}
