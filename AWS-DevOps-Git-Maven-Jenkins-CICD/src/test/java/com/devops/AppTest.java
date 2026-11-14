package com.devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AppTest {
    @Test
    void messageMentionsPipeline() {
        assertTrue(App.message().contains("AWS DevOps CI/CD"));
    }
}
