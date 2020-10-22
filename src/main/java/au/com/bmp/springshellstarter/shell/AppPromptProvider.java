package au.com.bmp.springshellstarter.shell;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;

@Component
public class AppPromptProvider implements PromptProvider
{

    @Value("${bmp.shell.prompt}")
    private String prompt;

    @Override
    public AttributedString getPrompt()
    {
        return new AttributedString(prompt+":>", AttributedStyle.DEFAULT.foreground(AttributedStyle.BLUE)
        );
    }
}