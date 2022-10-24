package services.output

import entities.Output

interface OutputProvider {
    fun provide(output: Output<*>): Output<*>
}