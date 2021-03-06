// Generated by Dagger (https://dagger.dev).
package com.sapient.demolloyds;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.sapient.demolloyds.data.remote.UnsplashApiService;
import com.sapient.demolloyds.data.repository.ImagineRepository;
import com.sapient.demolloyds.data.usecases.FetchPopularPhotosUsecase;
import com.sapient.demolloyds.data.usecases.SearchPhotosUsecase;
import com.sapient.demolloyds.di.modules.NetworkApiModule;
import com.sapient.demolloyds.di.modules.NetworkApiModule_ProvidesOkHttpClientFactory;
import com.sapient.demolloyds.di.modules.NetworkApiModule_ProvidesRetrofitFactory;
import com.sapient.demolloyds.di.modules.NetworkApiModule_ProvidesUnsplashApiServiceFactory;
import com.sapient.demolloyds.di.modules.RepositoryModule;
import com.sapient.demolloyds.di.modules.RepositoryModule_ProvideImagineRepositoryFactory;
import com.sapient.demolloyds.di.modules.RepositoryModule_ProvideStringUtilsFactory;
import com.sapient.demolloyds.ui.MainActivity;
import com.sapient.demolloyds.ui.home.HomeFragment;
import com.sapient.demolloyds.ui.home.HomeViewModel;
import com.sapient.demolloyds.ui.home.HomeViewModel_HiltModules_KeyModule_ProvideFactory;
import com.sapient.demolloyds.ui.photodetails.PhotoDetailsFragment;
import com.sapient.demolloyds.ui.photodetails.PhotoDetailsViewModel;
import com.sapient.demolloyds.ui.photodetails.PhotoDetailsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.sapient.demolloyds.utils.StringUtils;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerDemoLloydsApp_HiltComponents_SingletonC extends DemoLloydsApp_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private final RepositoryModule repositoryModule;

  private final NetworkApiModule networkApiModule;

  private volatile Object stringUtils = new MemoizedSentinel();

  private volatile Object okHttpClient = new MemoizedSentinel();

  private volatile Object retrofit = new MemoizedSentinel();

  private volatile Object unsplashApiService = new MemoizedSentinel();

  private volatile Object imagineRepository = new MemoizedSentinel();

  private DaggerDemoLloydsApp_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam,
      NetworkApiModule networkApiModuleParam, RepositoryModule repositoryModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    this.repositoryModule = repositoryModuleParam;
    this.networkApiModule = networkApiModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private StringUtils stringUtils() {
    Object local = stringUtils;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = stringUtils;
        if (local instanceof MemoizedSentinel) {
          local = RepositoryModule_ProvideStringUtilsFactory.provideStringUtils(repositoryModule, ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
          stringUtils = DoubleCheck.reentrantCheck(stringUtils, local);
        }
      }
    }
    return (StringUtils) local;
  }

  private OkHttpClient okHttpClient() {
    Object local = okHttpClient;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = okHttpClient;
        if (local instanceof MemoizedSentinel) {
          local = NetworkApiModule_ProvidesOkHttpClientFactory.providesOkHttpClient(networkApiModule);
          okHttpClient = DoubleCheck.reentrantCheck(okHttpClient, local);
        }
      }
    }
    return (OkHttpClient) local;
  }

  private Retrofit retrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = NetworkApiModule_ProvidesRetrofitFactory.providesRetrofit(networkApiModule, okHttpClient());
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private UnsplashApiService unsplashApiService() {
    Object local = unsplashApiService;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = unsplashApiService;
        if (local instanceof MemoizedSentinel) {
          local = NetworkApiModule_ProvidesUnsplashApiServiceFactory.providesUnsplashApiService(networkApiModule, retrofit());
          unsplashApiService = DoubleCheck.reentrantCheck(unsplashApiService, local);
        }
      }
    }
    return (UnsplashApiService) local;
  }

  private ImagineRepository imagineRepository() {
    Object local = imagineRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = imagineRepository;
        if (local instanceof MemoizedSentinel) {
          local = RepositoryModule_ProvideImagineRepositoryFactory.provideImagineRepository(repositoryModule, stringUtils(), unsplashApiService());
          imagineRepository = DoubleCheck.reentrantCheck(imagineRepository, local);
        }
      }
    }
    return (ImagineRepository) local;
  }

  @Override
  public void injectDemoLloydsApp(DemoLloydsApp demoLloydsApp) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private NetworkApiModule networkApiModule;

    private RepositoryModule repositoryModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder networkApiModule(NetworkApiModule networkApiModule) {
      this.networkApiModule = Preconditions.checkNotNull(networkApiModule);
      return this;
    }

    public Builder repositoryModule(RepositoryModule repositoryModule) {
      this.repositoryModule = Preconditions.checkNotNull(repositoryModule);
      return this;
    }

    public DemoLloydsApp_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (networkApiModule == null) {
        this.networkApiModule = new NetworkApiModule();
      }
      if (repositoryModule == null) {
        this.repositoryModule = new RepositoryModule();
      }
      return new DaggerDemoLloydsApp_HiltComponents_SingletonC(applicationContextModule, networkApiModule, repositoryModule);
    }
  }

  private final class ActivityRetainedCBuilder implements DemoLloydsApp_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public DemoLloydsApp_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends DemoLloydsApp_HiltComponents.ActivityRetainedC {
    private volatile Object lifecycle = new MemoizedSentinel();

    private ActivityRetainedCImpl() {

    }

    private Object lifecycle() {
      Object local = lifecycle;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = lifecycle;
          if (local instanceof MemoizedSentinel) {
            local = ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();
            lifecycle = DoubleCheck.reentrantCheck(lifecycle, local);
          }
        }
      }
      return (Object) local;
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycle();
    }

    private final class ActivityCBuilder implements DemoLloydsApp_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public DemoLloydsApp_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends DemoLloydsApp_HiltComponents.ActivityC {
      private ActivityCImpl(Activity activity) {

      }

      private Set<String> keySetSetOfString() {
        return SetBuilder.<String>newSetBuilder(2).add(HomeViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(PhotoDetailsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerDemoLloydsApp_HiltComponents_SingletonC.this.applicationContextModule), keySetSetOfString(), new ViewModelCBuilder(), Collections.<ViewModelProvider.Factory>emptySet(), Collections.<ViewModelProvider.Factory>emptySet());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements DemoLloydsApp_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public DemoLloydsApp_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends DemoLloydsApp_HiltComponents.FragmentC {
        private FragmentCImpl(Fragment fragment) {

        }

        @Override
        public void injectHomeFragment(HomeFragment homeFragment) {
        }

        @Override
        public void injectPhotoDetailsFragment(PhotoDetailsFragment photoDetailsFragment) {
        }

        @Override
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
          return ActivityCImpl.this.getHiltInternalFactoryFactory();
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements DemoLloydsApp_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public DemoLloydsApp_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends DemoLloydsApp_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements DemoLloydsApp_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public DemoLloydsApp_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends DemoLloydsApp_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }
    }

    private final class ViewModelCBuilder implements DemoLloydsApp_HiltComponents.ViewModelC.Builder {
      private SavedStateHandle savedStateHandle;

      @Override
      public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
        this.savedStateHandle = Preconditions.checkNotNull(handle);
        return this;
      }

      @Override
      public DemoLloydsApp_HiltComponents.ViewModelC build() {
        Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
        return new ViewModelCImpl(savedStateHandle);
      }
    }

    private final class ViewModelCImpl extends DemoLloydsApp_HiltComponents.ViewModelC {
      private volatile Provider<HomeViewModel> homeViewModelProvider;

      private volatile Provider<PhotoDetailsViewModel> photoDetailsViewModelProvider;

      private ViewModelCImpl(SavedStateHandle savedStateHandle) {

      }

      private FetchPopularPhotosUsecase fetchPopularPhotosUsecase() {
        return new FetchPopularPhotosUsecase(DaggerDemoLloydsApp_HiltComponents_SingletonC.this.imagineRepository());
      }

      private SearchPhotosUsecase searchPhotosUsecase() {
        return new SearchPhotosUsecase(DaggerDemoLloydsApp_HiltComponents_SingletonC.this.imagineRepository());
      }

      private HomeViewModel homeViewModel() {
        return new HomeViewModel(fetchPopularPhotosUsecase(), searchPhotosUsecase());
      }

      private Provider<HomeViewModel> homeViewModelProvider() {
        Object local = homeViewModelProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          homeViewModelProvider = (Provider<HomeViewModel>) local;
        }
        return (Provider<HomeViewModel>) local;
      }

      private Provider<PhotoDetailsViewModel> photoDetailsViewModelProvider() {
        Object local = photoDetailsViewModelProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          photoDetailsViewModelProvider = (Provider<PhotoDetailsViewModel>) local;
        }
        return (Provider<PhotoDetailsViewModel>) local;
      }

      @Override
      public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
        return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(2).put("com.sapient.demollyods.ui.home.HomeViewModel", (Provider) homeViewModelProvider()).put("com.sapient.demollyods.ui.photodetails.PhotoDetailsViewModel", (Provider) photoDetailsViewModelProvider()).build();
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.sapient.demollyods.ui.home.HomeViewModel 
            return (T) ViewModelCImpl.this.homeViewModel();

            case 1: // com.sapient.demollyods.ui.photodetails.PhotoDetailsViewModel 
            return (T) new PhotoDetailsViewModel();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements DemoLloydsApp_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public DemoLloydsApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends DemoLloydsApp_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}
