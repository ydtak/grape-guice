package ydtak.guiceexample;

import com.google.inject.AbstractModule;
import ydtak.guiceexample.juice.JuiceModule;

public class ApplicationModule extends AbstractModule {

  @Override
  protected void configure() {
    install(new JuiceModule());
  }
}
