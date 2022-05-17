// Generated by Dagger (https://dagger.dev).
package com.sapient.demolloyds.di.modules;

import android.app.Application;
import com.sapient.demolloyds.utils.StringUtils;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_ProvideStringUtilsFactory implements Factory<StringUtils> {
  private final RepositoryModule module;

  private final Provider<Application> appProvider;

  public RepositoryModule_ProvideStringUtilsFactory(RepositoryModule module,
      Provider<Application> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public StringUtils get() {
    return provideStringUtils(module, appProvider.get());
  }

  public static RepositoryModule_ProvideStringUtilsFactory create(RepositoryModule module,
      Provider<Application> appProvider) {
    return new RepositoryModule_ProvideStringUtilsFactory(module, appProvider);
  }

  public static StringUtils provideStringUtils(RepositoryModule instance, Application app) {
    return Preconditions.checkNotNullFromProvides(instance.provideStringUtils(app));
  }
}
