package me.dio.portfolioapp.data.repositories

import kotlinx.coroutines.flow.Flow
import me.dio.portfolioapp.data.model.Repo

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}