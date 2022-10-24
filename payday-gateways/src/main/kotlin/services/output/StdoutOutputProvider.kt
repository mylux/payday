package services.output

import entities.Output

class StdoutOutputProvider : OutputProvider {
    override fun provide(output: Output<*>): Output<*> {
        println(output.value)
        return output
    }
}