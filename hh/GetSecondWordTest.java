package lesson11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GetSecondWordTest {
    @Test
    public void testAllCases() {
        Assertions.assertEquals(
                null,
                Lesson11HomeWork.getSecondWord(null)
        );
        Assertions.assertEquals(
                null,
                Lesson11HomeWork.getSecondWord("")
        );
        Assertions.assertEquals(
                null,
                Lesson11HomeWork.getSecondWord("море")
        );
        Assertions.assertEquals(
                "мыла",
                Lesson11HomeWork.getSecondWord("маша мыла раму")
        );
    }
}
