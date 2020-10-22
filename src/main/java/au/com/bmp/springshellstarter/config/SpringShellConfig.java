package au.com.bmp.springshellstarter.config;

import au.com.bmp.springshellstarter.shell.ShellHelper;
import org.jline.terminal.Terminal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class SpringShellConfig
{

    @Bean
    public ShellHelper shellHelper(@Lazy Terminal terminal)
    {
        return new ShellHelper(terminal);
    }

}