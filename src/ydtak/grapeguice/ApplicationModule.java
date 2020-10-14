package ydtak.grapeguice;

import com.google.inject.AbstractModule;
import ydtak.grapeguice.juice.JuiceModule;

public class ApplicationModule extends AbstractModule {

  @Override
  protected void configure() {
    install(new JuiceModule());
  }
}
