package me.dio.portfolioapp.domain

import kotlinx.coroutines.flow.Flow
import me.dio.portfolioapp.core.UseCase
import me.dio.portfolioapp.data.model.Repo
import me.dio.portfolioapp.data.repositories.RepoRepository

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}