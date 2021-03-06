
package com.sapient.demolloyds.data.repository

import androidx.annotation.WorkerThread
import com.sapient.demolloyds.data.DataState
import com.sapient.demolloyds.data.remote.UnsplashApiService
import com.sapient.demolloyds.data.remote.message
import com.sapient.demolloyds.data.remote.onErrorSuspend
import com.sapient.demolloyds.data.remote.onExceptionSuspend
import com.sapient.demolloyds.data.remote.onSuccessSuspend
import com.sapient.demolloyds.model.PhotoModel
import com.sapient.demolloyds.utils.StringUtils
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

/**
 * This is an implementation of [ImagineRepository] to handle communication with [UnsplashApiService] server.
 * @author Wajahat Karim
 */
class ImagineRepositoryImpl @Inject constructor(
    private val stringUtils: StringUtils,
    private val apiService: UnsplashApiService
) : ImagineRepository {

    @WorkerThread
    override suspend fun loadPhotos(
        pageNumber: Int,
        pageSize: Int,
        orderBy: String
    ): Flow<DataState<List<PhotoModel>>> {
        return flow {
            apiService.loadPhotos(pageNumber, pageSize, orderBy).apply {
                this.onSuccessSuspend {
                    data?.let {
                        emit(DataState.success(it))
                    }
                }
                // handle the case when the API request gets an error response.
                // e.g. internal server error.
            }.onErrorSuspend {
                emit(DataState.error<List<PhotoModel>>(message()))

                // handle the case when the API request gets an exception response.
                // e.g. network connection error.
            }.onExceptionSuspend {
                if (this.exception is IOException) {
                    emit(DataState.error<List<PhotoModel>>(stringUtils.noNetworkErrorMessage()))
                } else {
                    emit(DataState.error<List<PhotoModel>>(stringUtils.somethingWentWrong()))
                }
            }
        }
    }

    override suspend fun searchPhotos(
        query: String,
        pageNumber: Int,
        pageSize: Int
    ): Flow<DataState<List<PhotoModel>>> {
        return flow {
            apiService.searchPhotos(query, pageNumber, pageSize).apply {
                this.onSuccessSuspend {
                    data?.let {
                        emit(DataState.success(it.photosList))
                    }
                }
                // handle the case when the API request gets an error response.
                // e.g. internal server error.
            }.onErrorSuspend {
                emit(DataState.error<List<PhotoModel>>(message()))

                // handle the case when the API request gets an exception response.
                // e.g. network connection error.
            }.onExceptionSuspend {
                if (this.exception is IOException) {
                    emit(DataState.error<List<PhotoModel>>(stringUtils.noNetworkErrorMessage()))
                } else {
                    emit(DataState.error<List<PhotoModel>>(stringUtils.somethingWentWrong()))
                }
            }
        }
    }
}
