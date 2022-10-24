package application.main

import application.communication.cli.CliArgs
import entities.Output
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import services.output.OutputProvider
import services.output.ReturnOutputProvider
import services.output.StdoutOutputProvider
import usecases.IsTodayNthBusinessDay
import usecases.Usecase
import usecases.enums.Operation
import java.util.function.Supplier


@ComponentScan(basePackages = ["components", "repositories", "services", "application", "usecases"])
@SpringBootApplication
class EntryPoint {
    private val context: AnnotationConfigApplicationContext = AnnotationConfigApplicationContext()
    fun cli(args: Array<String>){
        val parsedArguments: Map<String, String> = CliArgs.parse(args)
        context.registerBean("applicationArgs", Map::class.java, Supplier { parsedArguments })
        context.register(EntryPoint::class.java)
        context.registerBean(OutputProvider::class.java, Supplier { StdoutOutputProvider() })
        context.refresh()
        context.getBean("selectedUsecase", Usecase::class.java).run(parsedArguments)
    }

    fun apiTodayPreLoad(){
        context.register(EntryPoint::class.java)
        context.registerBean(OutputProvider::class.java, Supplier{ReturnOutputProvider()})
    }

    fun apiToday(args: Map<String, String>): Boolean{
        val parsedArguments = args + mapOf("operation" to "is-today-nth-business-day")
        context.registerBean("applicationArgs", Map::class.java, Supplier { parsedArguments })
        context.refresh()
        println("Will run")
        return context.getBean(IsTodayNthBusinessDay::class.java).run(parsedArguments).value as Boolean
    }
}