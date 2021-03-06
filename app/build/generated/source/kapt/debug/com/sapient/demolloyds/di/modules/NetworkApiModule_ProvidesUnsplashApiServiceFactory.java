// Generated by Dagger (https://dagger.dev).
package com.sapient.demolloyds.di.modules;

import com.sapient.demolloyds.data.remote.UnsplashApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkApiModule_ProvidesUnsplashApiServiceFactory implements Factory<UnsplashApiService> {
  private final NetworkApiModule module;

  private final Provider<Retrofit> retrofitProvider;

  public NetworkApiModule_ProvidesUnsplashApiServiceFactory(NetworkApiModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public UnsplashApiService get() {
    return providesUnsplashApiService(module, retrofitProvider.get());
  }

  public static NetworkApiModule_ProvidesUnsplashApiServiceFactory create(NetworkApiModule module,
      Provider<Retrofit> retrofitProvider) {
    return new NetworkApiModule_ProvidesUnsplashApiServiceFactory(module, retrofitProvider);
  }

  public static UnsplashApiService providesUnsplashApiService(NetworkApiModule instance,
      Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.providesUnsplashApiService(retrofit));
  }
}
