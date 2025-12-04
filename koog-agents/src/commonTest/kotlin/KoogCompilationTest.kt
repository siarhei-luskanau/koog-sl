import ai.koog.agents.core.agent.AIAgent
import ai.koog.prompt.executor.model.PromptExecutor
import ai.koog.prompt.llm.LLModel
import kotlin.test.Test

class KoogCompilationTest {

    @Test
    fun test() {
        listOf(
            AIAgent::class,
            PromptExecutor::class,
            LLModel::class,
        )
    }
}
