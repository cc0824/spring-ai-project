package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AiTest {

	@Autowired
	private OpenAiChatModel chatModel;

	@Test
	public void test() {
		System.out.println(this.chatModel.call("hi"));
	}
}
