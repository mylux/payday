package usecases

import entities.Output

interface Usecase {
    fun run(params: Map<String, String>): Output<*>
}