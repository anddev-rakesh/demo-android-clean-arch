
package com.sapient.demolloyds.data.usecases

import com.sapient.demolloyds.data.repository.ImagineRepository
import com.sapient.demolloyds.utils.AppConstants
import javax.inject.Inject

/**
 * A use-case to search photos from Unsplash API.
 * @author and.dev-rakesh
 */
class SearchPhotosUsecase @Inject constructor(private val repository: ImagineRepository) {
    suspend operator fun invoke(
        query: String,
        pageNum: Int = 1,
        pageSize: Int = AppConstants.API.PHOTOS_PER_PAGE
    ) = repository.searchPhotos(
        query = query,
        pageNumber = pageNum,
        pageSize = pageSize
    )
}
