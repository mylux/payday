package services.output

import entities.Output

class ReturnOutputProvider: OutputProvider {
    override fun provide(output: Output<*>): Output<*> {
        return output
    }
}