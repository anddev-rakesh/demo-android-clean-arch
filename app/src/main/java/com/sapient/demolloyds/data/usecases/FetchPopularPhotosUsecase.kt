
package com.sapient.demolloyds.data.usecases

import com.sapient.demolloyds.data.repository.ImagineRepository
import com.sapient.demolloyds.utils.AppConstants
import javax.inject.Inject

/**
 * A use-case to load the popular photos from Unsplash API.
 * @author and.dev-rakesh
 */
class FetchPopularPhotosUsecase @Inject constructor(private val repository: ImagineRepository) {
    suspend operator fun invoke(
        pageNum: Int = 1,
        pageSize: Int = AppConstants.API.PHOTOS_PER_PAGE,
        orderBy: String = "popular"
    ) = repository.loadPhotos(
        pageNumber = pageNum,
        pageSize = pageSize,
        orderBy = orderBy
    )
}
