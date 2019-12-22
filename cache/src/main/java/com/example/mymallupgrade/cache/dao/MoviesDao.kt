package com.example.mymallupgrade.cache.dao

import androidx.room.*
import com.example.mymallupgrade.cache.model.MovieCache
import io.reactivex.Completable

/**
 * Created by Tran Phu Nguyen on 12/20/2019.
 */
@Dao
interface MoviesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveMovie(movie: MovieCache): Completable

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveMovies(movies: List<MovieCache>): Completable

    @Delete
    fun removeMovie(movie: MovieCache)

    @Query("DELETE FROM movies")
    fun clear()
}