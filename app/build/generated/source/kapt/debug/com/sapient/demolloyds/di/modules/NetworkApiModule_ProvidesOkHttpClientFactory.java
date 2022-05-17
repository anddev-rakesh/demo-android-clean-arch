// Generated by Dagger (https://dagger.dev).
package com.sapient.demolloyds.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.OkHttpClient;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkApiModule_ProvidesOkHttpClientFactory implements Factory<OkHttpClient> {
  private final NetworkApiModule module;

  public NetworkApiModule_ProvidesOkHttpClientFactory(NetworkApiModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return providesOkHttpClient(module);
  }

  public static NetworkApiModule_ProvidesOkHttpClientFactory create(NetworkApiModule module) {
    return new NetworkApiModule_ProvidesOkHttpClientFactory(module);
  }

  public static OkHttpClient providesOkHttpClient(NetworkApiModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesOkHttpClient());
  }
}