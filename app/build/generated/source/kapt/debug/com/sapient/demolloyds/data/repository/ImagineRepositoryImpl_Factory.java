// Generated by Dagger (https://dagger.dev).
package com.sapient.demolloyds.data.repository;

import com.sapient.demolloyds.data.remote.UnsplashApiService;
import com.sapient.demolloyds.utils.StringUtils;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ImagineRepositoryImpl_Factory implements Factory<ImagineRepositoryImpl> {
  private final Provider<StringUtils> stringUtilsProvider;

  private final Provider<UnsplashApiService> apiServiceProvider;

  public ImagineRepositoryImpl_Factory(Provider<StringUtils> stringUtilsProvider,
      Provider<UnsplashApiService> apiServiceProvider) {
    this.stringUtilsProvider = stringUtilsProvider;
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public ImagineRepositoryImpl get() {
    return newInstance(stringUtilsProvider.get(), apiServiceProvider.get());
  }

  public static ImagineRepositoryImpl_Factory create(Provider<StringUtils> stringUtilsProvider,
      Provider<UnsplashApiService> apiServiceProvider) {
    return new ImagineRepositoryImpl_Factory(stringUtilsProvider, apiServiceProvider);
  }

  public static ImagineRepositoryImpl newInstance(StringUtils stringUtils,
      UnsplashApiService apiService) {
    return new ImagineRepositoryImpl(stringUtils, apiService);
  }
}
