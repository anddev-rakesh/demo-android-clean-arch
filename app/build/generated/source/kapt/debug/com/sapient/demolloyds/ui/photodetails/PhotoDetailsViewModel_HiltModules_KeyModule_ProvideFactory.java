// Generated by Dagger (https://dagger.dev).
package com.sapient.demolloyds.ui.photodetails;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PhotoDetailsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static PhotoDetailsViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(PhotoDetailsViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final PhotoDetailsViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new PhotoDetailsViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
