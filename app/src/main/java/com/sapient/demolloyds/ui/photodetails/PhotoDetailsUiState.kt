
package com.sapient.demolloyds.ui.photodetails

sealed class PhotoDetailsUiState

object LoadingState : PhotoDetailsUiState()
object ContentState : PhotoDetailsUiState()
class ErrorState(val message: String) : PhotoDetailsUiState()
