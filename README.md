# Filimo - SearchMovie
- An example Search Movie Android App that help you to get Search movies list by input movie name's and displays them in a list .
- This application is implemented using Filimo Search Api(https://www.filimo.com/api/en/v1/movie/movie/list/tagid/1000300/text/{Query}/sug/on) with clean architecture principles, MVVM design pattern,Hilt DI,Kotlin,Coroutines,Kotlin Flow,LiveData,Retrofit,OkHttp,Navigation,dataBinding,etc Libraries and Applying Clean Code using OOP ,SOLID Priciples,Helper Classes and Repository Pattern.


## Table of Contents
* [Setup and Install](#setup_and_nstall)
* [Architecture](#architecture)
* [Technologies Used](#technologies-used)
* [Screenshots](#Screenshots)

## Setup and Install
- Get the source code by : git clone https://github.com/Hafardev/FilimoSearchMovieRepository.git
- Import and Build Project on Android Studio (Electric Eel |2022.1.1 && AGP version 7.4 && Mini required Gradle version 7.5)
- Supported Android Versions : Android 7-Nougat (API level 24) or higher


## Architecture
Implemented MVVM-Clean Architecture as Google's recommendation. Model-View-ViewModel (MVVM) is a software design pattern that is structured to separate program logic and user interface controls and Clean Architecture is a code development approach and a structure that adopts SOLID principles.
- data : The data layer contains Api ,DB ,Mapper ,Models and Repository (implemention of domain repository interface's). This layer provide a single source of truth for data. 
- domain : The domain layer contains interface of data repository's and interface of data_class_model's and the UseCases that encapsulate a single and very specific task that can be performed. This task is part of the business logic of the application.
- presentation : Layers that interact with the user. This layer includes Activity, Fragment, ViewModel classes etc.


## Technologies Used
- [Kotlin](https://kotlinlang.org/)
- [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) : A coroutine is a concurrency design pattern that you can use on Android to simplify code that executes asynchronously and it's light-weight threads that allow you to write asynchronous non-blocking code.
- [Flow](https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/) : Flow is an asynchronous cold stream of elements and emmit data after collecting that.
- [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) : for dependency injection.
- [Retrofit](https://github.com/square/retrofit) : Used for REST api communication.
- [OkHttp](https://square.github.io/okhttp/) : HTTP client that allows all requests to the same host to share a socket.
- [Glide](https://bumptech.github.io/glide/) : Glide is a fast and efficient image loading library for Android.
- [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) : For reactive style programming (from VM to UI).
- [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) : Stores and manages UI-related data and presentation logic in a lifeCycle-conscious way and survives configuration changes and isn't destroyed on UI changes.ViewModel objects are automatically retained during configuration changes so that survive data.
- [Navigation](https://developer.android.com/guide/navigation/get-started) : Used to navigate between fragments
- [Data Binding](https://developer.android.com/topic/libraries/data-binding) : Used to bind data in code to view in your XML layouts.


## Screenshots
![Screenshot](https://user-images.githubusercontent.com/127316982/253751752-0d726040-fe8c-45f3-9b46-d611581ed83f.jpg)
![Screenshot](https://user-images.githubusercontent.com/127316982/253751765-78e599ee-9f76-4048-8fa1-f4dcf2438762.jpg)
