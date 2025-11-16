package ai.koog.agents

import ai.koog.prompt.executor.llms.SingleLLMPromptExecutor
import ai.koog.prompt.executor.ollama.client.OllamaClient
import kotlin.test.Test

class CommonTest {
    @Test
    fun compileCheck() {
        SingleLLMPromptExecutor(llmClient = OllamaClient())
    }
}
