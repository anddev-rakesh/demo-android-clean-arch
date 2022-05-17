
package com.sapient.demolloyds.di.modules

import android.app.Application
import com.sapient.demolloyds.data.remote.UnsplashApiService
import com.sapient.demolloyds.data.repository.ImagineRepository
import com.sapient.demolloyds.data.repository.ImagineRepositoryImpl
import com.sapient.demolloyds.utils.StringUtils
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * The Dagger Module for providing repository instances.
 * @author and.dev-rakesh
 */
@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideStringUtils(app: Application): StringUtils {
        return StringUtils(app)
    }

    @Singleton
    @Provides
    fun provideImagineRepository(stringUtils: StringUtils, apiService: UnsplashApiService): ImagineRepository {
        return ImagineRepositoryImpl(stringUtils, apiService)
    }
}
