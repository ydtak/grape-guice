package ydtak.guiceexample;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

  // Steps to enable linking for auto-generated files (for Autofactory) in IDEA:
  //   File > Settings > Build, Execution, Development > Compiler > Annotation Processors
  //   - Enable annotation processing
  //   - Module content root
  //   - Production sources directory: "generated"
  //   - Test sources directory: "generated_tests"
  //   Build > Rebuild Project (this should create auto-generated files in "generated" directory)
  //   File > Project Structure > Modules > Sources
  //   - Mark "generated" and "generated_tests" as "Sources"
  //
  // Rerun Build > Rebuild Project as necessary to update auto-generated files.

  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new ApplicationModule());
    Application application = injector.getInstance(Application.class);
    application.run();
  }
}
